package lesson9;

import lesson8.Box;

public class ColorBox extends Box {

    int color;

    public void printInfo() {
        System.out.println("Volume " + getVolume());
        System.out.println("Color " + color);
    }


}
