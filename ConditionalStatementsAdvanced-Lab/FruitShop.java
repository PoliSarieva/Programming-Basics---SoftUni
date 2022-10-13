import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double fruitPrice = 0;

        boolean workingDays = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday");
        boolean weekendDays = day.equals("Saturday") || day.equals("Sunday");
        boolean isValid = true;

        if (workingDays) {
            if (fruit.equals("banana")) {
                fruitPrice = 2.50;
            } else if (fruit.equals("apple")) {
                fruitPrice = 1.20;
            } else if (fruit.equals("orange")) {
                fruitPrice = 0.85;
            } else if (fruit.equals("grapefruit")) {
                fruitPrice = 1.45;
            } else if (fruit.equals("kiwi")) {
                fruitPrice = 2.70;
            } else if (fruit.equals("pineapple")) {
                fruitPrice = 5.50;
            } else if (fruit.equals("grapes")) {
                fruitPrice = 3.85;
            } else {
                isValid = false;
            }
        } else if (weekendDays) {
            if (fruit.equals("banana")) {
                fruitPrice = 2.70;
            } else if (fruit.equals("apple")) {
                fruitPrice = 1.25;
            } else if (fruit.equals("orange")) {
                fruitPrice = 0.90;
            } else if (fruit.equals("grapefruit")) {
                fruitPrice = 1.60;
            } else if (fruit.equals("kiwi")) {
                fruitPrice = 3.00;
            } else if (fruit.equals("pineapple")) {
                fruitPrice = 5.60;
            } else if (fruit.equals("grapes")) {
                fruitPrice = 4.20;
            } else {
                isValid = false;
            }
        } else {
            isValid = false;
        }

        if (isValid) {
            double finallyPrice = fruitPrice * quantity;
            System.out.printf("%.2f", finallyPrice);
        } else {
            System.out.println("error");
        }
    }
}
