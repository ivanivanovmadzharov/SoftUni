import java.util.Scanner;

public class day_of_week {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dayOfWeek = Integer.parseInt(scan.nextLine());
        String result = "";

        if (dayOfWeek > 7) {
            result = "Error";
        } else {
            switch (dayOfWeek) {
                case 1 -> result = "Monday";
                case 2 -> result = "Tuesday";
                case 3 -> result = "Wednesday";
                case 4 -> result = "Thursday";
                case 5 -> result = "Friday";
                case 6 -> result = "Saturday";
                case 7 -> result = "Sunday";
            }
        }

        System.out.printf(result);
    }
}
