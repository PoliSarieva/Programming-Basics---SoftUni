import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poorGrade = Integer.parseInt(scanner.nextLine());
        String problem = scanner.nextLine();

        int gradeCount = 0;
        int count = 0;
        double sum = 0;
        String lastProblem = "";
        boolean rezult = true;

        while (!problem.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            gradeCount++;
            if (grade <= 4) {
                count++;
            }

            if (count == poorGrade) {
                rezult = false;
                break;
            }
            sum = sum + grade;
            lastProblem = problem;
            problem = scanner.nextLine();
        }
        double averige = sum / gradeCount;

        if (rezult) {
            System.out.printf("Average score: %.2f%n", averige);
            System.out.printf("Number of problems: %d %n", gradeCount);
            System.out.printf("Last problem: %s", lastProblem);
        } else {
            System.out.printf("You need a break, %d poor grades.", poorGrade);
        }
    }
}
