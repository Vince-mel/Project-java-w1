package entities;

public class Immagine extends ElementoMultimediale{
    private  int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

}
