package lesson8;

public class StringMethodsExample {

    public static void main(String[] args) {
        String names = "Вася,Саша,Маша,Катя,Вика,Олег,Петя";

        String[] strArr = names.split(",");


        for( String name:strArr){
            System.out.println(name);
        }
    }
}
