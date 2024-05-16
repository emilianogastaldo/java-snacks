package snacks;

import java.util.Scanner;

public class snack6 {
    public static void main(String[] args) {
        /*Snack 6
        Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
            Possibile usare solo :
            cicli
            chartAt
            if / switch
        Es. “25" come stringa deve essere convertito in intero 25.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi un numero");
        String numString = scanner.nextLine();
        int numInt = 0;
        for (int i = 0; i < numString.length(); i++) {
            numInt = numInt * 10 + numString.charAt(i) - '0';
        }
        System.out.println("Stringa: " + numString);
        System.out.println("Integer: " + numInt);
    }
}
