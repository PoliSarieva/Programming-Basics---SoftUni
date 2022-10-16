import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double areaYard = Double.parseDouble(scanner.nextLine());
        double priceGreening = areaYard * 7.61;

        double discount = priceGreening * 0.18;
        double finalPrice = priceGreening - discount;

        System.out.printf("The final price is: %f lv.", finalPrice);
        System.out.printf("The discount is: %f lv.", discount);
    }
}
