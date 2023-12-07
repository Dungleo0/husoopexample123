package lab8.comparator;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {
    private String name;
    private double rating;
    private int year;


    public RatingCompare() {
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compare(Movie o1, Movie o2) {
        return Double.compare(o1.getRating(),o2.getRating());
    }
}
