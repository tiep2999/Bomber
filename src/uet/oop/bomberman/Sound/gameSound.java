package sound;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.URL;
import java.util.HashMap;
import javafx.scene.media.*;

public class gameSound {
    public static gameSound instance;
    public static final String EXPLOSION = "explosion.mp3";
    public static final String PUTBOMB = "put-bomb.wav";
    public static final String POWER = "power.wav";
    public static final String WALK = "walk.wav";
    public static final String LASTENEMY = "last-enemy.wav";
    public static final String GAMEOVER = "game-over.mp3";
    public static final String LEVELCOMPLETE = "level-complete.mp3";
    public static final String LEVELSTART = "level-start.mp3";
    public static final String STAGETHEME = "stage-theme.mp3";



    public static gameSound getIstance() {
        if (instance == null) {
            instance = new gameSound();
        }

        return instance;
    }

    public  void play(String path){
        URL resource = getClass().getResource("/music/"+path);
        playSound(resource.getPath());
    }
      /*  public void stop(String path) {
                URL resource = getClass().getResource("/music/"+path);
		stopSound(resource.getPath());
    }*/

    public void playSound(String path) {
        try {
            com.sun.javafx.application.PlatformImpl.startup(()->{});
            Media hit = new Media(new File(path).toURI().toString());
            MediaPlayer player = new MediaPlayer(hit);
            player.play();

        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
}