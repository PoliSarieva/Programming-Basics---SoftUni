import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double comission = 0;
        boolean isValid = true;

        if (sales >= 0 && sales <= 500) {
            if (city.equals("Sofia")) {
                comission = 0.05;
            } else if (city.equals("Varna")) {
                comission = 0.045;
            } else if (city.equals("Plovdiv")) {
                comission = 0.055;
            } else {
                isValid = false;
            }
        } else if (sales > 500 && sales <= 1000) {
            if (city.equals("Sofia")) {
                comission = 0.07;
            } else if (city.equals("Varna")) {
                comission = 0.075;
            } else if (city.equals("Plovdiv")) {
                comission = 0.080;
            } else {
                isValid = false;
            }
        } else if (sales > 1000 && sales <= 10000) {
            if (city.equals("Sofia")) {
                comission = 0.08;
            } else if (city.equals("Varna")) {
                comission = 0.10;
            } else if (city.equals("Plovdiv")) {
                comission = 0.12;
            } else {
                isValid = false;
            }
        } else if (sales > 10000) {
            if (city.equals("Sofia")) {
                comission = 0.12;
            } else if (city.equals("Varna")) {
                comission = 0.13;
            } else if (city.equals("Plovdiv")) {
                comission = 0.145;
            } else {
                isValid = false;
            }
        } else {
            isValid = false;
        }

        if (isValid) {
            double fanallyComission = comission * sales;
            System.out.printf("%.2f", fanallyComission);
        } else {
            System.out.println("error");
        }
    }
}
