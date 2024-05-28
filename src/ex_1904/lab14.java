package ex_1904;

public class lab14 {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a + a++ + ++a);

        // 11+11+13
        System.out.println(++a + a++ + a++);

        //11+11+11
        System.out.println(++a + ++a);

        // 11+12+12


    }
}
