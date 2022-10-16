import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double laundryPrice = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());

        int toyCount = 0;
        int money = 0;
        int totalMoney = 0;
        int brother = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money = money + 10;
                totalMoney = totalMoney + money;
                brother++;
            } else {
                toyCount ++;
            }
        }

        double toyMoney = toyPrice * toyCount;
        double finallyMoney = totalMoney + toyMoney - brother;
        double rezult = Math.abs(finallyMoney - laundryPrice);

        if (finallyMoney >= laundryPrice) {
            System.out.printf("Yes! %.2f", rezult);
        } else {
            System.out.printf("No! %.2f", rezult);
        }
    }
}
