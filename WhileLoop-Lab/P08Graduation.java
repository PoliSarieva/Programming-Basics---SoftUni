import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int numberClass = 1;
        double sumGrade = 0;
        int count = 0;

        while (numberClass <= 12) {
            if (count == 2) {
                System.out.printf("%s has been excluded at %d grade", name, numberClass);
                break;
            }
                double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                count++;
                continue;
            }

            numberClass++;
            sumGrade = sumGrade + grade;
        }
            if (count!= 2) {
                double averigeGrade = sumGrade / (numberClass - 1);
                System.out.printf("%s graduated. Average grade: %.2f", name, averigeGrade);
            }

    }
}
