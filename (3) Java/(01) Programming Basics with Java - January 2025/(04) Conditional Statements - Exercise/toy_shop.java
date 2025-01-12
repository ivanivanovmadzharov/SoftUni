import java.util.Scanner;

import static java.lang.Math.abs;

public class toy_shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double trip_price = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions= Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        double all_toys = puzzles + dolls + bears + minions + trucks;
        double sum_lvs = (puzzles * 2.6) + (dolls * 3) + (bears * 4.1) + (minions * 8.2) + (trucks * 2);

        if (all_toys >= 50) {
            sum_lvs = sum_lvs * 0.75;
        }

        sum_lvs = sum_lvs * 0.9;

        double result = abs(sum_lvs - trip_price);

        if (sum_lvs >= trip_price) {
            System.out.printf("Yes! %.2f lv left.", result);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", result);
        }

    }
}
