package Practice_programs;

import javax.xml.transform.Source;
import java.util.Scanner;

public class maleorfemale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gender");
        String gender = sc.nextLine();
        gender= gender.toLowerCase();
        switch (gender){
            case "male":
                System.out.println("gender of the child is male");
                break;
            case "female":
                System.out.println("gender of the child is female");
                break;
            default:
                System.out.println("none");
                break;
        }

    }
}
