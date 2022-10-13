import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budjet = Double.parseDouble(scanner.nextLine());
        String sezon = scanner.nextLine();
        double spend = 0;
        String destination = "";
        String rest = "";
        //•	При 100лв. или по-малко – някъде в България
        //o	Лято – 30% от бюджета
        //o	Зима – 70% от бюджета
        //•	При 1000лв. или по малко – някъде на Балканите
        //o	Лято – 40% от бюджета
        //o	Зима – 80% от бюджета
        //•	При повече от 1000лв. – някъде из Европа
        //o	При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета

        if (budjet <= 100) {
            //Bulgaria
            destination = "Bulgaria";
            switch (sezon) {
                case "summer":
                    rest = "Camp";
                    spend = budjet * 30 / 100;
                    break;
                case "winter":
                    rest = "Hotel";
                    spend = budjet * 70 / 100;
                    break;
            }

        } else if (budjet <=1000) {
            //Balkans
            destination = "Balkans";
            switch (sezon) {
                case "summer":
                    rest = "Camp";
                    spend = budjet * 40 / 100;
                    break;
                case "winter":
                    rest = "Hotel";
                    spend = budjet * 80 / 100;
                    break;
            }

        } else {
            //Europe
            destination = "Europe";
            rest = "Hotel";
            switch (sezon) {
                case "summer":
                case "winter":
                    spend = budjet * 90 / 100;
                    break;
            }
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", rest, spend);
    }
}
