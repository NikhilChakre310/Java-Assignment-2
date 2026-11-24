import java.util.ArrayList;
import java.util.List;

public class Screen {
    public List<Show> shows = new ArrayList<>();

    public Screen() {
    }

    public Screen(List<Show> shows) {
        if (shows != null) {
            this.shows = shows;
        }
    }

    public void addShow(Show show) {
        if (show != null) {
            shows.add(show);
        }
    }

    public List<Show> getShows() {
        return shows;
    }
}
