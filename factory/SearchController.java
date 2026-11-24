import java.util.ArrayList;
import java.util.List;

public class SearchController {
    private final Factory factory = new Factory();

    public List<Theatre> search(
            Location location, String word, SearchBy filter,
            List<Theatre> allTheatres) {

        List<Theatre> nearby = new ArrayList<>();

        if (allTheatres == null || filter == null) {
            return nearby;
        }

        for (Theatre t : allTheatres) {
            if (t != null && t.location != null && location != null) {
                if (Double.compare(t.location.lat, location.lat) == 0
                        && Double.compare(t.location.lng, location.lng) == 0) {
                    nearby.add(t);
                }
            }
        }

        Search search = factory.getInstance(filter);
        return search.search(nearby, word);
    }
}
