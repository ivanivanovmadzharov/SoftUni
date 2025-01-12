import java.util.Scanner;

import static java.lang.Math.abs;

public class lunch_break {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String tv_show = scan.nextLine();
        int duration = Integer.parseInt(scan.nextLine());
        int lunch_break = Integer.parseInt(scan.nextLine());

        double lunch = lunch_break / 8.0;
        double relax = lunch_break / 4.0;
        double time_left = lunch_break - (lunch + relax);

        double result = abs(time_left - duration);
        double formated_result = Math.ceil(result);

        if (time_left >= duration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    tv_show, formated_result);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more " +
                    "minutes.", tv_show, formated_result);
        }
    }
}
