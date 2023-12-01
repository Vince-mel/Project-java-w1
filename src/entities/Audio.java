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
        String pnt = " ! ";
        String res = "";
        for (int i = 0; i < volume; i++) {
            res= res + pnt;
        }
        for (int i = 0; i < durata; i++) {
            System.out.println("Riproduzione audio: " + titolo +" "+ res);

        }
    }
}
