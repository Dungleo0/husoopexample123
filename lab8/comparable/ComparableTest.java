package lab8.comparable;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens",8.3,2015));
        list.add(new Movie("Star Wars",8.7,1977));
        list.add(new Movie("Empire",8.8,1980));
        list.add(new Movie("Return of the Jedi",8.4,1983));

        Collections.sort(list);

        System.out.println("movies after sorting: ");
        for (Movie movie: list) {
            System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
        }

        try {
            FileWriter fileWriter = new FileWriter(new File("test8.txt"),true);
            for (int i = 0; i < 5; i++) {
                fileWriter.write(list.toString()+"\n");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }
}
