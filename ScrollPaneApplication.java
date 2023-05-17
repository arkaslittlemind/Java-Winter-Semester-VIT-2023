import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScrollPaneApplication extends JFrame {

    private JTextArea textArea;
    private int number = 1;

    public ScrollPaneApplication() {
        setTitle("Scroll Pane Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Scroll Pane"));

        JButton numberButton = new JButton("Append Number");
        numberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append(Integer.toString(number));
                number++;
            }
        });

        JButton lineButton = new JButton("Append Line");
        lineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("\n");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(numberButton);
        buttonPanel.add(lineButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ScrollPaneApplication();
            }
        });
    }
}
