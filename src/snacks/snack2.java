package snacks;

import java.util.Random;

public class snack2 {
    public static void main(String[] args) {
       /* Snack2
        Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
        e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
        */
        String[] nomi = {"Mario", "Luca", "Giorgio", "Lucia", "Anna"};
        String[] cognomi = {"Rossi", "Bianchi", "Perusi", "Cantafio", "Amico"};
        Random generator = new Random();
        for (int i = 0; i < 10; i++) {
            int nome = generator.nextInt(0,4);
            int cognome = generator.nextInt(0, 4);
            System.out.println("Invitato numero "+ (i+1) + ": " + nomi[nome] + " " +cognomi[cognome] + ".");
        }

    }
}
