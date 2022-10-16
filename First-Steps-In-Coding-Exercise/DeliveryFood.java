import java.util.Scanner;

public class DeliveryFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());

        double chickenMenu = chicken * 10.35;
        double fishMenu = fish * 12.40;
        double vegetarianMenu = vegetarian * 8.15;

        double sum = chickenMenu + fishMenu + vegetarianMenu;
        double desert = sum * 20 / 100;
        double delivery = 2.50;

        double finalSum = sum + desert + delivery;

        System.out.println(finalSum);
    }
}
