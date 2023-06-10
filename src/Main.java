import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Movie> movies = new ArrayList<>();

        BufferedReader fileReader = new BufferedReader(new FileReader("src/movies.txt"));
        String line;
        while((line = fileReader.readLine()) != null) {
            movies.add(Movie.stringToMovie(line));
        }

        CompareByTitle compareByTitle = new CompareByTitle();
        Comparator<Movie> comparator = compareByTitle.thenComparing(Movie::getGenre).thenComparing(Movie::getMainActor);
        movies.sort(comparator);
    }
}