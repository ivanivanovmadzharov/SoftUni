import java.util.Scanner;

public class password_guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password_key = "s3cr3t!P@ssw0rd";
        String guess = scan.nextLine();
        if (guess.equals(password_key)){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
