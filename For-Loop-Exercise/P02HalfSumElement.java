import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <=n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            sum = sum + number;
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        int finallySum = sum - maxNumber;
        if (finallySum == maxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", finallySum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(finallySum - maxNumber));
        }
    }
}
