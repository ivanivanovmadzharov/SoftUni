import java.util.Scanner;

public class repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nylon_price = 1.5;
        double paint_price = 14.5;
        double separator_price = 5;

        double nylon = Double.parseDouble(scan.nextLine());
        double paint = Double.parseDouble(scan.nextLine());
        double separator = Double.parseDouble(scan.nextLine());
        double hours = Double.parseDouble(scan.nextLine());

        double sum_for_products = (nylon_price * (nylon + 2)) + (paint_price * (paint + paint * 0.1)) +
                (separator_price * separator) + 0.4;
        double sum_for_workers = (sum_for_products * 0.3) * hours;
        double total_sum = sum_for_products + sum_for_workers;

        System.out.println(total_sum);
    }
}
