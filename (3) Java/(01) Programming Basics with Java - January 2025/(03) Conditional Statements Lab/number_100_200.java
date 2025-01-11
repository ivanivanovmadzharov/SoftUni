import java.util.Scanner;

public class number_100_200 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        String output = "";

        if (num < 100) {
            output = "Less than 100";
        } else if (num <= 200) {
            output = "Between 100 and 200";
        } else if (num > 200) {
            output = "Greater than 200";
        }

        System.out.println(output);
    }
}
