package ex_ifelse_0806;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class lab07 {
    public static void main(String[] args) {
        //max number in two
        System.out.println("Enter your first number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter your second number");
        int num2 = sc.nextInt();
        if (num>num2){
            System.out.println("Max number is ->" +num);
        }
        else {
            System.out.println("Max number is ->" +num2);
        }
        sc.close();

    }
}
