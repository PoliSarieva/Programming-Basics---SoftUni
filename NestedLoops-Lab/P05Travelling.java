import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();


        while (!destination.equals("End")) {
            double budjet = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while (sum < budjet) {
                double amount = Double.parseDouble(scanner.nextLine());
                sum = sum + amount;
            }
            if (sum >= budjet) {
                System.out.printf("Going to %s!%n", destination);
            }
            destination = scanner.nextLine();
        }
    }
}
