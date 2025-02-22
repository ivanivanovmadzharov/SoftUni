import java.util.Scanner;

public class number_pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;

        for (int rows = 1; rows <= n; rows++){
            for (int cols = 1; cols <= rows; cols++){
                number += 1;
                System.out.printf("%d ", number);
                if (number == n){
                    break;
                }
            }
            if (number == n){
                break;
            }
            System.out.println();
        }
    }
}
