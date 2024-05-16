package snacks;

import java.util.Scanner;

public class snack4 {
    public static void main(String[] args) {
        /*Snack4
        Data in input una stringa verificare se è palindroma*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi una parola e vedrò se è palindroma");
        String input = scanner.nextLine().trim();
        String messaggio = "La parola è palindroma";
        for (int i = 0; i < (input.length()/2); i++) {
            if(input.charAt(i) != input.charAt(input.length()-i-1) )messaggio = "La parola NON è palindroma";
        }
        System.out.println(messaggio);
        scanner.close();
    }
}
