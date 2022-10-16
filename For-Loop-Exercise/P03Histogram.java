import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 1; i<= n; i ++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                p1++;
            } else if (number<=399) {
                p2++;
            } else if (number <= 599) {
                p3++;
            } else if (number<= 799) {
                p4++;
            } else if (number>=800) {
                p5++;
            }
        }

        double totalP1 = p1 / n * 100;
        double totalP2 = p2 / n * 100;
        double totalP3 = p3 / n * 100;
        double totalP4 = p4 / n * 100;
        double totalP5 = p5 / n * 100;
        System.out.printf("%.2f%%%n", totalP1);
        System.out.printf("%.2f%%%n", totalP2);
        System.out.printf("%.2f%%%n", totalP3);
        System.out.printf("%.2f%%%n", totalP4);
        System.out.printf("%.2f%%%n", totalP5);
    }
}
