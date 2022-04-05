import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainMenu extends JFrame {
    private static final int WIDTH = 1800;
    private static final int HEIGHT = 900;
    private static final int BUTTON_WIDTH = 200;
    private static final int BUTTON_HEIGHT = 50;
    private static final int BUTTON_SPACING = 50;
    private JFrame frame;
    private JPanel panel;
    private JButton startButton;
    private JButton helpButton;
    private JButton exitButton;
    private BufferedImage page1;

    {
        try {
            page1 = ImageIO.read(new File("src/Images/0001.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public MainMenu() throws IOException {
        {
        {
            //make the background image
            BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = image.createGraphics();
            g2d.drawImage(page1, 0, 0, null);
            g2d.dispose();
            JLabel background = new JLabel(new ImageIcon(image));
            background.setLayout(new FlowLayout());
            background.setOpaque(true);
            background.setBackground(Color.BLACK);
            background.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            background.setVisible(true);
            page1 = image;
        }


            // Initialize the help menu
            JFrame helpFrame = new JFrame("Help");

            // Initialize the frame
            frame = new JFrame();
            panel = new JPanel();
            frame.setSize(WIDTH, HEIGHT);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Main Menu");
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.add(panel);
            frame.setVisible(true);

            // Initialize the start button
            startButton = new JButton("Start");
            startButton.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
            startButton.setLocation(WIDTH / 2 - BUTTON_WIDTH / 2, HEIGHT / 2 - BUTTON_HEIGHT / 2 - BUTTON_SPACING);
            startButton.addActionListener(e -> {
                // Initialize the Frame class
                try {
                    Frame g = new Frame();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            });
            panel.add(startButton);

            // Initialize the help button
            helpButton = new JButton("Help");
            helpButton.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
            helpButton.setLocation(WIDTH / 2 - BUTTON_WIDTH / 2, HEIGHT / 2 - BUTTON_HEIGHT / 2);
            helpButton.addActionListener(e -> {
                // Initialize the HelpMenu class
                HelpMenu helpMenu = new HelpMenu();



            }
            );
            panel.add(helpButton);
            }

            panel.add(helpButton);

            // Initialize the exit button
            exitButton = new JButton("Exit");
            exitButton.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
            exitButton.setLocation(WIDTH / 2 - BUTTON_WIDTH / 2, HEIGHT / 2 - BUTTON_HEIGHT / 2 + BUTTON_SPACING);
            exitButton.addActionListener(e -> {
                System.exit(0);
            });
            panel.add(exitButton);
        }



    JLabel page = new JLabel(new ImageIcon(page1));




    public static void main(String[] args) throws IOException {
        new MainMenu();
    }

    public void change(String menu) {
    }
}
