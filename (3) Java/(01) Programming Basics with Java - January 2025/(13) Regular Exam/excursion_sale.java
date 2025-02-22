import java.util.Scanner;

public class excursion_sale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seaExcursions = Integer.parseInt(scanner.nextLine());
        int mountainExcursions = Integer.parseInt(scanner.nextLine());

        int seaExcursionsSold = 0;
        int mountainExcursionsSold = 0;

        while (true) {
            String packet = scanner.nextLine();

            if (packet.equals("sea") && seaExcursions != 0) {
                seaExcursions -= 1;
                seaExcursionsSold += 1;
            } else if (packet.equals("mountain") && mountainExcursions != 0) {
                mountainExcursions -= 1;
                mountainExcursionsSold += 1;
            }

            if (packet.equals("Stop") || (seaExcursions == 0 && mountainExcursions == 0)) {
                break;
            }
        }

        if (seaExcursions == 0 && mountainExcursions == 0) {
            System.out.println("Good job! Everything is sold.");
        }

        System.out.printf("Profit: %d leva.", ((seaExcursionsSold * 680) + (mountainExcursionsSold * 499)));
    }
}
