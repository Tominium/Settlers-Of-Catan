package Calculator;
import java.awt.*;
import java.util.ArrayList;

public class Vertical {

    public Vertical(int xx, int xx2, int yy) {
    }

    public static Point calculate(int xx, int xx2, int yy) {
        int pointX = (xx + xx2)/2;
        return new Point(pointX, yy);
    }
}

