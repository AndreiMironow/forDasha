
package chat2new;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class Client extends JFrame
        
    implements ActionListener, TCPConnectionListener {
    
    // IP-адрес компьютера, где исполняется серверная программа
    // Здесь указан адрес компьютера где будет исполняться и клиент
    private static final String IP_ADDR = "127.0.0.1";
    // Порт, к которому привязывается сервер
    private static final int PORT = 8189;
    
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;
    
    private final JTextField textName  = new JTextField("");
    private final JTextArea  textLog   = new JTextArea();
    private final JTextField textInput = new JTextField();
    private final JButton    button    = new JButton("Отправить файл");
    
    private TCPConnection connection;
    
    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Client();
            }
        });
    }
    

    private Client() {
        
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        super.setSize(WIDTH, HEIGHT);
        super.setVisible(true);
        super.setLocationRelativeTo(null);
        super.setAlwaysOnTop(true);
        
        textName.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
        textName.setForeground(new java.awt.Color(200, 0, 0));
        
        textLog.setEditable(false);
        textLog.setLineWrap(true);
        
        textInput.addActionListener(this);
        
        JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setViewportView(textLog);
    
        // Определение менеджера расположения
        GroupLayout layout = new GroupLayout(getContentPane());
        super.getContentPane().setLayout(layout);
        
        // Создание горизонтальной группы
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(textName, GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPane1, GroupLayout.Alignment.TRAILING)
                    .addComponent(textInput, GroupLayout.Alignment.TRAILING)
                    .addComponent(button, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        
        // Создание вертикальной группы
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(textName, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(textInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(button)
                .addGap(5, 5, 5))
        );
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JFileChooser dialog = new JFileChooser();             
                int ret = dialog.showDialog(textLog, "Открыть файл");                
                if (ret == JFileChooser.APPROVE_OPTION) {
                    File file = dialog.getSelectedFile();
                    connection.sendFile(file);
                }
            }
        });

        
        try {
            connection = new TCPConnection(this, IP_ADDR, PORT);
        } catch (IOException e) {
            printMsg("Ошибка соединения : " + e);
        }
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = textInput.getText();
        if (msg.equals(""))
            return;
        
        textInput.setText(null);
        connection.sendString(textName.getText() + " : " + msg);
    }

    
    @Override
    public void onConnectionReady(TCPConnection tcpConnection) {
        printMsg("Соединение установлено . . . ");
    }

    
    @Override
    public void onDisconnect(TCPConnection tcpConnection) {
        printMsg("Соединение закрыто");
    }

    
    @Override
    public void onException(TCPConnection tcpConnection, Exception e) {
        printMsg("Ошибка соединения : " + e);
    }
    
    
    @Override
    public void onReceiveString(TCPConnection tcpConnection, String value) {
        printMsg(value);
    }
    
    
    @Override
    public void onReceiveFile(TCPConnection tcpConnection) {
        String path = tcpConnection.receiveFile("\\receiveFile");
        File file = new File(path);
        String fileName = file.getName();

        UIManager.put("OptionPane.yesButtonText", "Да");
        UIManager.put("OptionPane.noButtonText", "Нет");
        
        int resultSave = JOptionPane.showConfirmDialog(
            this.textLog, 
            "Сохранить принятый файл ?",
            "Окно подтверждения", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.ERROR_MESSAGE, 
            null);
                           
        if (resultSave == JOptionPane.YES_OPTION) {
            JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File(fileName));
            int ret = dialog.showDialog(this.textLog, "Сохранить файл");            
            if (ret == JFileChooser.APPROVE_OPTION) {
                File fileSave = dialog.getSelectedFile();
                String fileNameSave = fileSave.getName();
                
                String ext = "";
                int pos = fileName.lastIndexOf('.');
                if (pos > 0)
                    ext = fileName.substring(pos + 1);

                String extS = "";
                int posS = fileNameSave.lastIndexOf('.');
                if (posS > 0)
                    extS = fileNameSave.substring(posS + 1);

                if (!ext.equals(extS)) {
                    JOptionPane.showConfirmDialog(
                        this.textLog, 
                        "Неверно задано расширение !",
                        "Окно подтверждения",
                        JOptionPane.DEFAULT_OPTION);
                    return;
                }

                if (fileSave.exists()) {
                    int result = JOptionPane.showConfirmDialog(
                        this.textLog, 
                        "Файл \"" + fileSave.getName() + "\" существует !!! \nЗаменить ?",
                        "Окно подтверждения", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.ERROR_MESSAGE, 
                        null);
                           
                    if (result == JOptionPane.NO_OPTION)
                        return;
                }

                file.renameTo(new File(fileSave.getAbsolutePath()));
            } 
        }
    }    

    
    private synchronized void printMsg(String msg) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                textLog.append(msg + "\n");
                textLog.setCaretPosition(textLog.getDocument().getLength());
            }
        });
    }
    
}
