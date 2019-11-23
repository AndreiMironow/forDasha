
package chat2new;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;


public class Server implements TCPConnectionListener {
    
    //случайный порт (может быть любое число от 1025 до 65535)
    private static final int PORT = 8189;
    
    public static void main(String[] args) {
        new Server();
    }
    
    private final ArrayList<TCPConnection> connections = new ArrayList<>();
    
    
    private Server() {
        System.out.println("Сервер работает . . .");
        // Создаем сокет сервера и привязываем его к вышеуказанному порту
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                try {
                    // Заставляем сервер ждать подключений
                    // ... и устанавливаем соединение
                    new TCPConnection(this, serverSocket.accept());
                } catch(IOException e) {
                    System.out.println("Ошибка соединения : " + e);
                }
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    
    @Override
    public synchronized void onConnectionReady(TCPConnection tcpConnection) {
        connections.add(tcpConnection);
        sendStringToAllConnections("Клиент подключен : " + tcpConnection);
    }

    
    @Override
    public synchronized void onDisconnect(TCPConnection tcpConnection) {
        connections.remove(tcpConnection);
        sendStringToAllConnections("Клиент отключен : " + tcpConnection);
    }

    
    @Override
    public synchronized void onException(TCPConnection tcpConnection, Exception e) {
        System.out.println("Ошибка соединения : " + e);
    }
    
    
    @Override
    public synchronized void onReceiveString(TCPConnection tcpConnection, String value) {
        sendStringToAllConnections(value);
    }
    
    
    @Override
    public synchronized void onReceiveFile(TCPConnection tcpConnection) {
        String path = tcpConnection.receiveFile("");
        File file = new File(path);
        sendStringToAllConnections("Отправлен файл \"" + file.getName() + "\"");
        sendFileToAllConnections(tcpConnection, file);
    }

    
    private void sendStringToAllConnections(String value) {
        System.out.println(value);
        for(int i = 0; i < connections.size(); i++) 
            connections.get(i).sendString(value);
    }


    private void sendFileToAllConnections(TCPConnection tcpConnection, File file) {
        for (int i = 0; i < connections.size(); i++) {
            if (connections.get(i) != tcpConnection)
                connections.get(i).sendFile(file);
        }
        file.delete();
    }

}
