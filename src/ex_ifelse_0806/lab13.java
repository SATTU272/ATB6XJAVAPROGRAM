package ex_ifelse_0806;

import java.util.Scanner;

public class lab13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int a = sc.nextInt();
        //int b= sc.nextInt();
        if (a>=0){
            System.out.println("You have enter a positive number");

        } else if (a<0) {
            System.out.println("You have enter a negative number");

}      sc.close();
    }
}
