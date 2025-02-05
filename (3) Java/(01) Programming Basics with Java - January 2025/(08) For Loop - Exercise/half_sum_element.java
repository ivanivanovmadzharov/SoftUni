import java.util.Scanner;

public class half_sum_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            sum = sum + num;

            if (num > maxNum) {
                maxNum = num;
            }
        }

        sum = sum - maxNum;

        if (sum == maxNum) {
            System.out.printf("Yes\n" +
                    "Sum = %d", maxNum);
        } else {
            System.out.printf("No\n" +
                    "Diff = %d", Math.abs(maxNum - sum));
        }

    }
}