package Homework;

public class max_salary {
    public static void main(String[] args) {
        int salary[] =  {30,50,60,90,10, 100,999};
        System.out.println(salary[2]);
        int max= 0;
        for (int i=0; i<salary.length; i++){
            if (salary[i]>max){
                max= salary[i];
            }

        }
        System.out.println("the maximum salry is -> " +max);

    }
}

