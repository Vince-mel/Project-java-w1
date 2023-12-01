package entities;

public class Audio extends ElementoMultimediale implements Riproduci{

   private  int volume;
   private  int durata;

    public Audio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    public  void abbassaVolume(){
        volume--;
    }

    public void alzaVolume() {
        volume++;
    }

    @Override
    public void play() {
        Riproduci.super.play();
    }
}
