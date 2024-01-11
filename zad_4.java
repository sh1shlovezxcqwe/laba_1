import java.util.Scanner;

public class zad_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите стоимость X кг конфет:");
        double xPrice = scanner.nextDouble();

        System.out.print("Введите вес X кг конфет:");
        double xWeight = scanner.nextDouble();

        System.out.print("Введите стоимость Y кг ирисок:");
        double yPrice = scanner.nextDouble();

        System.out.print("Введите Y кг ирисок:");
        double yWeight = scanner.nextDouble();

        System.out.print("Введите кол-во киллограм конфет (k):");
        double kWeight = scanner.nextDouble();

        double konfetiPrice = xPrice/xWeight;
        double iriskiPrise = yPrice/yWeight;
        double otlPrice = konfetiPrice/iriskiPrise;
        double candyWeightCanBuy = (kWeight*yPrice)/xPrice;

        System.out.println("Стоимость 1 кг конфет:" + konfetiPrice + "Рублей");
        System.out.println("Стоимость 1 кг ирисок:" + iriskiPrise + "Рублей");
        System.out.println("Стоимость конфет отличается от стоимости ирисок в " + otlPrice + " раз");
        System.out.println("Можно купить " + candyWeightCanBuy + " кг ирисок вместо " + kWeight + " кг конфет");

    }
}
