package lesson4.conditions;

import java.util.Scanner;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, User:");
        System.out.println("1-print Jack");
        System.out.println("1-print Biber");
        System.out.println("1-print Hulk");
        System.out.println("1-print Obama");
        System.out.println("1-print Putin");


        int choice = scanner.nextInt();

        System.out.println("Your choice.."+choice);

        switch (choice) {
            case 1:
                System.out.println("Jack");
                break;
            case 2:
                System.out.println("Biber");
                break;
            case 3:
                System.out.println("Hulk");
                break;
            case 4:
                System.out.println("Obama");
                break;
            case 5:
                System.out.println("Putin");
                break;
            default:
                System.out.println("No such number..");
                break;
        }
    }
}
