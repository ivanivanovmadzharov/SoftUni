import java.util.Scanner;

public class max_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;

        String text = scanner.nextLine();
        while (!text.equals("Stop")) {

            // парсвам текста "100" в цяло число 100
            int number = Integer.parseInt(text);

            if (number > maxNumber) {
                maxNumber = number;
            }
            text = scanner.nextLine();
        }

        System.out.println(maxNumber);
    }
}