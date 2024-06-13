package ex_ifelse_0806;

import java.util.Scanner;

public class lab08 {
    public static void main(String[] args) {
        System.out.println("Enter your first number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter your second number");
        int num2 = sc.nextInt();
        int max = Math.max(num, num2);
        System.out.println("Math by math.max func" +max);
        if (num>num2){
            System.out.println("Max number is ->" +num);
        }
        else {
            System.out.println("Max number is ->" +num2);
        }
        sc.close();
    }
}
