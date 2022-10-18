import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        double sumInSt = Math.floor(sum * 100);
        int count = 0;

        while (sumInSt > 0) {
            if (sumInSt >= 200) {
                sumInSt = sumInSt - 200;
                count++;
            } else if (sumInSt >= 100) {
                sumInSt = sumInSt - 100;
                count++;
            } else if (sumInSt >= 50) {
                sumInSt = sumInSt - 50;
                count++;
            } else if (sumInSt >= 20) {
                sumInSt = sumInSt - 20;
                count++;
            } else if (sumInSt >= 10) {
                sumInSt = sumInSt - 10;
                count++;
            } else if (sumInSt >= 5) {
                sumInSt = sumInSt - 5;
                count++;
            } else if (sumInSt >= 2) {
                sumInSt = sumInSt - 2;
                count++;
            } else if (sumInSt >= 1) {
                sumInSt = sumInSt - 1;
                count++;
            }
        }

        System.out.println(count);
    }
}
