import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allSteps = 0;

        while (allSteps < 10000) {
            String input = scanner.nextLine();
            int steps = 0;
            if (input.equals("Going home")) {
                steps = Integer.parseInt(scanner.nextLine());
                allSteps +=steps;
                break;
            } else {
                steps = Integer.parseInt(input);
            }
            allSteps +=steps;
        }
        int overSteps = allSteps - 10000;
        if (allSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", overSteps);
        } else {
            System.out.printf("%d more steps to reach goal.", Math.abs(overSteps));
        }
    }
}
