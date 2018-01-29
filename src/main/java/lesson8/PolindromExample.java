package lesson8;

public class PolindromExample {

    public static void main(String[] args) {
        String str = "Искать такси";

        checkIfTheStringIsPolindrome(str);

    }

    public static void checkIfTheStringIsPolindrome(String str) {

        String str1 = str.replace(" ", "");

        String str2 = new StringBuilder(str1).reverse().toString();

        if (str.equalsIgnoreCase(str2)) {
            System.out.println("Фраза полиндром: " + str);
        } else {
            System.out.println("Это не фраза полиндром: " + str);
        }
    }
}

