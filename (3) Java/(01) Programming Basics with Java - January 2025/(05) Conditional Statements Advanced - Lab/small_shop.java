import java.util.Scanner;

public class small_shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String city = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double priceOfProduct = 0;

        switch (city) {
            case "Sofia" -> {
                switch (product) {
                    case "coffee" -> priceOfProduct = 0.5;
                    case "water" -> priceOfProduct = 0.8;
                    case "beer" -> priceOfProduct = 1.2;
                    case "sweets" -> priceOfProduct = 1.45;
                    case "peanuts" -> priceOfProduct = 1.6;
                }
            }
            case "Plovdiv" -> {
                switch (product) {
                    case "coffee" -> priceOfProduct = 0.4;
                    case "water" -> priceOfProduct = 0.7;
                    case "beer" -> priceOfProduct = 1.15;
                    case "sweets" -> priceOfProduct = 1.3;
                    case "peanuts" -> priceOfProduct = 1.5;
                }
            }
            case "Varna" -> {
                switch (product) {
                    case "coffee" -> priceOfProduct = 0.45;
                    case "water" -> priceOfProduct = 0.70;
                    case "beer" -> priceOfProduct = 1.1;
                    case "sweets" -> priceOfProduct = 1.35;
                    case "peanuts" -> priceOfProduct = 1.55;
                }
            }
        }

        double totalPrice = priceOfProduct * quantity;
        System.out.println(totalPrice);
    }
}
