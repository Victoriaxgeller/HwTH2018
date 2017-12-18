package homework1;

import java.util.Scanner;

/**
 * Created by Victoria on 14.12.17.
 */
public class Greeting {


    public static void main(String[] args) {

        printHello();

    }

    public static void printHello() {
        System.out.println("Hello, what is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Hello, " + name);
    }
}
