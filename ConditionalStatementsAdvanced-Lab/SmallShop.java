import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double coffee = 0;
        double water = 0;
        double beer = 0;
        double sweets = 0;
        double peanuts = 0;
        double finalProduct = 0;
        if (city.equals("Sofia")) {
            if (product.equals("coffee")) {
                coffee = 0.50;
                finalProduct = coffee * quantity;
            } else if (product.equals("water")) {
                water = 0.80;
                finalProduct = water * quantity;
            } else if (product.equals("beer")) {
                beer = 1.20;
                finalProduct = beer * quantity;
            } else if (product.equals("sweets")) {
                sweets = 1.45;
                finalProduct = sweets * quantity;
            } else if (product.equals("peanuts")) {
                peanuts = 1.60;
                finalProduct = peanuts * quantity;
            }
        }

        if (city.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                coffee = 0.40;
                finalProduct = coffee * quantity;
            } else if (product.equals("water")) {
                water = 0.70;
                finalProduct = water * quantity;
            } else if (product.equals("beer")) {
                beer = 1.15;
                finalProduct = beer * quantity;
            } else if (product.equals("sweets")) {
                sweets = 1.30;
                finalProduct = sweets * quantity;
            } else if (product.equals("peanuts")) {
                peanuts = 1.50;
                finalProduct = peanuts * quantity;
            }
        }

        if (city.equals("Varna")) {
            if (product.equals("coffee")) {
                coffee = 0.45;
                finalProduct = coffee * quantity;
            } else if (product.equals("water")) {
                water = 0.70;
                finalProduct = water * quantity;
            } else if (product.equals("beer")) {
                beer = 1.10;
                finalProduct = beer * quantity;
            } else if (product.equals("sweets")) {
                sweets = 1.35;
                finalProduct = sweets * quantity;
            } else if (product.equals("peanuts")) {
                peanuts = 1.55;
                finalProduct = peanuts * quantity;
            }
        }
        System.out.println(finalProduct);
    }
}
