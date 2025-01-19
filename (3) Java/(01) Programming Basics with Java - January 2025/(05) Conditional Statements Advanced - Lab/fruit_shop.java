import java.util.Scanner;

public class fruit_shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String dayOfWeek = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double price = 0;

        switch (dayOfWeek) {
            case "Saturday", "Sunday" -> {
                switch (fruit) {
                    case "banana" -> price = 2.7;
                    case "apple" -> price = 1.25;
                    case "orange" -> price = 0.90;
                    case "grapefruit" -> price = 1.6;
                    case "kiwi" -> price = 3;
                    case "pineapple" -> price = 5.6;
                    case "grapes" -> price = 4.2;
                }
            }
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
                switch (fruit) {
                    case "banana" -> price = 2.5;
                    case "apple" -> price = 1.2;
                    case "orange" -> price = 0.85;
                    case "grapefruit" -> price = 1.45;
                    case "kiwi" -> price = 2.7;
                    case "pineapple" -> price = 5.5;
                    case "grapes" -> price = 3.85;
                }
            }
        }

        double totalPrice = quantity * price;
        if (totalPrice == 0 && quantity != 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.02f", totalPrice);
        }
    }
}
