package lesson13;

import org.testng.annotations.Test;

import java.util.*;

public class ListExample {


    @Test
    public void azaza() {

        List<String> stringList = new ArrayList<>();
        stringList.add("Jack");
        stringList.add("Maria");
        stringList.add("Vasya");
        stringList.add("Petya");

        System.out.println(stringList);
    }

    @Test
    public static void setExample() {
        Set<String> countrySet = new TreeSet<>();
        countrySet.add("Россия");
        countrySet.add("Украина");
        countrySet.add("Беларусь");
        countrySet.add("Германия");

        System.out.println(countrySet);

    }




}
