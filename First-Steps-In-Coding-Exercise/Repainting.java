import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        double paint = Double.parseDouble(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workHour = Integer.parseInt(scanner.nextLine());

        double nylonSums = (2 + nylon) * 1.50;
        double paintSums = (paint/10 + paint) * 14.50;
        double thinnerSums = thinner * 5;
        double bags = 0.40;
        double materials = nylonSums + paintSums + bags + thinnerSums;

        double oneHourWork = materials * 30/100;
        double sumWorkman = workHour * oneHourWork;
        double finalSum = materials + sumWorkman;

        System.out.println(finalSum);
    }
}
