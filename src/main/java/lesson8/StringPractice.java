package lesson8;

public class StringPractice {

    public static void main(String[] args) {

        int i = 234;
        String myStr = String.valueOf(i);
        System.out.println(myStr);

        double i2 = Integer.valueOf(myStr);
        System.out.println("integer " + i2);


        double d = Double.valueOf(myStr);
        System.out.println(d);

        long longNumber = 1235345313;
        String myStr2 = String.valueOf(longNumber);
        System.out.println(myStr2);

        long longNumber2 = Long.valueOf(longNumber);
        System.out.println(longNumber2);

        boolean boolValue = true;
        String myStr3 = String.valueOf(boolValue);
        System.out.println(myStr3);

        boolean boolValue2 = Boolean.valueOf(boolValue);
        System.out.println(boolValue2);
    }
}
