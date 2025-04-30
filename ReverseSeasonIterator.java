import java.util.List;

public class ReverseSeasonIterator implements EpisodeIterator {
    private List<Episode> episodes;
    private int currentIndex;

    public ReverseSeasonIterator(Season season) {
        this.episodes = season.getEpisodes();
        this.currentIndex = episodes.size() - 1;  // Начинаем с конца списка
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public Episode next() {
        if (hasNext()) {
            return episodes.get(currentIndex--);
        }
        return null; // or throw exception based on design
    }
}
