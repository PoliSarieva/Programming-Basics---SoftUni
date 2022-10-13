import java.util.Scanner;

public class SleepyTomCat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int holidays = Integer.parseInt(scanner.nextLine());
        int workday = 365 - holidays;
        int gamework = workday * 63;
        int gameholiday = holidays * 127;

        int gameTime = gameholiday + gamework;
        int norm = 30000;
        int timeLeft = 0;
        int hour = 0;
        int minute = 0;

        if (gameTime >= norm) {
            timeLeft = gameTime - norm;
            hour = timeLeft / 60;
            minute = timeLeft % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hour, minute);
        } else {
            timeLeft = norm - gameTime;
            hour = timeLeft / 60;
            minute = timeLeft % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hour, minute);
        }
    }
}
