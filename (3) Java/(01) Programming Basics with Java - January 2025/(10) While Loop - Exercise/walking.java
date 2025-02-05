import java.util.Scanner;

public class walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;

        while (goal > 0) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                goal -= stepsToHome;
                break;
            }

            int steps = Integer.parseInt(input);
            goal -= steps;
        }

        if (goal <= 0) {
            System.out.printf("Goal reached! Good job!%n" +
                    "%d steps over the goal!", Math.abs(goal));
        } else {
            System.out.printf("%d more steps to reach goal.", goal);
        }

    }
}