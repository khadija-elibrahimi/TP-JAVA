package Partie3;
import java.util.Scanner;
public class EX10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrice = new int[3][3];
        int[][] transposer = new int[3][3];

        // Lecture
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "] : ");
                matrice[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                transposer[j][i] = matrice[i][j];
            }
        }

        System.out.println("Matrice originale :");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrice transposée :");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(transposer[i][j] + " ");
            }
            System.out.println();
        }
    }
}