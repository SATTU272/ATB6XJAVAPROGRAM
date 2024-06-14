package Practice_programs;

import java.util.Scanner;

public class evenandodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the number");
        int num1 = sc.nextInt();
        int result= (num1%2);

        switch (result){
            case 0 :
                System.out.println("Given number is even");
                break;
            case 1:
                System.out.println("Is odd");
                break;

        }



        }
    }
