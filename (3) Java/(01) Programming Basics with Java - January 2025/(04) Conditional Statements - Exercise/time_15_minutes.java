import java.util.Scanner;

public class time_15_minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        minutes = minutes + 15;

        if (minutes > 60) {
            minutes = minutes % 60;
            hours = hours + 1;
        }

        if (minutes == 60) {
            minutes = 0;
            hours = hours + 1;
        }

        if (hours >= 24) {
            hours = hours - 24;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
