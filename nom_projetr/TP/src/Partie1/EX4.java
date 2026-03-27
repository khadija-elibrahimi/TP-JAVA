package Partie1;
import java.util.Scanner;
public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre N : ");
        int N = scanner.nextInt();

        int i = 1;
        int somme = 0;

        while (i <= N) {
            somme = somme + i;
            i++;
        }
        System.out.println("La somme des " + N + " premiers entiers est : " + somme);

        scanner.close();
    }
}
