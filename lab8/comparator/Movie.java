package lab8.comparator;

public class Movie implements Comparable<Movie>{

    private String name;
    private double rating;
    private int year;

    @Override
    public int compareTo(Movie m) {
        return this.year-m.getYear();
    }
    public Movie(String name,double rating,int year){
        this.name=name;
        this.rating=rating;
        this.year=year;
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
}
