package Assignment7.proxy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SongProxy implements SongService {
    private Map<String, List<Song>> cache;
    SongService songFinder;

    public SongProxy(){
        cache= new HashMap<>();
        songFinder= new SongServer();
    }
    @Override
    public Song searchById(Integer songID) {
        return songFinder.searchById(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        if(cache.containsKey(title))
        {
            return cache.get(title);
        }
        else {
            cache.put(title,songFinder.searchByTitle(title));
            return cache.get(title);
        }
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        if (cache.containsKey(album)) {
            return cache.get(album);
        } else {
            cache.put(album, songFinder.searchByAlbum(album));
            return cache.get(album);
        }
    }
}
