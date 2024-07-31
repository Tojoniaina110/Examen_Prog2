package Com.Music;

import java.time.Duration;

public class Chanson {
    private String id;
    private String title;
    private String artist;
    private String genre;
    private String album;
    private Duration duration;

    public Chanson(String album, String artist, Duration duration, String genre, String id, String title) {
        this.album = album;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
        this.id = id;
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
