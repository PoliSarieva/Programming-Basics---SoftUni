import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = scanner.nextLine();

        String passInput = scanner.nextLine();

        while (!passInput.equals(password)) {
            passInput = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", name);
    }
}
