package Partie3;
import java.util.Scanner;
public class EX9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] matrice=new int[3][3];
		int SOM=0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("enter les element de matrice : ");
				matrice[i][j]=sc.nextInt();
				SOM+=matrice[i][j];}}
		
		 System.out.println("La somme des éléments = " +  SOM);
		

		
	}

}
