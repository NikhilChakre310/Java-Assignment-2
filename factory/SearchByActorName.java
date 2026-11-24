import java.util.ArrayList;
import java.util.List;

public class SearchByActorName implements Search {
    @Override
    public List<Theatre> search(List<Theatre> theatres, String word) {
        List<Theatre> result = new ArrayList<>();

        if (theatres == null || word == null) {
            return result;
        }

        String target = word.trim();

        for (Theatre t : theatres) {
            if (t == null || t.screens == null) continue;

            screenLoop:
            for (Screen s : t.screens) {
                if (s == null || s.shows == null) continue;
                for (Show sh : s.shows) {
                    if (sh != null && sh.movie != null && sh.movie.actor != null
                            && sh.movie.actor.name != null
                            && sh.movie.actor.name.trim().equalsIgnoreCase(target)) {
                        result.add(t);
                        break screenLoop;
                    }
                }
            }
        }
        return result;
    }
}
