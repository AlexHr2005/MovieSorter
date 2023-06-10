import java.util.Comparator;

public class CompareByTitle implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        if(!o1.getTitle().contains("The Matrix") && o2.getTitle().contains("The Matrix")) {
            return 1;
        }
        else if(o1.getTitle().contains("The Matrix") && !o2.getTitle().contains("The Matrix")) {
            return -1;
        }
        else return o1.getTitle().compareTo(o2.getTitle());
    }
}