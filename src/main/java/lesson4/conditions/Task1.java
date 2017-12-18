package lesson4.conditions;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер дня недели: ");

        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник.\nНу нахер!");
                break;
            case 2:
                System.out.println("Вторник\nНе пойми что.");
                break;
            case 3:
                System.out.println("Среда\nВторая пятница.");
                break;
            case 4:
                System.out.println("Четверг.\nРыбный день.");
                break;
            case 5:
                System.out.println("Пятница.\nЕдинственная и неповторимая.");
                break;
            case 6:
                System.out.println("Суббота.\nШабат шалом");
                break;
            case 7:
                System.out.println("Воскресенье.\nИли нет, если ты иудаист.");
                break;
            default:
                System.out.println("Нет такого дня");
                break;
        }
    }
}