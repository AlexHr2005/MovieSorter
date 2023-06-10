import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movie {
    private String title;
    private String genre;
    private String mainActor;

    public Movie(String title, String genre, String actor) {
        this.title = title;
        this.genre = genre;
        this.mainActor = actor;
    }

    public String toString() {
        return title + "|" + genre + "|" + mainActor;
    }

    public static Movie stringToMovie(String str) {
        List<String> fields = new ArrayList<>(Arrays.asList(str.split("\\|")));
        Movie newMovie = new Movie(fields.get(0), fields.get(1), fields.get(2));
        return newMovie;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getMainActor() {
        return mainActor;
    }
}
