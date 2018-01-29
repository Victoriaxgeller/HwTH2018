package lesson8;

public class Box {

    public double width;
    public double height;
    public static double depth;
    public String name;

    public Box() {
        width = 11;
        height = 22;
        depth = 33;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box box = new Box(10, 20, 30);
    Box box2 = new Box(10, 10, 10);
    Box box3 = new Box(17, 15, 4);


    public double getVolume() {
        return width * height * depth;
    }

    public void printInfo() {
        System.out.println(getVolume());
    }

    public Box(double width, double height, double depth, String name) {
        this(width, height, depth);
        this.name = name;
    }

    public void volume() {
        System.out.println("ywged");
    }
}
