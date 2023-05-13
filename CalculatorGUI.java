import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTextField textField = new JTextField();
        panel.add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String button : buttons) {
            JButton btn = new JButton(button);
            buttonPanel.add(btn);
        }

        panel.add(buttonPanel, BorderLayout.CENTER);

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
