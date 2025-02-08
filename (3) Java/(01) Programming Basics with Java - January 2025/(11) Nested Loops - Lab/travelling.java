import java.util.Scanner;

public class travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String destination = scan.nextLine();

            if (destination.equals("End")){
                break;
            }

            double budget = Double.parseDouble(scan.nextLine());
            double totalMoney = 0;

            while (totalMoney < budget) {
                double money = Integer.parseInt(scan.nextLine());
                totalMoney += money;
            }

            System.out.printf("Going to %s!%n", destination);
        }
    }
}
