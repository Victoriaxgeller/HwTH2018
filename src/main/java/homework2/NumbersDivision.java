package homework2;

import java.util.Scanner;

/**
 * Created by Victoria on 16.12.17.
 */
public class NumbersDivision {
//    public int q;
//    public int w;
//    public int sum;
//    public int remainder;

    public static void main(String[] args) {

        divideNumbesrWithRemainder(21, 8);
        sumOfdigitsOfTwoNumbers(88);
        roundANumber(226.9);
        sumOfdigitsOfThreeNumbers(567);
        convertFromCharToInt();
    }

    public static void divideNumbesrWithRemainder(int q, int w) {

        int sum = q / w;
        int remainder = q % w;

        System.out.println(q + " / " + w + " = " + sum + " и " + remainder + " в остатке");
    }

    public static void sumOfdigitsOfTwoNumbers(int n) {
        String checknumber = "" + n;

        if (checknumber.length() == 2) {
            int firstNum = n / 10;
            int secondNum = n % 10;
            int sum = firstNum + secondNum;
            System.out.println(sum);
        } else
            System.out.println("Not suitable number..");

    }

    public static void roundANumber(double n) {
        double reminder = n * 10 % 10;
        int result = (int) n;
        if (reminder >= 5)
            System.out.println(result + 1);
        else
            System.out.println(result);

    }

    public static void sumOfdigitsOfThreeNumbers(int n) {
        String checknumber = "" + n;

        if (checknumber.length() == 3) {
            int firstNum = n / 100;
            int secondNum = n / 10 % 10;
            int thirdNum = n % 10;
            int sum = firstNum + secondNum + thirdNum;
            System.out.println(sum);
        } else
            System.out.println("Not suitable number..");

    }

    public static void convertFromCharToInt() {
        System.out.print("Введите любой символ: ");

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n = ch;
        System.out.println(n);

    }

}
