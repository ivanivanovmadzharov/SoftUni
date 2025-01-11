import java.util.Scanner;

public class area_of_figures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double output = 0;
        String figure = scan.nextLine();

        if (figure.equals("square")) {
            double a = Double.parseDouble(scan.nextLine());
            output = a * a;
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            output = a * b;
        } else if (figure.equals("circle")) {
            double a = Double.parseDouble(scan.nextLine());
            output = a * a * Math.PI;
        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            output = (a * b) / 2;
        }

        System.out.printf("%.3f", output);
    }
}
