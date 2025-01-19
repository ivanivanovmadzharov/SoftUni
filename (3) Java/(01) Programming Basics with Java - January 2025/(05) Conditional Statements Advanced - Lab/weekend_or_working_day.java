import java.util.Scanner;

public class weekend_or_working_day {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dayOfWeek = scan.nextLine();
        String result = "Error";

        switch (dayOfWeek) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> result = "Working day";
            case "Saturday", "Sunday" -> result = "Weekend";
        }

        System.out.println(result);
    }
}
