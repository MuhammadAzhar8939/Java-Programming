import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener {
    // below button,textfield1 and textfield2 are public cause we will use them to
    // implement actionListner in our seprate function
    JButton addBtn, subBtn, mulBtn, divBtn;
    JTextField textField1;
    JTextField textField2;

    MainFrame() {
        // Textfiel
        textField1 = new JTextField();// constructor for textfield1
        textField1.setBounds(250, 100, 150, 30);// setting width and height and also where to place on screen
        textField1.setForeground(Color.white);// setting content color of textfield
        textField1.setBackground(new Color(0x134f5c));// setting background color
        textField1.setCaretColor(Color.white);// cursor color
        textField1.setFont(new Font(null, Font.PLAIN, 25));// setting font size etc
        textField2 = new JTextField();
        textField2.setBounds(250, 150, 150, 30);
        textField2.setForeground(Color.white);
        textField2.setBackground(new Color(0x134f5c));
        textField2.setCaretColor(Color.white);
        textField2.setFont(new Font(null, Font.PLAIN, 25));
        // labels
        JLabel label1 = new JLabel();
        label1.setText("Enter Your First Number ");
        label1.setBounds(50, 100, 200, 30);
        label1.setForeground(Color.white);
        JLabel label2 = new JLabel();
        label2.setText("Enter Your Second Number ");
        label2.setBounds(50, 150, 200, 30);
        label2.setForeground(Color.white);
        // button
        addBtn = new JButton();
        addBtn.setText("Add");
        addBtn.setBounds(50, 220, 80, 30);
        addBtn.setFocusable(false);// remove the focus
        addBtn.setBackground(new Color(0x134f5c));
        addBtn.setForeground(Color.white);
        subBtn = new JButton();
        subBtn.setText("Subtract");
        subBtn.setBounds(140, 220, 90, 30);
        subBtn.setFocusable(false);// remove the focus
        subBtn.setBackground(new Color(0x134f5c));
        subBtn.setForeground(Color.white);
        mulBtn = new JButton();
        mulBtn.setText("Multiply");
        mulBtn.setBounds(240, 220, 80, 30);
        mulBtn.setFocusable(false);// remove the focus
        mulBtn.setBackground(new Color(0x134f5c));
        mulBtn.setForeground(Color.white);
        divBtn = new JButton();
        divBtn.setText("Divide");
        divBtn.setBounds(330, 220, 80, 30);
        divBtn.setFocusable(false);// remove the focus
        divBtn.setBackground(new Color(0x134f5c));
        divBtn.setForeground(Color.white);
        addBtn.addActionListener(this);// adding actionlistner to button // this means we will use function of this
                                       // class to implement
        subBtn.addActionListener(this);// adding actionlistner to button // this means we will use function of this
                                       // class to implement
        mulBtn.addActionListener(this);// adding actionlistner to button // this means we will use function of this
                                       // class to implement
        divBtn.addActionListener(this);// adding actionlistner to button // this means we will use function of this
                                       // class to implement
        // adding component to frame
        this.add(textField1);
        this.add(textField2);
        this.add(label2);
        this.add(label1);
        this.add(addBtn);
        this.add(subBtn);
        this.add(mulBtn);
        this.add(divBtn);

        // frame settings
        setSize(500, 600);// setting size
        setTitle("Assignment 02 ");
        this.getContentPane().setBackground(new Color(0x1b1c22));// background color of JFrame
        this.setLayout(new BorderLayout());// setting layout for our JFrame
        setMinimumSize(new Dimension(300, 400));// minimum size of JFrame //Optional
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// exit the application when click on close
        setVisible(true);// show this JFrame
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // grabing values from textfields
        String num1 = textField1.getText();
        String num2 = textField2.getText();
        // just converting string to integer
        int n1 = Integer.valueOf(num1);
        int n2 = Integer.valueOf(num2);

        if (e.getSource() == addBtn) {
            output(n1, n2, '+');
        } else if (e.getSource() == subBtn) {
            output(n1, n2, '-');
        } else if (e.getSource() == mulBtn) {
            output(n1, n2, '*');
        } else if (e.getSource() == divBtn) {
            output(n1, n2, '/');
        }
    }

    public void output(int n1, int n2, Character operator) {
        int n3 = 0;
        switch (operator) {
            case '+':
                n3 = n1 + n2;
                break;
            case '-':
                n3 = n1 - n2;
                break;
            case '/':
                if (n2 == 0) {
                    JOptionPane.showMessageDialog(this, "Cannot Divide by Zero", "Output",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    n3 = n1 / n2;
                }
                break;
            case '*':
                n3 = n1 * n2;
                break;

            default:
                JOptionPane.showMessageDialog(this, " Something went wrong, Try Again", "Output",
                        JOptionPane.ERROR_MESSAGE);
                break;
        }

        // Converting The result back to String
        String result = String.valueOf(n3);
        // Displaying the output in messagebox
        JOptionPane.showMessageDialog(this, "Answer of " + n1 + operator + n2 + " is : " + result, "Output",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new MainFrame();// object creation

    }

}
