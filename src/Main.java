import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;

import java.io.IOException;

public class Main {

    public static void main (String[]args) throws IOException {
        FlatSolarizedLightIJTheme.setup();
        new Frame();
    }
}
