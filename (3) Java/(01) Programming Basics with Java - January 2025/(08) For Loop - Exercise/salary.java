import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String websiteName = scanner.nextLine();

            switch (websiteName) {
                case "Facebook" -> salary = salary - 150;
                case "Instagram" -> salary = salary - 100;
                case "Reddit" -> salary = salary - 50;
            }

            if (salary <= 0) {
                break;
            }
        }

        if (salary <= 0) {
            System.out.print("You have lost your salary.");
        } else {
            System.out.print(salary);
        }

    }
}