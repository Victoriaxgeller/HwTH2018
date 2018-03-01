package lesson13;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMovie {

    @Test
    public void sortMovie() {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("A film", 2.4));
        list.add(new Movie("B film", 2.1));
        list.add(new Movie("C film", 3.1));
        list.add(new Movie("A s film", 5.1));
        Collections.sort(list, new MovieTitlesComparator().reversed());
        System.out.println(list);
    }

}
