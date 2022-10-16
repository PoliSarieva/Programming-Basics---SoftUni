import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int evenNumber = 0;
        int oddNumber = 0;

        for (int i = 1; i<=n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                evenNumber = evenNumber + number;
            } else {
                oddNumber = oddNumber + number;
            }
        }

        if (evenNumber == oddNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenNumber);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(evenNumber - oddNumber));
        }
    }
}
