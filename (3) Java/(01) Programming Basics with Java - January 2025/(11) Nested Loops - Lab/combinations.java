import java.util.Scanner;

public class combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nNumber = Integer.parseInt(scan.nextLine());

        int numberOfCombination = 0;

        for (int numberA = 0; numberA <= nNumber; numberA++) {
            for (int numberB = 0; numberB <= nNumber; numberB++) {
                for (int numberC = 0; numberC <= nNumber; numberC++) {
                    int result = numberA + numberB + numberC;
                    if (result == nNumber) {
                        numberOfCombination += 1;
                    }
                }
            }
        }

        System.out.println(numberOfCombination);
    }
}
