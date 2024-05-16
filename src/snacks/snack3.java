package snacks;

import java.util.Arrays;

public class snack3 {
    public static void main(String[] args) {
        /*Snack3
        Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
        */
        int[] numeri = {1,2,3,4,5,6,7,8,9,10}; //risultato 30.
        int risultato = 0;
        for (int i = 0; i < numeri.length; i++) {
            if(i % 2 != 0) risultato += numeri[i];
        }
        System.out.println("Array di partenza: " + Arrays.toString(numeri));
        System.out.println("Il risultato è: "+risultato);

    }
}
