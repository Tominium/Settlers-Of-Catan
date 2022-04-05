import javax.swing.*;

public class MainMenu extends JFrame {
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 1000;
    private static final int BUTTON_WIDTH = 200;
    private static final int BUTTON_HEIGHT = 50;
    private static final int BUTTON_SPACING = 50;
    private HelpMenu helpMenu;
    private JFrame frame;
    private JPanel panel;
    private JButton startButton;
    private JButton helpButton;
    private JButton exitButton;


    public MainMenu() {
        {
            // Initialize the help menu
            helpMenu = new HelpMenu();

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
                // Initialize the game
            });
            panel.add(startButton);

            // Initialize the help button
            helpButton = new JButton("Help");
            helpButton.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
            helpButton.setLocation(WIDTH / 2 - BUTTON_WIDTH / 2, HEIGHT / 2 - BUTTON_HEIGHT / 2);
            helpButton.addActionListener(e -> {
                // Show the help menu
                helpMenu.show();
            });
            panel.add(helpButton);

            // Initialize the exit button
            exitButton = new JButton("Exit");
            exitButton.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
            exitButton.setLocation(WIDTH / 2 - BUTTON_WIDTH / 2, HEIGHT / 2 - BUTTON_HEIGHT / 2 + BUTTON_SPACING);
            exitButton.addActionListener(e -> {
                // Exit the program
                System.exit(0);
            });
            panel.add(exitButton);
        }

        // Show the main menu
        show();
    }

    public void show() {
        frame.setVisible(true);
    }

    public void hide() {
        frame.setVisible(false);
    }
}









