import java.util.Scanner;

public class personal_titles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double age = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();
        String personalTitle = "";

        switch (gender) {
            case "m" -> personalTitle = "Mr.";
            case "f" -> personalTitle = "Ms.";
        }

        if (age < 16){
            if (personalTitle.equals("Mr.")) {
                personalTitle = "Master";
            } else if (personalTitle.equals("Ms.")){
                personalTitle = "Miss";
            }
        }

        System.out.println(personalTitle);
    }
}
