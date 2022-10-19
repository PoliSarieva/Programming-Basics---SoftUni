import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());


        for (int i = startNumber; i <= endNumber; i++) {
            String currentNumber = "" + i;
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 0; j < currentNumber.length(); j++) {
                int currentChar = Integer.parseInt("" + currentNumber.charAt(j));
                if (j % 2 == 0) {
                    evenSum += currentChar;
                } else {
                    oddSum += currentChar;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }

    }
}
