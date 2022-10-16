import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pageOfBook = Integer.parseInt(scanner.nextLine());
        int pageOfOneHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int readingTime = pageOfBook/pageOfOneHour;
        int hourOfDay = readingTime/days;

        System.out.println(hourOfDay);
    }
}
