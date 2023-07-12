
//Note here we use simple if else to to keep the complexity level lower although line of code exceeds
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class TicTacToeGame extends JFrame implements ActionListener {
    private JButton[] buttons = new JButton[9];
    private JButton clear;
    private JLabel player;
    private boolean player1 = true;
    private boolean gameEnd = false;
    private JLabel result;

    TicTacToeGame() {
        JPanel boardJPanel = new JPanel();
        boardJPanel.setBounds(100, 100, 200, 200);
        boardJPanel.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            JButton btn = new JButton();
            btn.setFocusable(false);
            buttons[i] = btn;
            buttons[i].addActionListener(this);
            boardJPanel.add(btn);

        }
        // clear buttonn
        clear = new JButton("clear");
        clear.setBounds(150, 330, 100, 30);
        clear.setFocusable(false);
        clear.addActionListener(this);
        this.add(clear);
        // label for player
        player = new JLabel("player 1 turn");
        player.setBounds(150, 30, 100, 30);
        this.add(player);
        // label for result
        result = new JLabel("Winner : ");
        result.setBounds(100, 360, 100, 30);
        this.add(result);

        // setting frame settings
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("TicTacToe");
        this.setBackground(Color.white);
        this.setSize(400, 500);
        this.getContentPane().add(boardJPanel);
        this.setLayout(null);
        this.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new TicTacToeGame();
    }

    private void clearBoard() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setText("");
        }
        player1 = true;
        player.setText("Player 1 turn");
        result.setText("Winer : ");
        gameEnd = false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            clearBoard();
        } else if (gameEnd == true) {
            JOptionPane.showMessageDialog(null, "Press Clear Button To Start New Game ");
        } else {
            for (int i = 0; i < buttons.length; i++) {
                if (e.getSource() == buttons[i]) {
                    if (player1) {
                        buttons[i].setText("O");
                    } else {
                        buttons[i].setText("X");
                    }
                    // combination for row 1
                    if (buttons[0].getText() == "O" && buttons[1].getText() == "O" && buttons[2].getText() == "O") {
                        result.setText("Winner : Player 1");
                        gameEnd = true;
                        return;
                    }
                    if (buttons[0].getText() == "X" && buttons[1].getText() == "X" && buttons[2].getText() == "X") {
                        result.setText("Winner : Player 2");
                        gameEnd = true;

                        return;
                    }
                    // combination for row 2
                    if (buttons[3].getText() == "O" && buttons[4].getText() == "O" && buttons[5].getText() == "O") {
                        result.setText("Winner : Player 1");
                        gameEnd = true;

                        return;
                    }
                    if (buttons[3].getText() == "X" && buttons[4].getText() == "X" && buttons[5].getText() == "X") {
                        result.setText("Winner : Player 2");
                        gameEnd = true;

                        return;
                    }
                    // combination for row 3
                    if (buttons[6].getText() == "O" && buttons[7].getText() == "O" && buttons[8].getText() == "O") {
                        result.setText("Winner : Player 1");
                        gameEnd = true;

                        return;
                    }
                    if (buttons[6].getText() == "X" && buttons[7].getText() == "X" && buttons[8].getText() == "X") {
                        result.setText("Winner : Player 2");
                        gameEnd = true;

                        return;
                    }
                    // combination for column 1
                    if (buttons[0].getText() == "O" && buttons[3].getText() == "O" && buttons[6].getText() == "O") {
                        result.setText("Winner : Player 1");
                        gameEnd = true;

                        return;
                    }
                    if (buttons[0].getText() == "X" && buttons[3].getText() == "X" && buttons[6].getText() == "X") {
                        result.setText("Winner : Player 2");
                        gameEnd = true;

                        return;
                    }
                    // combination for column 2
                    if (buttons[1].getText() == "O" && buttons[4].getText() == "O" && buttons[7].getText() == "O") {
                        result.setText("Winner : Player 1");
                        gameEnd = true;

                        return;
                    }
                    if (buttons[1].getText() == "X" && buttons[4].getText() == "X" && buttons[7].getText() == "X") {
                        result.setText("Winner : Player 2");
                        gameEnd = true;

                        return;
                    }
                    // combination for column 3
                    if (buttons[2].getText() == "O" && buttons[5].getText() == "O" && buttons[8].getText() == "O") {
                        result.setText("Winner : Player 1");
                        gameEnd = true;

                        return;
                    }
                    if (buttons[2].getText() == "X" && buttons[5].getText() == "X" && buttons[8].getText() == "X") {
                        result.setText("Winner : Player 2");
                        gameEnd = true;

                        return;
                    }
                    // combination for Diagonal 1
                    if (buttons[0].getText() == "O" && buttons[4].getText() == "O" && buttons[8].getText() == "O") {
                        result.setText("Winner : Player 1");
                        gameEnd = true;

                        return;
                    }
                    if (buttons[0].getText() == "X" && buttons[4].getText() == "X" && buttons[8].getText() == "X") {
                        result.setText("Winner : Player 2");
                        gameEnd = true;

                        return;
                    }
                    // combination for Diagonal 2
                    if (buttons[2].getText() == "O" && buttons[4].getText() == "O" && buttons[6].getText() == "O") {
                        result.setText("Winner : Player 1");
                        gameEnd = true;

                        return;
                    }
                    if (buttons[2].getText() == "X" && buttons[4].getText() == "X" && buttons[6].getText() == "X") {
                        result.setText("Winner : Player 2");
                        gameEnd = true;

                        return;
                    }

                    player1 = !player1;
                }
                if (player1) {
                    player.setText("Player 1 turn ");
                } else {
                    player.setText("Player 2 turn ");

                }

            }
        }
    }
}
