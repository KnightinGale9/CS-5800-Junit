package Assignment7.proxy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;

public class SongServer implements SongService{
    public Map<Integer,Song> server;
    public SongServer(){
        server=new HashMap();
        this.addSong(1,"Panorama","Lee Chan-hyuk","Error",198);
        this.addSong(2,"Goodbye, Stay well","Lee Chan-hyuk","Error",232);
        this.addSong(3,"Funeral Hope", "Lee Chan-hyuk", "Error",321);
        this.addSong(11,"Willow","Taylor Swift","Evermore",214 );
        this.addSong(12,"Ivy","Taylor Swift","Evermore",214);
        this.addSong(13,"Closure","Taylor Swift","Evermore",214);
        this.addSong(31,"Panorama", "IZ*ONE","One-reeler/Act IV",222);

    }

    public void addSong(Integer songID,Song song)
    {
        server.put(songID,song);
    }
    public void addSong(Integer songID,String title,String artist,String album,int duration){
        server.put(songID,new Song(title, artist, album, duration));
    }

    @Override
    public Song searchById(Integer songID) {
        if(server.containsKey(songID))
        {
            return server.get(songID);
        }
        else{
            return null;
        }
    }

    @Override
    public List<Song> searchByTitle(String title) {
        List<Song> songTitle= new LinkedList<>();
        for(Integer songID: server.keySet()){
            Song song = server.get(songID);
            if(song.getTitle().equals(title)){
                songTitle.add(song);
            }
        }
        return songTitle;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        List<Song> songAlbum= new LinkedList<>();
        for(Integer songID: server.keySet()){
            Song song = server.get(songID);
            if(song.getAlbum().equals(album)){
                songAlbum.add(song);
            }
        }
        return songAlbum;
    }
}
