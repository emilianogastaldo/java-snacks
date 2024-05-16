package snacks;

import java.util.Scanner;

public class snack1 {
    public static void main(String[] args) {
        /*Snack1
        Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.  */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int num = scanner.nextInt();
        if(num % 2 != 0) System.out.println(num+1);
        else System.out.println(num);
        scanner.close();
    }

}
