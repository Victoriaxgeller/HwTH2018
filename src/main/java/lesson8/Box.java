package lesson8;

public class Box {

    public double width;
    public double height;
    public static double depth;


    public void volume() {
        System.out.print("Volume ");
        System.out.println(width * height * depth);
    }

}
