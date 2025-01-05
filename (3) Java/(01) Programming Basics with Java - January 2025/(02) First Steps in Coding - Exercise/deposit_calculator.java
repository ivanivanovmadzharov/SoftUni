import java.util.Scanner;

public class deposit_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double deposit = Double.parseDouble(scan.nextLine());
        double period = Double.parseDouble(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double interest = deposit * (percent / 100);
        double interest_per_month = interest / 12;
        double sum = deposit + period * interest_per_month;

        System.out.println(sum);
    }
}
