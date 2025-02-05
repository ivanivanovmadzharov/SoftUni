import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieType = scanner.nextLine();;
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int allSeats = r * c;

        double totalPrice = 0.0;

        switch (movieType) {
            case "Premiere" -> totalPrice = allSeats * 12.0;
            case "Normal" -> totalPrice = allSeats * 7.50;
            case "Discount" -> totalPrice = allSeats * 5.0;
        }

        System.out.printf("%.2f leva", totalPrice);

    }
}