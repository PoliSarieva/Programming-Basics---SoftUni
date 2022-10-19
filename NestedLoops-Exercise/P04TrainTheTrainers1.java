import java.util.Scanner;

public class P04TrainTheTrainers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String prezentation = scanner.nextLine();
        int prezCount = 0;
        double sumAverigeGrade = 0;

        while (!prezentation.equals("Finish")) {
            double sumGrade = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrade += grade;
                count++;
            }
            double averigeGrade = sumGrade / count;
            sumAverigeGrade += averigeGrade;
            System.out.printf("%s - %.2f.%n",prezentation, averigeGrade);

            prezentation = scanner.nextLine();
            prezCount++;
        }

        System.out.printf("Student's final assessment is %.2f.", sumAverigeGrade/prezCount);
    }
}
