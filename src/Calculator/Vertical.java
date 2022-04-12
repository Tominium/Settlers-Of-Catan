package Calculator;

import java.awt.*;

public class Vertical {

    public Vertical() {
    }

    public static Point calculate(int xx, int xx2, int yy) {
        int pointX = (xx + xx2)/2;
        return new Point(pointX, yy);
    }
}

