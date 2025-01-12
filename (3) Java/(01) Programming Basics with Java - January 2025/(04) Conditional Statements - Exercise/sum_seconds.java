import java.util.Scanner;

public class sum_seconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time_one = Integer.parseInt(scan.nextLine());
        int time_two = Integer.parseInt(scan.nextLine());
        int time_three = Integer.parseInt(scan.nextLine());

        int sum = time_one + time_two + time_three;
        int minutes = sum / 60;
        int seconds = sum % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}