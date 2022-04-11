package Calculator;

import java.util.ArrayList;

public class Diagonal {
    private static int x;
    private static int y;
    private static int x2;
    private static int y2;

    public Diagonal(int xx, int yy, int xx2, int yy2) {
        x = xx;
        y = yy;
        x2 = xx2;
        y2 = yy2;
        calculate();
    }

    public static void calculate() {
        int pointX = (x + x2)/2;
        int pointY = (y + y2)/2;
        System.out.print("(" + pointX + ", " + pointY + "), ");
    }
}

