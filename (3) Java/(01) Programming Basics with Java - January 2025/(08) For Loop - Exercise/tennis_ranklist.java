import java.util.Scanner;

public class tennis_ranklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matchesCount = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int additionalPoints = 0;
        int wonTournaments = 0;

        for (int i = 1; i <= matchesCount; i++) {
            String result = scanner.nextLine();

            switch (result) {
                case "W" -> {
                    additionalPoints += 2000;
                    wonTournaments++;
                }
                case "F" -> additionalPoints += 1200;
                case "SF" -> additionalPoints += 720;
            }

        }

        System.out.printf("Final points: %d%n", additionalPoints + startingPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(1.0 * additionalPoints / matchesCount));
        System.out.printf("%.2f%%", 1.0 * wonTournaments / matchesCount * 100);
    }
}