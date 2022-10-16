import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int foodDogs = Integer.parseInt(scanner.nextLine());
        int foodCats = Integer.parseInt(scanner.nextLine());

        double priceFoodDogs = foodDogs * 2.50;
        double priceFoodCats = foodCats * 4;

        double priceFood = priceFoodDogs + priceFoodCats;
        System.out.println(priceFood + " lv.");
    }
}
