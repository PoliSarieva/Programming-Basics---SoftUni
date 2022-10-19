import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int stopNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isFind = false;

        for (int i = startNumber; i <= stopNumber; i++) {
            for (int j = startNumber; j <= stopNumber; j++) {
                count++;
                int sum = i + j;
                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)",count, i, j, sum);
                    isFind = true;
                    break;
                }
            }
            if (isFind) {
                break;
            }
        }
        if (!isFind) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }
    }
}
