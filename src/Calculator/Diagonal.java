package Calculator;

import java.awt.*;
import java.util.ArrayList;

public class Diagonal {

    public Diagonal() {
    }

    public static Point calculate(int x, int y, int x2, int y2) {
        int pointX = (x + x2)/2;
        int pointY = (y + y2)/2;
        return new Point(pointX, pointY);
    }

}

