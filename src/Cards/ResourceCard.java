package Cards;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ResourceCard {
    private String rc;
    private BufferedImage rcFront;
    private BufferedImage rcBack;

    public ResourceCard(String rcName) {
        rc = rcName;
        try {
            rcFront = ImageIO.read(ResourceCard.class.getResource("Assets/Resource_Cards/"+rc+".png"));
            rcBack = ImageIO.read(ResourceCard.class.getResource("Assets/Resource_Cards/back.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public BufferedImage getFront(){
        return rcFront;
    }
    public BufferedImage getBack(){
        return rcBack;
    }

    public String getType(){
        return rc;
    }
}