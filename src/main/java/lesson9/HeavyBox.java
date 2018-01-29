package lesson9;

import lesson8.Box;

public class HeavyBox extends Box {


    int weight; // вес коробки

    public void printInfo() {
        System.out.println("Объем коробки: " + getVolume());
        System.out.println("Вес коробки: " + weight);
    }


    public HeavyBox(double width, double height, double depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }
}
