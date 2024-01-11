import java.util.Scanner;
import static java.lang.Math.*;

public class zad_1_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double W,r,t,y;
        System.out.println("Введите переменную y");
        y = in.nextDouble();
        System.out.println("Введите переменную r");
        r = in.nextDouble();
        System.out.println("Введите переменную t");
        t = in.nextDouble();
        W=(4*pow(t,3) + log(r))/(pow(Math.exp(1),y+r)+7.2*sin(r));
        System.out.print(W);
    }
}
