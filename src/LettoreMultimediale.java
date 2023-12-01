import entities.Audio;
import entities.Immagine;

public class LettoreMultimediale {
    public static void main(String[] args) {
        Immagine img1 = new Immagine("img",5);
        img1.show();
        Audio aud1 = new Audio("test",10,10);
        aud1.play();

        }
    }
