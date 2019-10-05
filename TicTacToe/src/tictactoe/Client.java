
package tictactoe;

import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Client extends JFrame
{
    private static final String IP_ADDR = "127.0.0.1";
 
    private static final int PORT = 58901;
    private static final int WIDTH = 300;
    private static final int HEIGHT = 320;

    private JPanel boardPanel = new JPanel();
    private JTextField message = new JTextField(". . .");

    private Square[] board = new Square[9];
    private Square currentSquare;

    private Socket socket;
    private Scanner in;
    private PrintWriter out;
    
    
    public static void main(String[] args) throws Exception
    {
        Client client = new Client();
        client.play();
    }
    
    
    private Client() throws Exception
    {
        socket = new Socket(IP_ADDR, PORT);
        in = new Scanner(socket.getInputStream());
        out = new PrintWriter(socket.getOutputStream(), true);

        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(WIDTH, HEIGHT);
        super.setVisible(true);
        super.setResizable(false);
        super.setLocationRelativeTo(null);
        super.setAlwaysOnTop(true);
        
        message.setBackground(Color.white);
        message.setEditable(false);
        message.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        message.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
        
        boardPanel.setBackground(Color.black);
        boardPanel.setLayout(new GridLayout(3, 3, 1, 1));
        boardPanel.setBorder(BorderFactory.createLineBorder(Color.lightGray, 10));
        
        for(int i = 0; i < board.length; i++)
        {
            final int j = i;
            board[j] = new Square();
            board[j].addMouseListener(new MouseAdapter()
            {
                public void mousePressed(MouseEvent e)
                {
                    currentSquare = board[j];
                    out.println("MOVE " + j);
                }
            });
            boardPanel.add(board[i]);
        }
        
        super.add(message, BorderLayout.SOUTH);
        super.add(boardPanel, BorderLayout.CENTER);
    }


    public void play() throws Exception
    {
        try
        {
            String answer = in.nextLine();
            char mark = answer.charAt(8); //пропускаем "WELCOME "
            char opponentMark = (mark == 'X') ? 'O' : 'X';
            setTitle("Tic Tac Toe :  Player  " + mark);
            while(in.hasNextLine())
            {
                answer = in.nextLine();
                if(answer.startsWith("VALID_MOVE"))
                {
                    message.setText("Ход противника, подождите");
                    currentSquare.setText(mark);
                    currentSquare.repaint();
                }
                else
                if(answer.startsWith("OPPONENT_MOVED"))
                {
                    int loc = Integer.parseInt(answer.substring(15));
                    board[loc].setText(opponentMark);
                    board[loc].repaint();
                    message.setText("Противник сделал ход, ваша очередь");
                }
                else
                if(answer.startsWith("MESSAGE"))
                {
                    message.setText(answer.substring(8));
                }
                else
                if(answer.startsWith("VICTORY"))
                {
                    JOptionPane.showMessageDialog(this, "Вы победили");
                    break;
                }
                else 
                if(answer.startsWith("DEFEAT"))
                {
                    JOptionPane.showMessageDialog(this, "Вы проиграли");
                    break;
                }
                else
                if(answer.startsWith("TIE"))
                {
                    JOptionPane.showMessageDialog(this, "Ничья");
                    break;
                }
                else
                if(answer.startsWith("OTHER_PLAYER_LEFT"))
                {
                    JOptionPane.showMessageDialog(this, "Другой игрок отключился");
                    break;
                }
            }
            out.println("QUIT");
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            socket.close();
            dispose();
        }
    }

    
    static class Square extends JPanel
    {
        JLabel label = new JLabel();

        public Square()
        {
            super.setBackground(Color.white);
            super.setLayout(new GridBagLayout());
            label.setFont(new Font("Arial", Font.BOLD, 40));
            super.add(label);
        }

        public void setText(char text)
        {
            label.setForeground(text == 'X' ? Color.BLUE : Color.RED);
            label.setText(text + "");
        }
    }
}