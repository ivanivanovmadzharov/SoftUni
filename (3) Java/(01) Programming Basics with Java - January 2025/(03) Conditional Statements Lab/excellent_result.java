import java.util.Scanner;

public class excellent_result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = Integer.parseInt(scan.nextLine());
        if (result >= 5) {
            System.out.println("Excellent!");
        }
    }
}
