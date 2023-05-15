import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CircleMouseChecker extends JFrame {

    private static final int CIRCLE_RADIUS = 50;
    private static final int CIRCLE_CENTER_X = 100;
    private static final int CIRCLE_CENTER_Y = 60;

    private JLabel statusLabel;

    public CircleMouseChecker() {
        setTitle("Circle Mouse Checker");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        statusLabel = new JLabel("Check mouse point location");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int mouseX = e.getX();
                int mouseY = e.getY();

                int distanceX = Math.abs(mouseX - CIRCLE_CENTER_X);
                int distanceY = Math.abs(mouseY - CIRCLE_CENTER_Y);
                double distance = Math.sqrt(distanceX * distanceX + distanceY * distanceY);

                if (distance <= CIRCLE_RADIUS) {
                    statusLabel.setText("Mouse point is inside the circle at (" + mouseX + ", " + mouseY + ")");
                } else {
                    statusLabel.setText("Mouse point is outside of the circle at (" + mouseX + ", " + mouseY + ")");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CircleMouseChecker frame = new CircleMouseChecker();
            frame.setVisible(true);
        });
    }
}
