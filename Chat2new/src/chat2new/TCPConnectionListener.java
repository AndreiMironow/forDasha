
package chat2new;

public interface TCPConnectionListener {
    //соединение установлено
    void onConnectionReady(TCPConnection tcpConnection);
    //соединение закрыто
    void onDisconnect(TCPConnection tcpConnection);
    //исключение подключения
    void onException(TCPConnection tcpConnection, Exception e);
    //получение строки
    void onReceiveString(TCPConnection tcpConnection, String value);
    //получение файла
    void onReceiveFile(TCPConnection tcpConnection);
}
