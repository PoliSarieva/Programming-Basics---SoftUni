import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;
        boolean isEnd = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int colls = 1; colls <= rows; colls++) {
                System.out.print(number + " ");
                if (number == n) {
                    isEnd = true;
                    break;
                }
                number++;
            }
            if (isEnd) {
                break;
            }
            System.out.println();
        }
    }
}
