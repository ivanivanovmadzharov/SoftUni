import java.util.Scanner;

public class vacation_books_list {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pages = Integer.parseInt(scan.nextLine());
        int pages_per_hour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int total_time = pages / pages_per_hour;
        int time_per_day = total_time / days;

        System.out.println(time_per_day);
    }
}
