import java.util.Scanner;

public class fishing_boat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersCount = Integer.parseInt(scanner.nextLine());

        double shipRent = 0;
        switch (season) {
            case "Spring" -> shipRent = 3000.0;
            case "Summer", "Autumn" -> shipRent = 4200.0;
            case "Winter" -> shipRent = 2600.0;
        }

        if (fishersCount <= 6) {
            shipRent = shipRent - (shipRent * 0.10);
        }
        else if (fishersCount <= 11) {
            shipRent = shipRent - (shipRent * 0.15);
        }
        else {
            shipRent = shipRent - (shipRent * 0.25);
        }

        if (fishersCount % 2 == 0 && !(season.equals("Autumn"))) {
            shipRent = shipRent - (shipRent * 0.05);
        }

        double diff = Math.abs(budget - shipRent);
        if (budget >= shipRent) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }

    }
}