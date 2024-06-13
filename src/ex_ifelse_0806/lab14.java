package ex_ifelse_0806;

import java.util.Scanner;

public class lab14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b & a > c){
            System.out.println("the largest number is: " + a);
    } else if (b>a && b>c) {
            System.out.println("the largest number is: " + b);


        } else if (c>a &c>b) {
            System.out.println("the largest number is: " + c);


        }
        else{
            System.out.println("Incorrect input, please try with correct numbers");

        }
        sc.close();


    }
}
