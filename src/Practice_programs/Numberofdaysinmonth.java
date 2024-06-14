package Practice_programs;

import javax.xml.transform.Source;
import java.util.Locale;
import java.util.Scanner;

public class Numberofdaysinmonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month for which you want to know the days");
        String month= sc.nextLine();
        month = month.toLowerCase();

        switch (month){
            case "jan":
                System.out.println(31);
                break;
            case "feb":
                System.out.println(28);
                break;
            case "mar":
                System.out.println(31);

        }

    }
}
