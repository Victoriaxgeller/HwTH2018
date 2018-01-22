package homework4;

/**
 * Created by Victoria on 19.01.18.
 */
public class EqualStrings {

    public static void main(String[] args) {
        String str1 = new String("ВиКТОрИЯ");
        String str2 = new String("ВикторИя");
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Вы тезки!");
        } else {
            System.out.println("Нет:(");
        }
    }
}

