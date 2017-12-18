package lesson4.loops;

public class ForExample {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println("Конец");
    }
}
