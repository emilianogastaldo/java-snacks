package snacks;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class snack5 {
    public static void main(String[] args) {
        /*Snack5
         Data una stringa in input mostrare a video quanti caratteri alfabetici contiene,
         quanti numeri e quanti simboli non alfanumerici.
         Continuare a chiedere una nuova stringa finchè non si inserisce 0.
         */
        String input;
        Scanner scanner = new Scanner(System.in);
        do {

        System.out.println("Inserisci una stringa");
        input = scanner.nextLine().trim();
        if (!input.equals("0")){

        int numeri = 0;
        int lettere = 0;
        int altro = 0;
        for (int i = 0; i < input.length(); i++) {
            if(isLetter(input.charAt(i))) lettere++;
            else if (isDigit(input.charAt(i))) numeri++;
            else altro++;
        }
        System.out.println("La parola " + input +" contiene:");
        System.out.println(lettere+" lettere, " + numeri + " numeri e "+ altro + " simboli non alfanumerici");
        }
        } while (!input.equals("0"));
        scanner.close();
    }
}
