package Partie2;
import java.util.Scanner;
public class EX6 {
	 public static int rechercher(int[] tableau, int nombre) {
	        for (int i = 0; i < tableau.length; i++) {
	            if (tableau[i] == nombre) {
	                return i;   } }
	        return -1; }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[]tableau=new int[10];
		System.out.print("donnerles 10 entier");
		 for (int i = 0; i < tableau.length; i++) {
			 System.out.print("Element \" + i + \" :");
			 tableau[i]=sc.nextInt();}
		 
		 
		 
		 
		 System.out.print("donner moi le nombre rechercher");
		 int A=sc.nextInt();
		 int position = rechercher(tableau, A);
		 if(position!= -1) {
			 System.out.print(" le nombre rechercher a trouver a la position : "+position);
		 }else {
			 
			 System.out.print(" le nombre rechercher n'est pas trouver trouver");
			 
			 sc.close();
			 
		 }

		 
		
		
		
	


	}

}
