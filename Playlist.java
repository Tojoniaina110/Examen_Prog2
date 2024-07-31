package Com.Music;

import java.time.Duration;

public class Playlist extends Chanson {
    private String id;
    private String nom;


    public Playlist(String album, String artist, Duration duration, String genre, String id, String title) {
        super(album, artist, duration, genre, id, title);
    }
    public void addToPlaylist(Chanson chanson, Album album) {
    }

    public void removeById(Chanson id) {

    }

    public void exclude(Chanson chansonExclu, Playlist playlist) {



    }

    public int countPlaylist(){

        return 0;
    }

    public int getTotalLikes(){
        return 0;
    }

}
