package lesson13;

import java.util.Set;
import java.util.TreeSet;

public class MovieSet {

    public static void main(String[] args) {
        Set<Movie> moviesSet = new TreeSet<>(); // TreeSet по умолчанию сортирует с помощью метода compareTo
        moviesSet.add(new Movie("Z film", 2.4));
        moviesSet.add(new Movie("B film", 2.1));
        System.out.println(moviesSet);
    }
}
