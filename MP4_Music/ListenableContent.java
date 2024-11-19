import java.util.List;

public abstract class ListenableContent implements Comparable<ListenableContent> {
    private String title;
    private Account artist;
    private List <String> genres;
    private int timesStreamed;
  
    public ListenableContent(String title, Account artist, List<String> genres) {
        this.title = title;
        this.artist = artist;
        this.genres = genres;
        this.timesStreamed = 0;
  }

    public void play() {
        timesStreamed++;
  }

    public int compareTo(ListenableContent other) {
        return this.timesStreamed - other.timesStreamed;
  }

  // Getters and setters for member variables
}