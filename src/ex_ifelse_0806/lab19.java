package ex_ifelse_0806;

import java.util.Scanner;

public class lab19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        if (isPrime(a)) {
            System.out.println( "Given input is a prime number ->" +a );
        } else {
            System.out.println("given number is not a prime number->" +a);
        }
    }
            public static boolean isPrime(int a){
            if (a <= 1) {
                // lesss than 1 number will not considered
                return false;
            }
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;


        }

            }


