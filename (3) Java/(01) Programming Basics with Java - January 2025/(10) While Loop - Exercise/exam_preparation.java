import java.util.Scanner;

public class exam_preparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGradesLimit = Integer.parseInt(scanner.nextLine());

        int gradesSum = 0;
        int gradesCount = 0;
        int badGradesCount = 0;
        String lastProblemName = "";

        String command = scanner.nextLine();
        while (!command.equals("Enough")) {
            String taskName = command;
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                badGradesCount++;

                if (badGradesCount == badGradesLimit) {
                    break;
                }
            }

            lastProblemName = taskName;
            gradesCount++;
            gradesSum += grade;

            command = scanner.nextLine();
        }

        if (badGradesLimit == badGradesCount) {
            System.out.printf("You need a break, %d poor grades.", badGradesLimit);
        }
        else {
            System.out.printf("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", 1.0 * gradesSum / gradesCount, gradesCount, lastProblemName);
        }
    }
}