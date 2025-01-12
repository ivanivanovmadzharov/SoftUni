import java.util.Scanner;

import static java.lang.Math.abs;

public class godzilla_vs_kong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int personnel = Integer.parseInt(scan.nextLine());
        double costume_price = Double.parseDouble(scan.nextLine());

        double decor = budget * 0.1;

        if (personnel > 150) {
            costume_price = costume_price * 0.9;
        }

        double sum = personnel * costume_price + decor;

        double result = abs(budget - sum);

        if (budget >= sum) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", result);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", result);
        }
    }
}
