package Assignment7.proxy;

import java.util.Objects;

public class Song {
    private String title;
    private String artist;
    private String album;
    private int duration;

    public Song(String title, String artist, String album, int duration) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return duration == song.duration && title.equals(song.title) && artist.equals(song.artist) && album.equals(song.album);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, album, duration);
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d:%d",title,artist,album,duration/60,duration%60);
    }
}
