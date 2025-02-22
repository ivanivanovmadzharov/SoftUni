import java.util.Scanner;

import static java.lang.Math.abs;

public class workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double kilometers = Double.parseDouble(scanner.nextLine());
        double total_kilometers = kilometers;

        for (int day = 1; day < days + 1; day++) {
            double percentImprovement = Double.parseDouble(scanner.nextLine());
            kilometers += (kilometers * (percentImprovement / 100));
            total_kilometers += kilometers;
        }

        double result = abs(1000 - total_kilometers);

        if (total_kilometers >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(result));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(result));
        }
    }
}
