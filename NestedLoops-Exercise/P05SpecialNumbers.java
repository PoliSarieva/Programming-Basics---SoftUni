import java.util.Scanner;

public class P05SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <=9999 ; i++) {
            String currentNumber = "" + i;
            int count = 0;

            for (int j = 0; j < currentNumber.length(); j++) {
                int currentChar = Integer.parseInt("" + currentNumber.charAt(j));
                if (currentChar == 0) {
                    continue;
                }
                if (N % currentChar == 0) {
                    count++;
                }
            }

            if (count == 4) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}
