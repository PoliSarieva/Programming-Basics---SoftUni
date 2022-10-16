import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        //Напишете програма, която прочита от конзолата име, фамилия, възраст и
        // град и печата следното съобщение: "You are <firstName> <lastName>,
        // a <age>-years old person from <town>."
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();
        int age = Integer.parseInt (scanner.nextLine());
        String town = scanner.nextLine();

        System.out.print("You are ");
        System.out.println(firstname + " " + lastname + ", a " + age + "-years old person from " + town + ".");
    }
}
