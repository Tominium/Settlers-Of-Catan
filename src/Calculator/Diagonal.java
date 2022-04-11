package Calculator;

import java.awt.*;
import java.util.ArrayList;

public class Diagonal {
    public Diagonal(int xx, int yy, int xx2, int yy2) {
    }

    public static Point calculateint(int xx, int yy, int xx2, int yy2) {
        int pointX = (xx + xx2)/2;
        int pointY = (yy + yy2)/2;
        return new Point(pointX, pointY);
    }
}

