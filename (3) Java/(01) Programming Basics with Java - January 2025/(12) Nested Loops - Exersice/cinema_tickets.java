import java.util.Scanner;

public class cinema_tickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allTicketsSoldCount = 0;
        int studentTicketsCount = 0;
        int standardTicketsCount = 0;
        int kidsTicketsCount = 0;

        String movieName = scanner.nextLine();
        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int soldTicketsCount = 0;

            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {
                soldTicketsCount++;
                allTicketsSoldCount++;

                switch (ticketType) {
                    case "student" -> studentTicketsCount++;
                    case "standard" -> standardTicketsCount++;
                    case "kid" -> kidsTicketsCount++;
                }

                if (soldTicketsCount >= freeSeats) {
                    break;
                }

                ticketType = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movieName, 1.0 * soldTicketsCount / freeSeats * 100);

            movieName = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", allTicketsSoldCount);
        System.out.printf("%.2f%% student tickets.%n", 1.0 * studentTicketsCount / allTicketsSoldCount * 100);
        System.out.printf("%.2f%% standard tickets.%n", 1.0 * standardTicketsCount / allTicketsSoldCount * 100);
        System.out.printf("%.2f%% kids tickets.%n", 1.0 * kidsTicketsCount / allTicketsSoldCount * 100);
    }
}
