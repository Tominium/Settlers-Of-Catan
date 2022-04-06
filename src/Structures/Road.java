package Structures;

import java.awt.*;

public class Road extends Structure {

    private int orientation;

    public Road(String type, String color, Point pos, int orientation) {
        super(type, color, pos);
        this.orientation = orientation;
    }

    public int getOrientation() {
        return orientation;
    }
}
