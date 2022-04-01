import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Tile extends Hexagon {

    private String str;

    private String[] arr = {"desert", "field", "forest", "hill", "mountain", "pasture"};

    public Tile(int x, int y, int r){
        super(x, y, r);
//        for (int i = 0; i < 6; i++) {
//            addPoint((int) (100 + 50 * Math.cos(i * 2 * Math.PI / 6)), (int) (100 + 50 * Math.sin(i * 2 * Math.PI / 6)));
//        }
        str = arr[(int)((Math.random()*4)+1)];
    }

    public BufferedImage getImage(){
        try{
            return ImageIO.read(Tile.class.getResource("Hexagons/" + str + ".png"));
        }
        catch(IOException e){return null;}
    }
}
