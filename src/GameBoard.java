import TilePiece.Tile;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.*;

public class GameBoard extends JLayeredPane {
    private static final long serialVersionUID = 1L;
    private final int WIDTH = 1200;
    private final int HEIGHT = 800;
    private final String[] nameList = {"forest", "forest", "forest", "forest", "brick", "brick", "brick", "desert", "field", "field", "field", "field", "pasture", "pasture", "pasture", "pasture", "ore", "ore", "ore"};
    private ArrayList<Tile> tilesBook;

    private Font font = new Font("Arial", Font.BOLD, 18);
    FontMetrics metrics;

    public GameBoard() {
        ArrayList<String> intList = new ArrayList(Arrays.asList(nameList));
        Collections.shuffle(intList);
        Collections.shuffle(intList);
        Collections.shuffle(intList);
        intList.toArray(nameList);
        tilesBook = new ArrayList<>();
        setPreferredSize(new Dimension(WIDTH, HEIGHT));


    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Point origin = new Point(WIDTH / 2, HEIGHT / 2);

        g2d.setStroke(new BasicStroke(4.0f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));
        g2d.setFont(font);
        metrics = g.getFontMetrics();

        drawCircle(g2d, origin, 400, true, true, 0x4488FF, 0);
        drawHexGridLoop(origin, 5, 75, 3);
        drawHex(g);
    }

    private void drawHexGridLoop(Point origin, int size, int radius, int padding) {
        double ang30 = Math.toRadians(30);
        double xOff = Math.cos(ang30) * (radius + padding);
        double yOff = Math.sin(ang30) * (radius + padding);
        int half = size / 2;
        int i =0;

        if(tilesBook.size()!=19){
            for (int row = 0; row < size; row++) {
                int cols = size - java.lang.Math.abs(row - half);

                for (int col = 0; col < cols; col++) {
                    int xLbl = row < half ? col - row : col - half;
                    int yLbl = row - half;
                    int x = (int) (origin.x + xOff * (col * 2 + 1 - cols));
                    int y = (int) (origin.y + yOff * (row - half) * 3);
                    tilesBook.add(new Tile(x, y, radius, nameList[i]));
                    i++;

                    //drawHex(g, xLbl, yLbl, x, y, radius);
                }
            }
            for(int il = 0; il < tilesBook.size(); il++){
                System.out.println(tilesBook.get(il).getCenter());
            }
        }
    }

    private void drawHex(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
//        String text = String.format("%s : %s", coord(posX), coord(posY));
//        int w = metrics.stringWidth(text);
//        int h = metrics.getHeight();

        for(Tile hex: tilesBook){
            hex.draw(g2d);
        }

            //outline
            //hex.draw(g2d, x, y, 4, 0xFFDD88, false);

//        g.setColor(new Color(0xFFFFFF));
//        g.drawString(text, x - w/2, y + h/2);

    }

    private String coord(int value) {
        return (value > 0 ? "+" : "") + Integer.toString(value);
    }

    public void drawCircle(Graphics2D g, Point origin, int radius,
                           boolean centered, boolean filled, int colorValue, int lineThickness) {
        // Store before changing.
        Stroke tmpS = g.getStroke();
        Color tmpC = g.getColor();

        g.setColor(new Color(colorValue));
        g.setStroke(new BasicStroke(lineThickness, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND));

        int diameter = radius * 2;
        int x2 = centered ? origin.x - radius : origin.x;
        int y2 = centered ? origin.y - radius : origin.y;

        if (filled)
            g.fillOval(x2, y2, diameter, diameter);
        else
            g.drawOval(x2, y2, diameter, diameter);

        // Set values to previous when done.
        g.setColor(tmpC);
        g.setStroke(tmpS);
    }

//    public static void Panel(String[] args) {
//        JFrame f = new JFrame();
//        Panel p = new Panel();
//
//        f.setContentPane(p);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.pack();
//        f.setLocationRelativeTo(null);
//        f.setVisible(true);
//    }
}