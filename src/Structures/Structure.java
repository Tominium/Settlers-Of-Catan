package Structures;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Structure {
    private String type;
    private String color;
    private BufferedImage image;
    private Point pos;
    private boolean isVisible;

    public Structure(String type, String color, Point pos) {
        this.type = type;
        this.color = color;
        this.pos = pos;
        this.isVisible = true;
        try {
            image = ImageIO.read(Structure.class.getResource(type+"/"+color+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public BufferedImage getImage() {
        return this.image;
    }

    public void setVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public String getType() {
        return this.type;
    }

    public String getColor() {
        return this.color;
    }

    public Point getPos() {
        return this.pos;
    }

    public void setPos(Point pos) {
        this.pos = pos;
    }
}
