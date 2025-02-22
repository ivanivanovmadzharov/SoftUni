import java.util.Scanner;

public class excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hotelPrice = 20.0;
        double transportPrice = 1.6;
        double museumPrice = 6.0;
        double moreCosts = 0.25;

        int people = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int transport = Integer.parseInt(scanner.nextLine());
        int museumTickets = Integer.parseInt(scanner.nextLine());

        double singlePersonPrice = (hotelPrice * days) + (transportPrice * transport) + (museumPrice * museumTickets);
        double totalSum = singlePersonPrice * people;
        totalSum += totalSum * moreCosts;

        System.out.printf("%.2f", totalSum);
    }
}
