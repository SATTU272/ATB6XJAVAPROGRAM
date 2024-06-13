package ex_ifelse_0806;

import java.util.Scanner;

public class lab17 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a year");
        int a = sc.nextInt();
        if (isLeapyear(a)) {
            System.out.println("It is a leap year");
        }else{
            System.out.println("It is not a leap year");

        }
    }
        public static boolean isLeapyear(int a){
            return ((a % 4 == 0) && (a % 400 == 0) & (a % 100 != 0));



        }



    }




//year % 4 == 0 && year % 100 != 0 || year % 400 == 0.