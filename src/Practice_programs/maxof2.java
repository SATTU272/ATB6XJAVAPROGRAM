package Practice_programs;

import java.util.Scanner;

public class maxof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        int result = num1>num2?1:0;
        switch (result){
            case 0:
                result= num1==num2?1:0;
               switch (result){
                   case 0:
                       System.out.println("The maximum between the given numbers"+ num2);
                       break;
                   case 1:
                       System.out.println(" number is equal" );
break;

               }break;




            case 1:
                System.out.println("The maximum between the given numbers is" +num1 );
                break;


        }
    }
}
