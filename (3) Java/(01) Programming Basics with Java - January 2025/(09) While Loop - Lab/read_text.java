import java.util.Scanner;

public class read_text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            System.out.println(input);

            // прочитам нова стойност на стринг променливата input
            input = scanner.nextLine();
        }
    }
}