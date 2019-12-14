
package chat2new;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;


public class TCPConnection {
    
    private final Socket socket;
    private final Thread thread;
    private final DataInputStream input;
    private final DataOutputStream output;
    private final TCPConnectionListener listener;
    
    public TCPConnection(TCPConnectionListener listener, String ipAddr, int port)
        throws IOException {
        // Создаем сокет, используя IP-адрес и порт сервера
        // ... и устанавливаем соединение
        this(listener, new Socket(ipAddr, port));
    }
            
    public TCPConnection(TCPConnectionListener listener, Socket socket) 
        throws IOException {
        this.listener = listener;
        this.socket = socket;
        
        // Берем входной и выходной потоки сокета,чтобы получать и отсылать сообщения
        // ... и конвертируем потоки в другой тип, чтоб легче обрабатывать сообщения
        input  = new DataInputStream(socket.getInputStream());
        output = new DataOutputStream(socket.getOutputStream());
        
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    listener.onConnectionReady(TCPConnection.this);
                    while (!thread.isInterrupted()) {
                        String data = input.readUTF();
                        if (data.equals("SENDFILE"))
                            listener.onReceiveFile(TCPConnection.this);
                        else    
                            listener.onReceiveString(TCPConnection.this, data);
                    }
                    
                } catch (IOException e) {
                    listener.onException(TCPConnection.this, e);
                }
                finally {
                    listener.onDisconnect(TCPConnection.this);
                }
                
            }
        });
        thread.start();
    }

    
    public synchronized void sendString(String value) {
        try {
            // Отсылаем введенную строку текста 
            output.writeUTF(value);
            // Заставляем поток закончить передачу данных
            output.flush();
        } catch (IOException e) {
            listener.onException(TCPConnection.this, e);
            disconnect();
        }
    }
    
    
    public synchronized void sendFile(File file) {
        try {
            output.writeUTF("SENDFILE");
            output.writeLong(file.length());
            output.writeUTF(file.getName());
            FileInputStream fileInput = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int count = 0;
            while ((count = fileInput.read(buffer)) != -1)
                output.write(buffer, 0, count);
            output.flush();
            fileInput.close();
        } catch (IOException e) {
            listener.onException(TCPConnection.this, e);
            disconnect();
        }
    }
    
    
    public synchronized String receiveFile(String folder) {
        try {
            String path = System.getProperty("user.dir") + folder;
            File fileFolder = new File(path);
            fileFolder.mkdir();
            
            long fileSize = input.readLong();
            String fileName = path + "\\" + input.readUTF();
            FileOutputStream fileOutput = new FileOutputStream(fileName);
            byte[] buffer = new byte[1024];
            int count = 0, countSum = 0;
            while ((count = input.read(buffer)) != -1) {
                fileOutput.write(buffer, 0, count);
                countSum += count;
                if (countSum == fileSize)
                    break;
            }
            fileOutput.flush();
            fileOutput.close();
            return fileName;
        } catch (IOException e) {
        }
        return null;
    }
    
    
    public synchronized void disconnect() {
        thread.interrupt();
        try {
            socket.close();
        } catch (IOException e) {
            listener.onException(TCPConnection.this, e);
        }
    }
    
    
    @Override
    public String toString() {
        return "TCPConnection : " + socket.getInetAddress() + " : " + socket.getPort();
    }

}
