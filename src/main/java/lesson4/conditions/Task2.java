package lesson4.conditions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пользователь 1, введите число: ");
        int user1Number = scanner.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Пользователь 2, введите число: ");
        int user2Number = scanner.nextInt();

        if (user1Number > user2Number) {
            System.out.println("У пользователя 1 число больше");
        } else if (user2Number > user1Number) {
            System.out.println("У пользователя 2 число больше");
        } else
            System.out.println("Числа одинаковые");

    }
}
