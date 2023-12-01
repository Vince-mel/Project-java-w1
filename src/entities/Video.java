package entities;

public class Video extends ElementoMultimediale implements Riproduci{
    private int luminosita;
    private int durata;
    private int volume;

    public Video(String titolo, int luminosita, int durata, int volume) {
        super(titolo);
        this.luminosita = luminosita;
        this.durata = durata;
        this.volume = volume;
    }

    public  void abbassaVolume(){
        volume--;
    }

    public void alzaVolume() {
        volume++;
    }


    public void aumentaLuminosita(){
        luminosita++;
    }

    public void diminuisciLuminosita(){
        luminosita--;
    }

    @Override
    public void play() {
        Riproduci.super.play();
    }
}
