package ex_27april;

import java.util.Scanner;

public class lab21 {
    public static void main(String[] args) {

        // Factorial Program
        // 1! -> 1
        // 2! -> 2*1
        // 3! -> 3*2*1 -> 6
        // 4! -> 4*3*2*1 -> 24
        // 5! -> 5*4*3*2*1 -> 120

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        long fact = 1;

        // 5 -> int i = 1 , 5 < 5, 1
        // A - int i = 1;
        // B ->  i  <= num
        // C -> i++

        for (int i = 1; i <= num ; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
        sc.close();



    }
}

