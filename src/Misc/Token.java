package Misc;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Token {

    private int number;
    private BufferedImage image;

    public Token(int num) {
        number = num;
        System.out.println("Assets/Tokens/prob_"+number+".png");
        try {
            image = ImageIO.read(Token.class.getResource("/Assets/Tokens/prob_"+number+".png"));
            image = resize(image, image.getWidth()/3, image.getHeight()/3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getNumber() {
        return number;
    }

    public BufferedImage getImage() {
        return image;
    }

    public BufferedImage resize(BufferedImage img, int newW, int newH) {
        Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = dimg.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();

        return dimg;
    }
}
