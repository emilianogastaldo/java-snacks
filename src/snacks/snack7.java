package snacks;

import java.util.Scanner;

public class snack7 {
    public static void main(String[] args) {
        /*Snack 7
         Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi
         e mostri a video la stringa generata (secondi → “hh:mm:ss”)
         */
        Scanner scanner = new Scanner(System.in);
//        Recupero i secondi dall'utente
        System.out.println("Dammi i secondi: ");
        int seconds = scanner.nextInt();
//        Calcolo quante ore, minuti e secondi sono
        int hour = seconds/3600;
        int hourRest = seconds % 3600;
        int min = hourRest/60;
        int sec = hourRest % 60;

//      Stampo il risultato
        System.out.println(seconds+" secondi equivalgono a "
                +String.format("%02d", hour)+":"
                +String.format("%02d", min)+":"
                +String.format("%02d", sec));
        scanner.close();
    }
}
