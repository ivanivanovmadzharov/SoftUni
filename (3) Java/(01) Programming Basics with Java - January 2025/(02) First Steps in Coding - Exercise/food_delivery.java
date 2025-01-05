import java.util.Scanner;

public class food_delivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double chicken_price = 10.35;
        double fish_price = 12.4;
        double vegan_price = 8.15;

        double chicken = Double.parseDouble(scan.nextLine());
        double fish = Double.parseDouble(scan.nextLine());
        double vegan = Double.parseDouble(scan.nextLine());

        double sum_of_menus = (chicken_price * chicken) + (fish_price * fish) + (vegan_price * vegan);
        double dessert_price = sum_of_menus * 0.2;
        double total_sum = sum_of_menus + dessert_price + 2.5;

        System.out.println(total_sum);
    }
}
