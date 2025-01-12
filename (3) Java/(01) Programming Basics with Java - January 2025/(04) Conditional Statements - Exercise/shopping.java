import java.util.Scanner;

import static java.lang.Math.abs;

public class shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int video_cards = Integer.parseInt(scan.nextLine());
        int processors = Integer.parseInt(scan.nextLine());
        int raw_memory = Integer.parseInt(scan.nextLine());

        double sum_of_video_cards = video_cards * 250;
        double sum_of_processors = processors * (0.35 * sum_of_video_cards);
        double sum_of_raw_memory = raw_memory * (0.1 * sum_of_video_cards);

        double total_sum = sum_of_video_cards + sum_of_processors + sum_of_raw_memory;

        if (video_cards > processors) {
            total_sum = total_sum * 0.85;
        }

        double result = abs(budget - total_sum);

        if (budget >= total_sum) {
            System.out.printf("You have %.2f leva left!", result);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", result);
        }
    }
}
