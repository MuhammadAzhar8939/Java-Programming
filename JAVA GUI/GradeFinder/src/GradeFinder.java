
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.text.NumberFormatter;

public class GradeFinder extends JFrame implements ActionListener {
    private JFormattedTextField firstSubjectMarks;
    private JFormattedTextField secondSubjectMarks;
    private JLabel resulJLabel;

    GradeFinder() {

        // label just for title purpose
        JLabel label = new JLabel("Grade Finder");
        label.setBounds(200, 10, 100, 30);
        this.add(label);
        // label for first subject marks
        JLabel fristSubjectLabel = new JLabel("First Subject marks");
        fristSubjectLabel.setBounds(50, 100, 150, 30);
        this.add(fristSubjectLabel);
        // label for first subject marks
        JLabel SecondSubjectLabel = new JLabel("Second Subject marks");
        SecondSubjectLabel.setBounds(50, 150, 150, 30);
        this.add(SecondSubjectLabel);
        // textfield for subject 1 marks input
        firstSubjectMarks = new JFormattedTextField(new NumberFormatter());
        firstSubjectMarks.setBounds(200, 100, 200, 30);
        
        this.add(firstSubjectMarks);
        // textfield for subject 2 marks input
        secondSubjectMarks = new JFormattedTextField(new NumberFormatter());
        secondSubjectMarks.setBounds(200, 150, 200, 30);
        this.add(secondSubjectMarks);
        // button to find grade
        JButton findGrade = new JButton("Find Grade");
        findGrade.setBounds(200, 200, 100, 40);
        findGrade.setFocusable(false);
        findGrade.addActionListener(this);
        this.add(findGrade);
        // result label
        // label for first subject marks
        resulJLabel = new JLabel("Your Result is : ");
        resulJLabel.setBounds(50, 300, 400, 30);
        this.add(resulJLabel);
        // frame settings
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Grade Finder");
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new GradeFinder();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (firstSubjectMarks.getText().isEmpty() || secondSubjectMarks.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty textFields ");
         
        } else {
               int marks1 = Integer.parseInt(firstSubjectMarks.getText());
            int marks2 = Integer.parseInt(secondSubjectMarks.getText());
            double average = (marks1 + marks2) / 2;
            if (average >= 90) {
                // JOptionPane.showMessageDialog(null, "Grade A");//you can show in message
                // dialoge as well
                resulJLabel.setText("Your Result is : Grade A with average marks : " + average);
            } else if (average >= 80 && average < 90) {
                // JOptionPane.showMessageDialog(null, "Grade B");
                resulJLabel.setText("Your Result is : Grade B with average marks : " + average);

            } else if (average >= 70 && average < 80) {
                // JOptionPane.showMessageDialog(null, "Grade C");
                resulJLabel.setText("Your Result is : Grade C with average marks : " + average);

            } else if (average >= 60 && average < 70) {
                // JOptionPane.showMessageDialog(null, "Grade D");
                resulJLabel.setText("Your Result is : Grade D with average marks : " + average);

            } else {
                // JOptionPane.showMessageDialog(null, "Grade F");
                resulJLabel.setText("Your Result is : Grade F with average marks : " + average);

            }
        }
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
