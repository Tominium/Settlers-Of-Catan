package TilePiece;

import Misc.Token;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Tile extends Hexagon {

    private String type;
    private Token tok;
    private TilePosition h;

    //private String[] arr = {"desert", "field", "forest", "hill", "mountain", "pasture"};

    public Tile(TilePosition h, int r, String t){
        super(h.getX(), h.getY(), r);
        this.h = h;
//        for (int i = 0; i < 6; i++) {
//            addPoint((int) (100 + 50 * Math.cos(i * 2 * Math.PI / 6)), (int) (100 + 50 * Math.sin(i * 2 * Math.PI / 6)));
//        }
        type = t;
        tok = new Token(3);
    }

    public void setToken(Token tt){tok = tt;}
    public Token getToken(){return tok;}

    public BufferedImage getImage(){
        try{
            return ImageIO.read(Tile.class.getResource("/Assets/Hexagons/" + type + ".png"));
        }
        catch(IOException e){return null;}
    }

    public TilePosition getHexPosition() {
        return h;
    }

    public String getType(){
        return type;
    }
}
