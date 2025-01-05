import java.util.Scanner;

public class basketball_equipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tax = Double.parseDouble(scan.nextLine());

        double trainers = tax * 0.6;
        double outfit = trainers * 0.8;
        double ball = outfit * 0.25;
        double accessories = ball * 0.2;

        double total_sum = tax + trainers + outfit + ball + accessories;

        System.out.println(total_sum);
    }
}
