package lesson9;

public class MethodsExample {

    public static void main(String[] args) {
        int square = getSquare();
        int square2 = getSquare(2, 5);

        System.out.println(square);
        System.out.println(square2);

        Cat kitty = new Cat();

        kitty.meow();
        kitty.meow(2);
        kitty.meow(2.9);
        kitty.meow(2, 3);

    }

    public static int getSquare() {
        return 3 * 5;
    }

    public static int getSquare(int a, int b) {
        return a * b;
    }


}
