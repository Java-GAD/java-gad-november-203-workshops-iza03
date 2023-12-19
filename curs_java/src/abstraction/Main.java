package abstraction;


public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Shape of You", "Ed Sheeran");

        Album album = new Album("Divide", "Ed Sheeran");

        album.addSong(song1);

        album.play();
    }
}
