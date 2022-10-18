import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        String searchBook = scanner.nextLine();
        int count = 0;

        while (!searchBook.equals("No More Books")) {
            if (searchBook.equals(book)) {
                System.out.printf("You checked %d books and found it.", count);
                break;
            }
            count++;
            searchBook = scanner.nextLine();
        }

        if (!searchBook.equals(book)) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", count);
        }
    }
}
