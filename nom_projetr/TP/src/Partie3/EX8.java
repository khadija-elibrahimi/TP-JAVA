package Partie3;
import java.util.Scanner;
public class EX8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrice = new int[3][3];

        
        System.out.println("Entrez les éléments de la matrice 3x3 :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "] : ");
                matrice[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Matrice :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
