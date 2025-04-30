import java.util.Collections;
import java.util.List;

public class ShuffleSeasonIterator implements EpisodeIterator {
    private List<Episode> episodes;
    private int currentIndex = 0;

    public ShuffleSeasonIterator(Season season, long seed) {
        this.episodes = season.getEpisodes();
        Collections.shuffle(episodes, new java.util.Random(seed));  // Перетасовываем с фиксированным сидом
    }

    @Override
    public boolean hasNext() {
        return currentIndex < episodes.size();
    }

    @Override
    public Episode next() {
        if (hasNext()) {
            return episodes.get(currentIndex++);
        }
        return null;
    }
}
