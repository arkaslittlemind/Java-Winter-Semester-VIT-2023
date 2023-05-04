import javax.swing.*;
import java.awt.*;

public class CalculatorGUI extends JFrame {

    private JTextField displayField;

    public CalculatorGUI() {
        // Set up the JFrame
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 300);
        setLocationRelativeTo(null);

        // Set up the display field
        displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setFont(new Font("Arial", Font.PLAIN, 24));
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        add(displayField, BorderLayout.NORTH);

        // Set up the buttons panel
        JPanel buttonsPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            buttonsPanel.add(button);
        }
        add(buttonsPanel, BorderLayout.CENTER);

        // Show the JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
