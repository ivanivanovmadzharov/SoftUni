import java.util.Scanner;

public class trade_commissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        double money = Double.parseDouble(scan.nextLine());

        int levelOfCommission = 0;
        double percentCommission = 0;
        boolean isValid = true;

        if (money >= 0 && money <=500) {
            levelOfCommission = 1;
        } else if (money > 500 && money <= 1000) {
            levelOfCommission = 2;
        } else if (money > 1000 && money <= 10000) {
            levelOfCommission = 3;
        } else if (money > 10000) {
            levelOfCommission = 4;
        } else {
            isValid = false;
        }

        switch (city) {
            case "Sofia" -> {
                switch (levelOfCommission) {
                    case 1 -> percentCommission = 0.05;
                    case 2 -> percentCommission = 0.07;
                    case 3 -> percentCommission = 0.08;
                    case 4 -> percentCommission = 0.12;
                }
            }
            case "Varna" -> {
                switch (levelOfCommission) {
                    case 1 -> percentCommission = 0.045;
                    case 2 -> percentCommission = 0.075;
                    case 3 -> percentCommission = 0.1;
                    case 4 -> percentCommission = 0.13;
                }
            }
            case "Plovdiv" -> {
                switch (levelOfCommission) {
                    case 1 -> percentCommission = 0.055;
                    case 2 -> percentCommission = 0.08;
                    case 3 -> percentCommission = 0.12;
                    case 4 -> percentCommission = 0.145;
                }
            }
            default -> isValid = false;
        }

        if (isValid) {
            System.out.printf("%.02f", (money * percentCommission));
        } else {
            System.out.println("error");
        }
    }
}
