package abstraction;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title;
    private String artist;
    private List<Song> songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void play() {
        System.out.println("Playing album: " + title + " by " + artist);
        for (Song song : songs) {
            song.play();
        }
    }
}
