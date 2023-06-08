import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Comparator<Movie> compareByTitle = new CompareByTitle();
        Comparator<Movie> finalComparator = compareByTitle.thenComparing(Movie::getGenre)
                .thenComparing(Movie::getMainActor);


    }
}