import java.util.Scanner;

public class P05Salary1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tab = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        for (int i=1; i <= tab; i++ ) {
            String website = scanner.nextLine();

            switch (website) {
                case "Facebook":
                    salary = salary - 150;
                    break;
                case "Instagram":
                    salary = salary - 100;
                    break;
                case "Reddit":
                    salary = salary - 50;
                    break;
            }

            if (salary == 0) {
                System.out.println("You have lost your salary.");
                break;
            }

        }
            if (salary !=0) {
                System.out.printf("%.0f", salary);
            }

    }
}
