import java.util.Scanner;

public class moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int volume = height * length * width;

        boolean isFreeVolumeLeft = true;

        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            int boxesCount = Integer.parseInt(command);

            volume -= boxesCount;
            if (volume <= 0) {
                isFreeVolumeLeft = false;
                break;
            }

            command = scanner.nextLine();
        }

        if (!isFreeVolumeLeft) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        } else {
            System.out.printf("%d Cubic meters left.", volume);
        }


    }
}