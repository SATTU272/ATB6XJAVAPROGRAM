package Practice_programs;

import java.util.Scanner;

public class arithmetic_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");

        int num1 = sc.nextInt();
        System.out.println("Enter your second number");
        int num2 = sc.nextInt();
        System.out.println("What operatins do you want to do");
        char result = sc.next().charAt(0);
        switch (result){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            default:
                System.out.println("None");
        }


    }
}
