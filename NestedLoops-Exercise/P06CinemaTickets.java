import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double studTickets = 0;
        double standardTickets = 0;
        double kidTickets = 0;
        double ticketsCount = 0;
        boolean isEnd = false;

        while (!command.equals("Finish")) {
            String movie = command;
            double freeSeats = Double.parseDouble(scanner.nextLine());
            double ticketsMovieCount = 0;

            String typeTickets = scanner.nextLine();
            while (!typeTickets.equals("End")) {
                if (typeTickets.equals("Finish")) {
                    isEnd = true;
                    break;
                }
                if (freeSeats > 0) {
                    ticketsMovieCount++;
                    ticketsCount++;

                    switch (typeTickets) {
                        case "student":
                            studTickets++;
                            break;
                        case "standard":
                            standardTickets++;
                            break;
                        case "kid":
                            kidTickets++;
                            break;

                    }

                    if (ticketsMovieCount >= freeSeats) {
                        break;
                    }

                    typeTickets = scanner.nextLine();
                } else {
                    break;
                }
            }
            double fulls = ticketsMovieCount / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n",movie, fulls);

            if (isEnd) {
                break;
            }
            command = scanner.nextLine();
        }

        System.out.printf("Total tickets: %.0f%n", ticketsCount);
        System.out.printf("%.2f%% student tickets.%n", studTickets/ ticketsCount * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets/ ticketsCount * 100);
        System.out.printf("%.2f%% kids tickets.", kidTickets/ ticketsCount * 100);
    }
}
