import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String aroundTheClock = scanner.nextLine();

        String Outfit = "";
        String Shoes = "";

        if (degrees>=10 && degrees<=18) {
            if (aroundTheClock.equals("Morning")) {
                Outfit = "Sweatshirt";
                Shoes = "Sneakers";
            } else if (aroundTheClock.equals("Afternoon")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            } else if (aroundTheClock.equals("Evening")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
        } else if (degrees>18 && degrees<=24) {
            if (aroundTheClock.equals("Morning")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            } else if (aroundTheClock.equals("Afternoon")) {
                Outfit = "T-Shirt";
                Shoes = "Sandals";
            } else if (aroundTheClock.equals("Evening")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
        } else if (degrees>=25) {
            if (aroundTheClock.equals("Morning")) {
                Outfit = "T-Shirt";
                Shoes = "Sandals";
            } else if (aroundTheClock.equals("Afternoon")) {
                Outfit = "Swim Suit";
                Shoes = "Barefoot";
            } else if (aroundTheClock.equals("Evening")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.", degrees, Outfit, Shoes);
    }
}
