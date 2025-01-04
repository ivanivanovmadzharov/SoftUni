import java.util.Scanner;

public class Projects_creation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String architect = scan.nextLine();
        int projects = Integer.parseInt(scan.nextLine());

        int needed_time = projects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                architect, needed_time, projects);
    }
}
