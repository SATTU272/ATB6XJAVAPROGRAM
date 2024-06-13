package ex_ifelse_0806;

import java.util.Scanner;

public class lab09 {
    public static void main(String[] args) {

        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        if (number>20) {
            System.out.println("num is >20");
        }
            else if(number>10) {
            System.out.println("num is between 10 to 20");
        }
                else{
                System.out.println("num is <20");
            }


            }
        }


