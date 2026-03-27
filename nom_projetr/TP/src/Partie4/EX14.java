package Partie4;

import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne : ");
        String str = sc.nextLine();

        String original = str.replaceAll("\\s+", "").toLowerCase();
        String inverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            inverse += original.charAt(i);
        }

        if (original.equals(inverse)) {
            System.out.println("C'est un palindrome.");
        } else {
            System.out.println("Ce n'est pas un palindrome.");
        }
    }
}