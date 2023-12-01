import entities.*;

import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {
//        Immagine img1 = new Immagine("img",5);
//        img1.show();
//        Audio aud1 = new Audio("test",10,10);
//        aud1.play();
//        Video vid1 = new Video("testvid",5,4,10);
//        vid1.play();
        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] playlist = new ElementoMultimediale[5];
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Inserisci 1 per selezionare un'immagine, 2 per selezionare un audio, 3 per selezionare un video: ");
            int media = scanner.nextInt();
            scanner.nextLine();


            if (media==1) {
                System.out.println("Inserisci il Titolo dell'immagine: ");
                String titolo = scanner.nextLine();
                System.out.println("Inserisci la luminosità dell'immagine: ");
                int luminosita = scanner.nextInt();
                playlist[i] = new Immagine(titolo,luminosita);
            } else if (media==2) {
                System.out.println("Inserisci il Titolo dell'audio: ");
                String titolo = scanner.nextLine();
                System.out.println("Inserisci il volume dell'audio: ");
                int volume = scanner.nextInt();
                System.out.println("Inserisci la durata dell'audio: ");
                int durata = scanner.nextInt();
                playlist[i] = new Audio(titolo,volume,durata);
            } else if (media==3) {
                System.out.println("Inserisci il Titolo del video: ");
                String titolo = scanner.nextLine();
                System.out.println("Inserisci il volume del video: ");
                int volume = scanner.nextInt();
                System.out.println("Inserisci la durata del video: ");
                int durata = scanner.nextInt();
                System.out.println("Inserisci la luminosità dell video: ");
                int luminosita = scanner.nextInt();
                playlist[i] = new Video(titolo,volume,durata,luminosita);

            }
        }
        System.out.println("Inserisci quale elemento vuoi riprodurre (digita 0 per uscire): ");
        int i = scanner.nextInt();

        if (i >= 1 && i <= playlist.length) {
            ElementoMultimediale elemento = playlist[i - 1];
            if (elemento instanceof Riproduci) {
                ((Riproduci) elemento).play();
            } else if (elemento instanceof Immagine) {
                ((Immagine) elemento).show();
            }
        } else if (i == 0) {
            System.out.println("bye byeeeee ciao");
            System.exit(0);
        } else {
            System.out.println("Indice non valido. Riprova.");
        }

    }
    }
