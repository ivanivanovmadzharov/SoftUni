import java.util.Scanner;

public class cinema_ticket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dayOfWeek = scan.nextLine();
        int ticketPrice = 12;

        switch (dayOfWeek) {
            case "Wednesday", "Thursday" -> ticketPrice = 14;
            case "Saturday", "Sunday" -> ticketPrice = 16;
        }

        System.out.println(ticketPrice);
    }
}
