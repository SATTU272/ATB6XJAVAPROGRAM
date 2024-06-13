package ex_ifelse_0806;

import java.util.Scanner;

public class lab06 {
    public static void main(String[] args) {
        // even and odd number
        //1- odd, 4-even
        //num%2==0 then it is even
        // else odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
        sc.close();
    }

}


