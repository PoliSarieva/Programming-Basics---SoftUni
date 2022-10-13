import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayCount = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double foodDogDay = Double.parseDouble(scanner.nextLine());
        double foodCatDay = Double.parseDouble(scanner.nextLine());
        double foodTurtleDay = Double.parseDouble(scanner.nextLine());

        double foodDog = foodDogDay * dayCount;
        double foodCat = foodCatDay * dayCount;
        double foodTurtle = (foodTurtleDay * dayCount) / 1000;
        double foodSum = foodDog + foodCat + foodTurtle;

        if (foodLeft >= foodSum) {
            double remainderFood = Math.floor(foodLeft - foodSum);
            System.out.printf("%.0f kilos of food left.", remainderFood);
        } else {
            double neededFood = Math.ceil(foodSum - foodLeft);
            System.out.printf("%.0f more kilos of food are needed.", neededFood);
        }
    }
}
