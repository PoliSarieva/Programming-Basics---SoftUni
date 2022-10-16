import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actor = scanner.nextLine();
        double pointAcademia = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine()); // брой оценяващи
        int pointName = 0;
        double totalPoint = 0;
        double allPointEval = 0;

        for (int i = 1; i <= n; i++) {
            String nameEvaluating =scanner.nextLine();
            double pointEvaluating = Double.parseDouble(scanner.nextLine());

            for (int j=0; j < nameEvaluating.length(); j++) {
                char letter = nameEvaluating.charAt(j);
                pointName++;
            }

            allPointEval = pointAcademia + totalPoint;
            totalPoint = allPointEval + (pointEvaluating * pointName / 2);
            pointName = 0;
            pointAcademia = 0;
            if (totalPoint > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, totalPoint);
                break;
            }
        }
        double needPoint = 1250.5 - totalPoint;
        if (totalPoint < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, needPoint);
        }
    }
}
