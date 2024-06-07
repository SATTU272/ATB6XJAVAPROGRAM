package ex_2805;

public class lab09 {
    public static void main(String[] args) {
        String name = "Satya";
        String name1 = "Satya";
        System.out.println(name == name1);  // check the ref
        System.out.println(name.equals(name1)); // the the values instead of ref
        String name23 = new String("Satya");
        System.out.println(name.equals(name23)); // values are same
        System.out.println(name==name23);  // check for ref alwasys ==)
    }
}
