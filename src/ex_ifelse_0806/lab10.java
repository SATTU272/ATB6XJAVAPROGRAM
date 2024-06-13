package ex_ifelse_0806;

import javax.swing.*;
import java.util.Scanner;

public class lab10 {
    public static void main(String[] args) {
        // grades calculator

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks");
        int grade = sc.nextInt();
        if (grade >=90 && grade <100)
        {
            System.out.println("Congo, you have score Grade A");

        }else if (grade >=80 && grade <=89)
        {
            System.out.println("Grade B");
        }
        else if (grade >= 70 && grade<=79)
        {
            System.out.println("Grade is C");
        }
        else if (grade >=100){
            System.out.println("you have enter incorrect number");

        }
        else{
            System.out.println("you have faile dthe exam");
        }
        sc.close();

    }
}
