import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeSm = lenght * width * height;
        double volumeDm = volumeSm/1000;

        double finalLiters = volumeDm *(1 - percent/100);

        System.out.println(finalLiters);
    }
}
