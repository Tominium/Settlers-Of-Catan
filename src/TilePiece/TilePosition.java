package TilePiece;

public class TilePosition {
    private int x;
    private int y;

    public TilePosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        String temp = "";
        return temp + x + " , " + y;
    }
}
