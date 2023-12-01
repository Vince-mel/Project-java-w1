package entities;

public class Immagine extends ElementoMultimediale{
    private  int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita(){
        luminosita++;
    }

    public void diminuisciLuminosita(){
        luminosita--;
    }

    public void show() {
        String astr = " * ";
        String res = "";
        for (int i = 0; i < luminosita; i++) {
            res= res + astr;
        }

        System.out.println("Immagine: : " + titolo +  res);
    }
}
