import java.util.Scanner;

public class P04Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int nextNumber = 1;

        while (nextNumber <=n ) {
            System.out.println(nextNumber);
            nextNumber = nextNumber * 2 + 1;
        }
    }
}
