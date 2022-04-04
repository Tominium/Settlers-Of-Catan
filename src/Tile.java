import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Tile extends Hexagon {

    private String type;

    //private String[] arr = {"desert", "field", "forest", "hill", "mountain", "pasture"};

    public Tile(int x, int y, int r, String t){
        super(x, y, r);
//        for (int i = 0; i < 6; i++) {
//            addPoint((int) (100 + 50 * Math.cos(i * 2 * Math.PI / 6)), (int) (100 + 50 * Math.sin(i * 2 * Math.PI / 6)));
//        }
        type = t;
    }

    public BufferedImage getImage(){
        try{
            return ImageIO.read(Tile.class.getResource("Hexagons/" + type + ".png"));
        }
        catch(IOException e){return null;}
    }

    public String getType(){
        return type;
    }
}
