package ex_ifelse_0806;

import java.util.Scanner;

public class lab16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char y = sc.next().charAt(0);
        {
            if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
                    || y == 'u' || y == 'A' || y == 'E' || y == 'I'
                    || y == 'O' || y == 'U')
                System.out.println("It is a Vowel.");
            else
                System.out.println("It is a Consonant.");
        }

        // The Driver code
        //static public void main(String[] args)
        //{
          //  Vowel_Or_Consonant('W');
           // Vowel_Or_Consonant('I');
        //}
    //}
    }
}
