import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        double discountPercent = Double.parseDouble(scanner.nextLine());

        double packagePens = pens * 5.80;
        double packageMarkers = markers * 7.20;
        double litersDetergent = detergent * 1.20;
        double discount = discountPercent/100;

        double sums = packagePens + packageMarkers + litersDetergent;
        double finalSums = sums - (sums * discount);

        System.out.println(finalSums);
    }
}
