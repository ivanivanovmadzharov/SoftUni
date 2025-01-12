import java.util.Scanner;

public class world_swimming_record {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double time_for_Swimming = distance * time;

        double sectors_for_slowing = Math.floor(distance / 15);
        double delay = sectors_for_slowing * 12.5;

        time_for_Swimming = time_for_Swimming + delay;

        if (time_for_Swimming < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time_for_Swimming);
        }
        else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", time_for_Swimming - record);
        }

    }
}