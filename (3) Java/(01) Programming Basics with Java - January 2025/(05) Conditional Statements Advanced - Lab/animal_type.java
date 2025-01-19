import java.util.Scanner;

public class animal_type {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String animal = scan.nextLine();
        String animalType = "unknown";

        switch (animal) {
            case "dog" -> animalType = "mammal";
            case "snake", "crocodile", "tortoise" -> animalType = "reptile";
        }

        System.out.println(animalType);
    }
}