import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        double rezult = 0;
        String oddEven = "";
        boolean isZero = false;

        switch (operation) {
            case "+":
                rezult = N1 + N2;
                break;
            case "-":
                rezult = N1 - N2;
                break;
            case "*":
                rezult = N1 * N2;
                break;
            case "/":
                isZero = true;
                rezult = N1*1.0 / N2;
                break;
            case "%":
                isZero = true;
                rezult = N1 % N2;
                break;
        }

        if (rezult % 2 == 0) {
            oddEven = "even";
        } else {
            oddEven = "odd";
        }

        if (operation.equals("+") || operation.equals("-") || operation.equals("*")) {
            System.out.printf("%d %s %d = %.0f - %s", N1, operation, N2, rezult, oddEven);
        } else if (operation.equals("/") && isZero) {
                System.out.printf("%d / %d = %.2f", N1, N2, rezult);
            }
        if (operation.equals("%") && isZero) {
                System.out.printf("%d %% %d = %.0f", N1, N2, rezult);
            } else {
            System.out.printf("Cannot divide %d by zero", N1);
        }
    }
}
