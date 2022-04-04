import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Token {

    private int number;
    private BufferedImage image;

    public Token(int num) {
        number = num;
        try {
            image = ImageIO.read(Token.class.getResource("Token/prob"+num+".png"));
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
}
