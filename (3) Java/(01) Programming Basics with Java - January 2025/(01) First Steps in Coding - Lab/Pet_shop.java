import java.util.Scanner;

public class Pet_shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dog_food = Integer.parseInt(scan.nextLine());
        int cat_food = Integer.parseInt(scan.nextLine());

        Double sum = dog_food * 2.5 + cat_food * 4;
        System.out.println(sum + " lv.");
    }
}
