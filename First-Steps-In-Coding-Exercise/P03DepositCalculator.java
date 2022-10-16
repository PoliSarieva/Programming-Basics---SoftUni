import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositedAmount = Double.parseDouble(scanner.nextLine());
        int depositPeriod = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());

        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        //1.Изчисляване на лихвата
        double divident = depositedAmount * annualInterestRate/100;
        //2. Изчисляване на лихвата за 1 месец
        double divOneMount = divident/12;
        //3. Изчисляване на общата сума
        double sum = depositedAmount + depositPeriod * divOneMount;

        System.out.println(sum);
    }
}
