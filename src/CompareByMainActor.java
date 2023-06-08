import java.util.Comparator;

public class CompareByMainActor implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getMainActor().compareTo(o2.getMainActor());
    }
}
