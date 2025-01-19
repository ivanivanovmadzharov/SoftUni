import java.util.Scanner;

public class fruit_of_vegetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String food = scan.nextLine();

        switch (food) {
            case "banana", "apple", "kiwi", "cherry", "lemon", "grapes" -> System.out.println("fruit");
            case "tomato", "cucumber", "pepper", "carrot" -> System.out.println("vegetable");
            default -> System.out.println("unknown");
        }

    }
}
