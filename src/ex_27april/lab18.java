package ex_27april;

public class lab18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if(i%2 ==0 ){
                System.out.println("Even -> " + i);
                continue;
            }
            System.out.println("Odd -> " + i);
        }


    }
}