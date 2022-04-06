import javax.swing.*;
import java.io.IOException;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;

public class Frame extends JFrame {

    private JButton BackButton;
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 1000;

    public Frame() throws IOException {

        setSize(WIDTH, HEIGHT);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        setResizable(false);
        add(new MainMenu());
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
/*
        //instantiate the buttons
        BackButton = new JButton("Back");
        BackButton.setBounds(0, 0, 100, 50);
        BackButton.setVisible(true);
        add(BackButton);//add the button to the frame
        BackButton.addActionListener(e -> {
                    try {
                        new MainMenu();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
        );

*/
    }

    public static void main (String[]args) throws IOException {
        FlatSolarizedLightIJTheme.setup();
        new Frame();

}
}
