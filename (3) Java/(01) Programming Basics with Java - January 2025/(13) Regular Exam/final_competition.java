import java.util.Scanner;

public class final_competition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double moneyWon = dancers * points;
        if (place.equals("Abroad")) {
            moneyWon *= 1.5;
        }

        double percentExpenses = 0.0;
        if (season.equals("summer")) {
            switch (place) {
                case "Bulgaria" -> percentExpenses = 0.05;
                case "Abroad" -> percentExpenses= 0.1;
            }
        } else if (season.equals("winter")) {
            switch (place) {
                case "Bulgaria" -> percentExpenses = 0.08;
                case "Abroad" -> percentExpenses = 0.15;
            }
        }

        double moneyAfterExpenses = moneyWon - (moneyWon * percentExpenses);
        double moneyForCharity = moneyAfterExpenses * 0.75;
        double moneyLeft = moneyAfterExpenses - moneyForCharity;
        double moneyForDancers = moneyLeft / dancers;

        System.out.printf("Charity - %.2f\nMoney per dancer - %.2f", moneyForCharity, moneyForDancers);
    }
}
