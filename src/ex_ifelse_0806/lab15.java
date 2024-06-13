package ex_ifelse_0806;

import javax.xml.transform.Source;
import java.util.Scanner;

public class lab15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }
    }
            public static boolean isVowel(char ch) {
                // ch = Character.toLowerCase(ch);
                return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';


            }

}
