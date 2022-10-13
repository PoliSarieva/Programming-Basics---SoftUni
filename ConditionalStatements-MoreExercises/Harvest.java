import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int area = Integer.parseInt(scanner.nextLine());
        double grapeFrom1m = Double.parseDouble(scanner.nextLine());
        int neededWine = Integer.parseInt(scanner.nextLine());
        int workerCount = Integer.parseInt(scanner.nextLine());

        double prodictGrape = area * grapeFrom1m;
        double productWine = (prodictGrape *40 /100) / 2.5;

        if (productWine < neededWine) {
            double notEnoighWine = Math.floor(neededWine - productWine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", notEnoighWine);
        } else {
            double totalWine = Math.floor(productWine);
            System.out.printf("Good harvest this year! Total wine: %.0f liters. %n", totalWine);

            double remainingWine = Math.ceil(productWine - neededWine);
            double personWine = Math.ceil(remainingWine / workerCount);
            System.out.printf("%.0f liters left -> %.0f liters per person.", remainingWine, personWine);
        }
    }
}
