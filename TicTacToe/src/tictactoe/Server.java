
package tictactoe;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server
{
    public static void main(String[] args) throws Exception
    {
        try(ServerSocket listener = new ServerSocket(58901)) //создание сокета для сервера (адрес порта)
        {
            System.out.println("Tic Tac Toe Server is Running ...");
            ExecutorService pool = Executors.newFixedThreadPool(200); //интерфейс для создания потоков (не больше 200)
            while(true)
            {
                //запуск новой игры
                Game game = new Game();
                //открываем два потока на одну игру и присваиваем символ
                pool.execute(game.new Player(listener.accept(), 'X'));
                pool.execute(game.new Player(listener.accept(), 'O'));
            }
        }
    }
}

class Game
{
    // Ячейки доски пронумерованы от 0 до 8, сверху вниз, слева направо; null - если пусто
    private Player[] board = new Player[9];

    //текущий игрок
    Player currentPlayer;

    //Определение победителя по 8ми возможным комбинациям
    public boolean hasWinner() //true - есть победитель
    {
        return (board[0] != null && board[0] == board[1] && board[0] == board[2])
            || (board[3] != null && board[3] == board[4] && board[3] == board[5])
            || (board[6] != null && board[6] == board[7] && board[6] == board[8])
            || (board[0] != null && board[0] == board[3] && board[0] == board[6])
            || (board[1] != null && board[1] == board[4] && board[1] == board[7])
            || (board[2] != null && board[2] == board[5] && board[2] == board[8])
            || (board[0] != null && board[0] == board[4] && board[0] == board[8])
            || (board[2] != null && board[2] == board[4] && board[2] == board[6]);
    }

    
    public boolean boardFilledUp() //доска заполнена
    {
        return Arrays.stream(board).allMatch(p -> p != null); //если все ячейки заполнены, возвращает true
    }

    
    //ход игры
    //location - адрес клетки, в которую ставится символ
    public synchronized void move(int location, Player player)
    {
        if(player != currentPlayer)
        {
            throw new IllegalStateException("Не ваша очередь");
        }
        else
        if(player.opponent == null)
        {
            throw new IllegalStateException("У вас еще нет противника");
        }
        else
        if(board[location] != null)
        {
            throw new IllegalStateException("Клетка уже занята");
        }
        
        board[location] = currentPlayer;
        currentPlayer = currentPlayer.opponent;
    }

    
   
    //Игрок идентифицируется знаком персонажа, который является либо «X», либо «O».

    class Player implements Runnable
    {
        char mark; //наш символ - либо «X», либо «O»
        Player opponent;
        Socket socket;
        Scanner input;
        PrintWriter output;

        public Player(Socket socket, char mark) //конструктор
        {
            this.socket = socket;
            this.mark = mark;
        }

        @Override
        public void run()
        {
            try
            {
                setup(); //настройки
                processCommands();
            } catch (Exception e)
            {
                e.printStackTrace();
            } finally
            {
                if(opponent != null && opponent.output != null)
                {
                    opponent.output.println("OTHER_PLAYER_LEFT");
                }
                try
                {
                    socket.close();
                } catch (IOException e)
                {
                }
            }
        }

        private void setup() throws IOException
        {
            input = new Scanner(socket.getInputStream());
            output = new PrintWriter(socket.getOutputStream(), true);
            output.println("WELCOME " + mark);
            if(mark == 'X')
            {
                // Ожидание подключения оппонента
                currentPlayer = this;
                output.println("MESSAGE Ожидаем подключения противника");
            }
            else
            {
                // Ваш ход
                opponent = currentPlayer;
                opponent.opponent = this;
                opponent.output.println("MESSAGE Ваш ход");
            }
        }

        private void processCommands()
        {
            while(input.hasNextLine())
            {
                String command = input.nextLine();
                if(command.startsWith("QUIT"))
                {
                    return;
                }
                else
                if(command.startsWith("MOVE"))
                {
                    processMoveCommand(Integer.parseInt(command.substring(5))); //взять символ после "MOVE " - 5 символов пропускаем
                }
            }
        }

        private void processMoveCommand(int location)
        {
            try
            {
                //в зависимости от исхода игры отправляем команду клиентам
                move(location, this);
                output.println("VALID_MOVE");
                opponent.output.println("OPPONENT_MOVED " + location);
                if(hasWinner())
                {
                    output.println("VICTORY");
                    opponent.output.println("DEFEAT");
                }
                else
                if(boardFilledUp())
                {
                    output.println("TIE");
                    opponent.output.println("TIE");
                }
            } catch (IllegalStateException e)
            {
                output.println("MESSAGE " + e.getMessage());
            }
        }
    }
}