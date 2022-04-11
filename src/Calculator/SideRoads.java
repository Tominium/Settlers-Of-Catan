package Calculator;

public class SideRoads {
    private static int x;
    private static int y;

    public SideRoads(int xx, int yy){
        x = xx;
        y = yy;
    }

    public static void vertical(){
        int imaginary;
        if(x < 600){
            imaginary = x - 135;
        }else{
            imaginary = x + 135;
        }
        int PointX = (imaginary + x)/2;
        System.out.print("(" + PointX + ", " + y + "), ");
    }

    public static void diagonal(){

    }
}
