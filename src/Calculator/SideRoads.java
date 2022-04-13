package Calculator;

public class SideRoads {
    private static int x;
    private static int y;
    private static int tileNum;

    public SideRoads(int xx, int yy, int tn){
        x = xx;
        y = yy;
        tileNum = tn;
    }

    public static void vertical(){
        int imaginary;
        if(x < 600){
            imaginary = x - 137;
        }else{
            imaginary = x + 137;
        }
        int PointX = (imaginary + x)/2;
        System.out.print("(" + PointX + ", " + y + "), ");
    }

    public static void diagonal(){
        int imaginaryX;
        int imaginaryY;
        if(tileNum == 0 || tileNum == 1 || tileNum == 2 || tileNum == 16 || tileNum == 17 || tileNum == 18){
            imaginaryX = x - 69;
            if(tileNum == 0 || tileNum == 1 || tileNum == 1){
                imaginaryY = y - 118;
            }else{
                imaginaryY = y + 118;
            }
            int x1 = (imaginaryX + x)/2;
            int y1 = (imaginaryY + y)/2;
            System.out.print("(" + x1 + ", " + y1 + "), ");
            imaginaryX = x + 137;
            int x2 = (imaginaryX + x)/2;
            System.out.println("(" + x2 + ", " + y1 + "), ");
        }
        else if(tileNum == 7 || tileNum == 11){
            imaginaryY = y - 118;
            if(tileNum == 7){
                imaginaryX = x - 69;
            }else{
                imaginaryX = x + 69;
            }
            int x1 = (imaginaryX + x)/2;
            int y1 = (imaginaryY + y)/2;
            System.out.print("(" + x1 + ", " + y1 + "), ");
            imaginaryY = y + 137;
            int y2 = (imaginaryY + y)/2;
            System.out.print("(" + x1 + ", " + y2 + "), ");
        }else if(tileNum == 3 || tileNum == 6){
            imaginaryY = y - 118;
            if(tileNum == 3){
                imaginaryX = x - 69;
            }
            else{
                imaginaryX = x + 69;
            }
            int x1 = (imaginaryX + x)/2;
            int y1 = (imaginaryY + y)/2;
            System.out.println("(" + x1 + ", " + y1 + "), ");
        }else if(tileNum == 12 || tileNum == 15){
            imaginaryY = y + 118;
            if(tileNum == 12){
                imaginaryX = x - 69;
            }
            else{
                imaginaryX = x + 69;
            }
            int x1 = (imaginaryX + x)/2;
            int y1 = (imaginaryY + y)/2;
            System.out.println("(" + x1 + ", " + y1 + "), ");
        }

    }

}
