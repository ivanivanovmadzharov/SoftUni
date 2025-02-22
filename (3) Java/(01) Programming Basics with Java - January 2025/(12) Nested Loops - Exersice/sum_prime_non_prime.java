import java.util.Scanner;

public class sum_prime_non_prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumNonPrime = 0;
        int sumPrime = 0;

        String command = scanner.nextLine();
        while (!command.equals("stop")) {
            int num = Integer.parseInt(command);

            if (num < 0) {
                System.out.printf("Number is negative.%n");
                command = scanner.nextLine();
                continue;
            }
            int dividersCount = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    dividersCount++;
                }
            }

            if (dividersCount > 2) {
                sumNonPrime += num;
            } else {
                sumPrime += num;
            }

            command = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d\n" +
                "Sum of all non prime numbers is: %d", sumPrime, sumNonPrime);
    }
}