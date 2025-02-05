import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String currentPassword = scanner.nextLine();

        while (!password.equals(currentPassword)) {
            currentPassword = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}