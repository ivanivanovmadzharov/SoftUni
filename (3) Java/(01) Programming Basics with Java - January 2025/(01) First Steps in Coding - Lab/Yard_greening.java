import java.util.Scanner;

public class Yard_greening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area = Double.parseDouble(scan.nextLine());

        double sum = area * 7.61;
        double discount = sum * 0.18;
        double total = sum - discount;
        System.out.println("The final price is: " + total + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
