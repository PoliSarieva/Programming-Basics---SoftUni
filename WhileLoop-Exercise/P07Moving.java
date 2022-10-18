import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int freeSpace = width * height * length;
        int sum = 0;
        boolean isEnoughSpace = false;
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int boxCount = Integer.parseInt(input);
            sum += boxCount;

            if (sum > freeSpace) {
                isEnoughSpace = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (isEnoughSpace) {
            System.out.printf("No more free space! You need %d Cubic meters more.", sum - freeSpace);
        } else {
            System.out.printf("%d Cubic meters left.", freeSpace - sum);
        }
    }

}
