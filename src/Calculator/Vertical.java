package Calculator;
import java.util.ArrayList;

public class Vertical {
    private static int x;
    private static int x2;
    private static int y;

    public Vertical(int xx, int xx2, int yy) {
        x = xx;
        x2 = xx2;
        y = yy;
    }

    public static void calculate() {
        int pointX = (x + x2)/2;
        System.out.print("(" + pointX + ", " + y + "), ");
        calculate();
    }
}

