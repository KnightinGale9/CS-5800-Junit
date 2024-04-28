package Assignment7;

import Assignment7.proxy.SongProxy;
import Assignment7.proxy.SongService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProxyDesignPatternTest {
    @Test
    public void searchSongByIDTest(){
        SongService proxy = new SongProxy();
        String expectSong= "Willow,Taylor Swift,Evermore,3:34";
        assertEquals(expectSong,proxy.searchById(11).toString());
    }
    @Test
    public void searchSongByTitleTest(){
        SongService proxy = new SongProxy();
        String expectSong= "[Panorama,Lee Chan-hyuk,Error,3:18, Panorama,IZ*ONE,One-reeler/Act IV,3:42]";
        assertEquals(expectSong,proxy.searchByTitle("Panorama").toString());
    }
    @Test
    public void searchSongByAlbumTest(){
        SongService proxy = new SongProxy();
        String expectSong= "[Panorama,Lee Chan-hyuk,Error,3:18, Goodbye, Stay well,Lee Chan-hyuk,Error,3:52, Funeral Hope,Lee Chan-hyuk,Error,5:21]";
        assertEquals(expectSong,proxy.searchByAlbum("Error").toString());
    }
    @Test
    public void cacheSpeedTest(){
        SongService proxy = new SongProxy();
        long startTime =  System.nanoTime();
        System.out.println(proxy.searchByTitle("Panorama"));
        long endTimer1=endTimer(startTime);

        startTime =  System.nanoTime();
        System.out.println(proxy.searchByTitle("Panorama"));
        long endTimer2=endTimer(startTime);

        assertTrue(endTimer2<endTimer1);
    }
    public long endTimer(long startTime){
        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);
        return elapsedTime;

    }
}
