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
//        Creo delle stringhe da modificare
        String hourStr, minStr, secStr = "";
        if(hour < 10) hourStr = "0"+hour;
        else hourStr = String.valueOf(hour);
        if(min < 10) minStr = "0"+min;
        else minStr = String.valueOf(min);
        if(sec < 10) secStr = "0"+sec;
        else secStr = String.valueOf(sec);
//      Stampo il risultato
        System.out.println(seconds+" secondi equivalgono a "+hourStr+":"+minStr+":"+secStr);
        scanner.close();
    }
}
