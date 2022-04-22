package Logic;

import TilePiece.TilePosition;

public class IntersectionPosition {

    private TilePosition hp1, hp2, hp3;

    public IntersectionPosition(TilePosition t1, TilePosition t2, TilePosition t3) {
        hp1 = t1;
        hp2 = t2;
        hp3 = t3;
    }

    public TilePosition getOne() {
        return hp1;
    }

    public TilePosition getTwo() {
        return hp2;
    }

    public TilePosition getThree() {
        return hp3;
    }

    public String toString() {
        String temp = "";
        return temp + hp1 + " , " + hp2 + " , " + hp3;
    }

}
