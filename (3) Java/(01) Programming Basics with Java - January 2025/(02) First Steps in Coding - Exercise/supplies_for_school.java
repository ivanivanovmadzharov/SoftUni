import java.util.Scanner;

public class supplies_for_school {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pen_price = 5.8;
        double marker_price = 7.2;
        double mr_proper_price = 1.2;

        double pens = Double.parseDouble(scan.nextLine());
        double markers = Double.parseDouble(scan.nextLine());
        double mr_proper = Double.parseDouble(scan.nextLine());
        double discount = Double.parseDouble(scan.nextLine());

        double sum = (pens * pen_price) + (markers * marker_price) + (mr_proper * mr_proper_price);
        double sum_with_discount = sum - (sum * discount / 100);

        System.out.println(sum_with_discount);
    }
}
