package ex_2805;

public class lab15 {
    public static void main(String[] args) {
        int a= 10;
        int b =20;
        int c = 30;

        int max = (a>b) ? (a>b ? a : c) : (b>c ? b : c );
        System.out.println(max);
    }
}
