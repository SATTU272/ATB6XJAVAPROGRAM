package ex_27april;

import java.util.Scanner;

public class lab02 {
    public static void main(String[] args) {

        // Program to Check if a Number is Positive, Negative, or Zero.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yur number!");
        int num = sc.nextInt();

        if(num> 0 ){
            System.out.println("Positive Number");
        }else if( num < 0){
            System.out.println("Negative Number");
        }else{
            System.out.println("Zero");
        }

        sc.close();


    }
}
