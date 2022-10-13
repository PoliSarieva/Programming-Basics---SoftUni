import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        double rows = Double.parseDouble(scanner.nextLine());
        double collumns = Double.parseDouble(scanner.nextLine());
        double income = 0;
        if (projection.equals("Premiere")) {
            income = rows * collumns * 12.00;
        } else if (projection.equals("Normal")) {
            income = rows * collumns * 7.50;
        } else if (projection.equals("Discount")) {
            income = rows * collumns * 5.00;
        }

        System.out.printf("%.2f leva", income);
    }
}
