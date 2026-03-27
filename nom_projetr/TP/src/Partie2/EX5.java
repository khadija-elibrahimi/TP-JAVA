package Partie2;
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner la taille du tableau : ");
        int N = sc.nextInt();

        int[] tableau = new int[N];

        System.out.println("Entrez " + N + " entiers :");
        for (int i = 0; i < N; i++) {
            tableau[i] = sc.nextInt();
        }

        System.out.println("Les éléments du tableau sont :");
        for (int i = 0; i < N; i++) {
            System.out.print(tableau[i] + " ");
        }

        sc.close();
    }
}
