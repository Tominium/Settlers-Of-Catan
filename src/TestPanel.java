import javax.swing.*;
import java.awt.*;

public class TestPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private final int WIDTH = 1200;
    private final int HEIGHT = 800;
    private GridBagConstraints gbc;

    private Font font = new Font("Arial", Font.BOLD, 18);
    FontMetrics metrics;

    public TestPanel() {
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        Point origin = new Point(WIDTH / 2, HEIGHT / 2);
        drawHexGridLoop(origin, 5, 65, 3);
    }

    private void drawHexGridLoop(Point origin, int size, int radius, int padding) {
        double ang30 = Math.toRadians(30);
        double xOff = Math.cos(ang30) * (radius + padding);
        double yOff = Math.sin(ang30) * (radius + padding);
        int half = size / 2;

        for (int row = 0; row < size; row++) {
            int cols = size - java.lang.Math.abs(row - half);

            for (int col = 0; col < cols; col++) {
                int xLbl = row < half ? col - row : col - half;
                int yLbl = row - half;
                int x = (int) (origin.x + xOff * (col * 2 + 1 - cols));
                int y = (int) (origin.y + yOff * (row - half) * 3);

                drawHex(xLbl, yLbl, x, y, radius);
            }
        }
        this.repaint();
        this.revalidate();
    }

    private void drawHex(int posX, int posY, int x, int y, int r) {
        Tile hex = new Tile(x, y, r);
        JLabel temp = new JLabel(new ImageIcon(hex.getImage().getScaledInstance((int) hex.getBounds().getWidth(), (int) hex.getBounds().getHeight(), Image.SCALE_SMOOTH)));
        temp.setLocation(x, y);
        gbc.weightx = Integer.MIN_VALUE;
        gbc.weighty = Integer.MIN_VALUE;
        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = x; gbc.gridy = y;
        add(temp, gbc);
    }





}
