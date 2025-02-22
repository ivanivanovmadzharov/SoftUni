import java.util.Scanner;

public class bracelet_stand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pocketMoney = Double.parseDouble(scanner.nextLine());
        double dailyProfit = Double.parseDouble(scanner.nextLine());
        double totalExpenses = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double savedMoney = 5 * pocketMoney;
        double gainedMoney = 5 * dailyProfit;
        double totalSavedMoney = savedMoney + gainedMoney;
        double totalMoney = totalSavedMoney - totalExpenses;

        if (totalMoney >= giftPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", totalMoney);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", giftPrice - totalMoney);
        }
    }
}
