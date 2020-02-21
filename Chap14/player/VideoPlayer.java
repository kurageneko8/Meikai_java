/**
 * VideoPlayer
 */
public class VideoPlayer implements Player {
    private int id;
    private static int count = 0;

    public VideoPlayer(){
        id = ++count;
    }
    
    public void play() {
        System.out.println("video start");
    }
    
    
}