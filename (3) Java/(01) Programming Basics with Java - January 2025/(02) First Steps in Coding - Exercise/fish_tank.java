import java.util.Scanner;

public class fish_tank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double longitude = Double.parseDouble(scan.nextLine());
        double latitude = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double volume = longitude * latitude * height;
        double volume_in_liters = volume / 1000;
        double occupied_space = percent / 100;

        double water = volume_in_liters * (1 - occupied_space);

        System.out.println(water);
    }
}
