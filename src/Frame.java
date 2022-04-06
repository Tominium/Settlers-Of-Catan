import javax.swing.*;
import java.io.IOException;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;

public class Frame extends JFrame {

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

    }

    public static void main(String[] args) throws IOException {
        FlatSolarizedLightIJTheme.setup();
        new Frame();
    }
}
