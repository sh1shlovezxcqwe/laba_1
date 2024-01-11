import java.util.Scanner;
import static java.lang.Math.*;

public class zad_1_2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double L,b,z,y,x,a;
        System.out.println("Введите переменную y");
        y = in.nextDouble();
        System.out.println("Введите переменную x");
        x = in.nextDouble();
        System.out.println("Введите переменную z");
        z = in.nextDouble();
        System.out.println("Введите переменную a");
        a = in.nextDouble();
        System.out.println("Введите переменную b");
        b = in.nextDouble();
        L = b*pow(z,2) - 5*z*y*sin(pow(PI,2)-2*PI*x*y*z)-a*((abs(x-pow(y,2)+z*cos(x+y-z))+exp(1))/pow(z,3)*(x-5*y)+pow(z,x*y));
        System.out.print(L);
    }
}
