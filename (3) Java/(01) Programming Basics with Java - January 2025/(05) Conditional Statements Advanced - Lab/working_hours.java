import java.util.Scanner;

public class working_hours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        String dayOfWeek = scan.nextLine();

        if (hour >= 10 && hour <= 18 && !dayOfWeek.equals("Sunday")) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
