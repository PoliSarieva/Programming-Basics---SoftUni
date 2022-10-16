import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // брой на групи катерачи
        double musala = 0;
        double monblan = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;
        double allPeople = 0;

        for (int i = 1; i <=n ; i++) {
            int peopleCoint = Integer.parseInt(scanner.nextLine());

            if (peopleCoint <= 5) {
                musala = musala + peopleCoint;
            } else if (peopleCoint <= 12) {
                monblan = monblan + peopleCoint;
            } else if (peopleCoint <= 25) {
                kilimandjaro = kilimandjaro + peopleCoint;
            } else if (peopleCoint <= 40) {
                k2 = k2 + peopleCoint;
            } else if (peopleCoint >= 41) {
                everest = everest + peopleCoint;
            }

            allPeople = allPeople + peopleCoint;
        }

        System.out.printf("%.2f%%%n", musala / allPeople * 100);
        System.out.printf("%.2f%%%n", monblan / allPeople * 100);
        System.out.printf("%.2f%%%n", kilimandjaro / allPeople * 100);
        System.out.printf("%.2f%%%n", k2 / allPeople * 100);
        System.out.printf("%.2f%%%n", everest / allPeople * 100);
    }
}
