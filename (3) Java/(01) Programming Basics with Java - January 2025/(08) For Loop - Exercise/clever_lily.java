import java.util.Scanner;

public class clever_lily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Age
        int N = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toysPrice = Integer.parseInt(scanner.nextLine());

        int birthdayMoneyTracker = 0;
        int sum = 0;
        int toysCount = 0;

        for (int i = 1; i <= N; i++) {

            if (i % 2 == 0) {
                birthdayMoneyTracker += 10;

                sum += birthdayMoneyTracker;
                sum--;
            } else {
                toysCount++;
            }
        }

        int totalPriceToys = toysCount * toysPrice;
        sum += totalPriceToys;

        double diff = Math.abs(sum - washingMachinePrice);

        if (sum >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }

    }
}