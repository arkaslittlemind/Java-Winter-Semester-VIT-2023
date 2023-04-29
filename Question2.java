import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Question2 extends JFrame implements ActionListener {

    private JLabel decimalLabel, hexLabel, binaryLabel;
    private JTextField decimalField, hexField, binaryField;

    public Question2() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        decimalLabel = new JLabel("Decimal value:");
        hexLabel = new JLabel("Hex value:");
        binaryLabel = new JLabel("Binary value:");
        decimalField = new JTextField(10);
        hexField = new JTextField(10);
        binaryField = new JTextField(10);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(decimalLabel);
        panel.add(decimalField);
        panel.add(hexLabel);
        panel.add(hexField);
        panel.add(binaryLabel);
        panel.add(binaryField);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(panel);

        decimalField.addActionListener(this);
    }

    private String decimalToHex(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();

    }

    private String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == decimalField) {
            // Get the decimal value from the text field
            int decimal = Integer.parseInt(decimalField.getText());
            // Convert to hex and display in hex field
            hexField.setText(decimalToHex(decimal));
            // Convert to binary and display in binary field
            binaryField.setText(decimalToBinary(decimal));

        }
    }

    public static void main(String[] args) {
        // Create and show the converter frame Question2 
        Question2 converter = new Question2();
        converter.setVisible(true);

    }
}
