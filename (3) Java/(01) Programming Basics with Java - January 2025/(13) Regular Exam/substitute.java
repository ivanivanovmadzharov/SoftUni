import java.util.Scanner;

public class substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for (int firstNum1 = K; firstNum1 <= 8; firstNum1++) {
            if (firstNum1 % 2 != 0) continue;

            for (int secondNum1 = 9; secondNum1 >= L; secondNum1--) {
                if (secondNum1 % 2 == 0) continue;

                for (int firstNum2 = M; firstNum2 <= 8; firstNum2++) {
                    if (firstNum2 % 2 != 0) continue;

                    for (int secondNum2 = 9; secondNum2 >= N; secondNum2--) {
                        if (secondNum2 % 2 == 0) continue;

                        if (firstNum1 == firstNum2 && secondNum1 == secondNum2) {
                            System.out.println("Cannot change the same player.");
                        } else {
                            System.out.printf("%d%d - %d%d%n", firstNum1, secondNum1, firstNum2, secondNum2);
                            count++;
                        }

                        if (count == 6) return;
                    }
                }
            }
        }
    }
}
