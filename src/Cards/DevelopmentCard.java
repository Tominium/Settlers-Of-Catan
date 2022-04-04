package Cards;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class DevelopmentCard {
    private String dc;
    private BufferedImage dcFront;
    private BufferedImage dcBack;
    private int points;

    public DevelopmentCard(String dcName){
        dc = dcName;
        try {
            dcFront = ImageIO.read(DevelopmentCard.class.getResource(""));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            dcBack = ImageIO.read(DevelopmentCard.class.getResource(""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public DevelopmentCard(String dcName, int p){
        dc = dcName;
        points = p;
        try {
            dcFront = ImageIO.read(DevelopmentCard.class.getResource(""));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            dcBack = ImageIO.read(DevelopmentCard.class.getResource(""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getType(){
        return dc;
    }
}
