import java.util.Scanner;

public class old_books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String annysBook = scanner.nextLine();

        int booksCount = 0;

        String currentBook = scanner.nextLine();
        while (!currentBook.equals(annysBook)) {

            if (currentBook.equals("No More Books")) {
                break;
            }

            booksCount++;

            currentBook = scanner.nextLine();
        }

        if (currentBook.equals(annysBook)) {
            System.out.printf("You checked %d books and found it.", booksCount);
        } else {
            System.out.printf("The book you search is not here!%n" +
                    "You checked %d books.", booksCount);
        }
    }
}