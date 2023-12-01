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

        String astr = " * ";
        String res = "";
        for (int i = 0; i < luminosita; i++) {
            res= res + astr;
        }

        String pnt = " ! ";
        String res1 = "";
        for (int i = 0; i < volume; i++) {
            res= res + pnt;
        }
        for (int i = 0; i < durata; i++) {
            System.out.println("Riproduzione video: " + titolo +" "+ res1 + " " + res);

        }
    }
}
