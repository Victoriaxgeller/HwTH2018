package lesson9;

public class RecursionExample {
    public static void main(String[] args) {
        int sum = fact(5);
        System.out.println(sum);
    }

    public static int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }


}
