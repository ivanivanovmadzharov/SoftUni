import java.util.Scanner;

public class sum_of_two_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int beginning = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());

        int combinations = 0;
        boolean flag = false;

        for (int numberA = beginning; numberA <= end; numberA++) {
            for (int numberB = beginning; numberB <= end; numberB++) {
                combinations++;

                if (numberA + numberB == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)",
                            combinations, numberA, numberB, magicNumber);
                    flag = true;
                    break;
                }

                if (numberA + numberB != magicNumber && numberA == end && numberB == end){
                    System.out.printf("%d combinations - neither equals %d", combinations, magicNumber);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
    }
}
