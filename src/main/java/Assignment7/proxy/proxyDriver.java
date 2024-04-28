package Assignment7.proxy;

public class proxyDriver {
    public static void main(String[] args) {

        SongService proxy = new SongProxy();
        long startTime=0;

        delay();
        startTime =  System.nanoTime();
        System.out.println(proxy.searchById(11));
        endTimer(startTime);

        delay();
        startTime =  System.nanoTime();
        System.out.println(proxy.searchByTitle("Panorama"));
        endTimer(startTime);

        delay();
        startTime =  System.nanoTime();
        System.out.println(proxy.searchByAlbum("Error"));
        endTimer(startTime);

        delay();
        startTime =  System.nanoTime();
        System.out.println(proxy.searchByTitle("Panorama"));
        endTimer(startTime);

    }
    public static void delay(){
        try{
            Thread.sleep(1000);
        }catch (Exception e){}
    }
    public static void endTimer(long startTime){
        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;

         System.out.println("Elapsed time in nanoseconds: " + elapsedTime);

    }
}
