package ex_ifelse_0806;

import javax.xml.transform.Source;
import java.util.Scanner;

public class lab12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1, side2 and side3 of the triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if((side1==side2) && (side1==side3) && (side2== side3)) {
            System.out.println("This is a equilateral triangle");
        }
            else if((side1==side2) || (side2==side3) || (side1 == side3)){
            System.out.println("Isoceles");

        }
        else {
            System.out.println( "scalene");
        }


    }
}
