package Partie4;

import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne : ");
        String str = sc.nextLine();

        String inverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            inverse += str.charAt(i);
        }

        System.out.println("Chaîne inversée : " + inverse);
    }
}
