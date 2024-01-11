import java.util.Scanner;

public class zad_2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double V_kol, V_vel, L, t_1, t_2, T;
        System.out.println("Введите переменную V_kol");
        V_kol = in.nextDouble();
        System.out.println("Введите переменную V_vel");
        V_vel = in.nextDouble();
        System.out.println("Введите переменную L");
        L = in.nextDouble();
        //System.out.println("Введите переменную t_1");
        //t_1 = in.nextDouble();
        //System.out.println("Введите переменную t_2");
        //t_2 = in.nextDouble();
        //System.out.println("Введите переменную T");
        //T = in.nextDouble();
        t_1 = (L/(V_vel-V_kol))*60;
        t_2 = (L/(V_vel+V_kol))*60;
        T=t_1 + t_2;
        System.out.print(T);
    }
}