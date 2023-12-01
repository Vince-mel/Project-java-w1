import entities.Audio;
import entities.Immagine;
import entities.Video;

public class LettoreMultimediale {
    public static void main(String[] args) {
        Immagine img1 = new Immagine("img",5);
        img1.show();
        Audio aud1 = new Audio("test",10,10);
        aud1.play();
        Video vid1 = new Video("testvid",5,4,10);
        vid1.play();

        }
    }
