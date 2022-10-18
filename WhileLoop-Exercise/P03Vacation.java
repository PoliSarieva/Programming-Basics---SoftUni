import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double holidayMoney = Double.parseDouble(scanner.nextLine());
        double cashMoney = Double.parseDouble(scanner.nextLine());
        int spendCount = 0;
        int countDay = 0;
        boolean isSpendMoney = false;
        double saveMoney = 0;

        while (cashMoney < holidayMoney) {
            countDay++;
            String action = scanner.nextLine();
            if (action.equals("spend")) {
                double spendMoney = Double.parseDouble(scanner.nextLine());
                cashMoney = cashMoney - spendMoney;
                spendCount++;
                if (cashMoney <= 0) {
                    cashMoney = 0;
                }
                if (spendCount >= 5) {
                    isSpendMoney = true;
                    break;
                }
            } else if (action.equals("save")) {
                spendCount = 0;
                saveMoney = Double.parseDouble(scanner.nextLine());
                cashMoney = cashMoney + saveMoney;
            }
        }

        if (isSpendMoney) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", spendCount);
        } else {
            System.out.printf("You saved the money for %d days.", countDay);
        }


    }
}
