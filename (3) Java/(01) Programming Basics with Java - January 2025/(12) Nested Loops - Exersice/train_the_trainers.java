import java.util.Scanner;

public class train_the_trainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juryCount = Integer.parseInt(scanner.nextLine());

        double sumAllGrades = 0.0;
        int allGradesCount = 0;

        String presentationName = scanner.nextLine();
        while (!presentationName.equals("Finish")) {
            double sumCurrentGrades = 0.0;

            for (int i = 1; i <= juryCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                allGradesCount++;
                sumAllGrades += grade;

                sumCurrentGrades += grade;
            }

            System.out.printf("%s - %.2f.%n", presentationName, sumCurrentGrades / juryCount);
            presentationName = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", sumAllGrades / allGradesCount);
    }
}
