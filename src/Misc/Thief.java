package Misc;

import TilePiece.Tile;

public class Thief {
    private Tile pos;

    public Thief(){
    }

    public Tile getLocation(){
        return pos;
    }

    public void setCurrentTile(Tile p){
        pos = p;
    }
}
