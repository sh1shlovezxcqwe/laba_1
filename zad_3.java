import java.util.Scanner;
import static java.lang.Math.*;

public class zad_3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("введите  R");
        double R=in.nextDouble();
        System.out.println("введите  a");
        double a=in.nextDouble();
        double b;
        b = Math.sqrt(4 * R * R - a * a);
        System.out.println("b =" + b);
    }
}
