import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTextField textField = new JTextField();
        JButton submitButton = new JButton("Submit");
        JLabel resultLabel = new JLabel();

        panel.add(textField, BorderLayout.NORTH);
        panel.add(submitButton, BorderLayout.CENTER);
        panel.add(resultLabel, BorderLayout.SOUTH);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredText = textField.getText();
                resultLabel.setText("Entered text: " + enteredText);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
