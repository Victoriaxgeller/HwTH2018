package lesson4;

public class StringEqualsExample {

    String str1 = new String("Hello");
    String str2 = new String("Hello");
    String sameStr = str1;

    boolean b1 = str1 == str2; //false так как это два разных объекта
    boolean b2 = str1.equals(str2); //true потому что логически эквивалентны
    boolean b3 = str1 == sameStr; //true потому что это один и тот же объект
}
