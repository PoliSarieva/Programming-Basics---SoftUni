import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // брой турнири
        int startedPoint = Integer.parseInt(scanner.nextLine());

        double totalPoint = 0;
        double win = 0;
        int point = 0;
        double finalPoint = 0;

        for (int i = 1; i <= n; i++) {
            String positionTurnir = scanner.nextLine();

            switch (positionTurnir) {
                case "W":
                    point = 2000;
                    break;
                case "F":
                    point = 1200;
                    break;
                case "SF":
                    point = 720;
                    break;
            }

            totalPoint = totalPoint + point;
            if (positionTurnir.equals("W")) {
                win++;
            }
        }

        finalPoint = startedPoint + totalPoint;
        double averigePoint = totalPoint / n;
        double winnerTurnir = win / n * 100;

        System.out.printf("Final points: %.0f%n", finalPoint);
        System.out.printf("Average points: %.0f%n", Math.floor(averigePoint));
        System.out.printf("%.2f%%", winnerTurnir);
    }
}
