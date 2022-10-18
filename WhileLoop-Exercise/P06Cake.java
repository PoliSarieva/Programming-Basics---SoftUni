import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int piecesCount = width * length;
        int sum = 0;
        boolean isEnough = false;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int pieces = Integer.parseInt(input);
            sum = sum + pieces;
            if (sum > piecesCount) {
                isEnough = true;
                break;
            }
            input = scanner.nextLine();
        }
        int rezultPieces = Math.abs(sum - piecesCount);
        if (isEnough) {
            System.out.printf("No more cake left! You need %d pieces more.", rezultPieces);
        } else {
            System.out.printf("%d pieces are left.", rezultPieces);
        }
    }
}
