package Homework;

import java.util.Scanner;

public class printmarksinarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int marks[]= new int[4];
        System.out.println("enter the nmarks of your first subject");
         marks[0]= sc.nextInt();
        System.out.println("enter the nmarks of your second subject");
        marks[1]= sc.nextInt();
        System.out.println("enter the nmarks of your third subject");
        marks[2]= sc.nextInt();
        System.out.println("enter the nmarks of your forth subject");
        marks[3]= sc.nextInt();
        for (int i = 0 ; i<marks.length; i++){
            System.out.println(marks[i]);
        }


    }
}
