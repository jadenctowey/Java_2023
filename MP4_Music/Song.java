public class Song extends ListenableContent {
    public Song(String title, Account artist, List<String> genres) {
        super(title, artist, genres);
  }
}

public class Podcast extends ListenableContent {
    private int episodeNumber;

    public Podcast(String title, Account artist, List<String> genres, int episodeNumber) {
        super(title, artist, genres);
        this.episodeNumber = episodeNumber;
  }

  // Getters and setters for episodeNumber
}