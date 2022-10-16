import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yearTax = Double.parseDouble(scanner.nextLine());

        double sneakers = yearTax - (yearTax * 40/ 100);
        double team = sneakers - (sneakers * 20 / 100);
        double ball = team / 4;
        double accessories = ball / 5;

        double finallSum = yearTax + sneakers + team + ball + accessories;

        System.out.println(finallSum);
    }
}
