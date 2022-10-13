import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първият ред съдържа числото V – Обем на басейна в литри – цяло число в интервала [1…10000].
        //•	Вторият ред съдържа числото P1 – дебит на първата тръба за час – цяло число в интервала [1…5000].
        //•	Третият ред съдържа числото P2 – дебит на втората тръба за час– цяло число в интервала [1…5000].
        //•	Четвъртият ред съдържа числото H – часовете които работникът отсъства – реално число

        int volume = Integer.parseInt(scanner.nextLine());
        int debitP1 = Integer.parseInt(scanner.nextLine());
        int debitP2 = Integer.parseInt(scanner.nextLine());
        double hour = Double.parseDouble(scanner.nextLine());

        double water1P = hour * debitP1;
        double water2P = hour * debitP2;
        double waterSum = water1P + water2P;

        if (waterSum <= volume) {
            double fulled = waterSum * 100 / volume;
            double fulledP1 = water1P * 100 / waterSum;
            double fulledP2 = water2P * 100 / waterSum;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", fulled, fulledP1, fulledP2);
        } else {
            double moreLitters = waterSum - volume;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hour, moreLitters);
        }
    }
}