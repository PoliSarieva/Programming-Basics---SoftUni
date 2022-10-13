import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String aroundTheClock = scanner.nextLine();

        double price = 0;
        if (kilometers < 20) {
            //taksi
            double initial = 0.70;
            double tariff = 0;
            if (aroundTheClock.equals("day")) {
                tariff = kilometers * 0.79;
            }

            if (aroundTheClock.equals("night")) {
                tariff = kilometers * 0.90;
            }

            price = initial + tariff;
        } else if (kilometers >= 100) {
            //vlak
            price = kilometers * 0.06;
        } else {
            //avtobus
            price = kilometers * 0.09;
        }

        System.out.printf("%.2f", price);
    }
}
