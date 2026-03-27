package Partie2;
import java.util.Scanner;
public class EX7 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("donner la taill de tableau : ");
			int N = sc.nextInt();
	        int[] tableau = new int[N];
	        for (int i = 0; i < tableau.length; i++) {
	            System.out.print("Element " + i + " : ");
	            tableau[i] = sc.nextInt(); }
	       int max=tableau[0];
	       for (int i = 1; i < N; i++) {
	       if(max<=tableau[i]) {
	    	   max=tableau[i];
	       }  }
	       System.out.println("Le plus grand element est : " + max);

	        sc.close();}}
