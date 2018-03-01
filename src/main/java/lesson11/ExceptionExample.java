package lesson11;

public class ExceptionExample {

    public static void main(String[] args) {
        int a = 4;
        //  System.out.println(a / 0);

        try {
            System.out.println(a / 0);
        } catch (ArithmeticException e) {
            System.out.println("sjehfuhweufhuedfhedf " + e.getMessage());
        }
    }

}
