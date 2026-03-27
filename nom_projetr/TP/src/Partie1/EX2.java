package Partie1;
import java.util.Scanner;
public class EX2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("donner les trois nombres : ");
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		if(B>C && B>D) {
			System.out.print("le plus grand nombre est:"+B);
		}if(C>B && C>D) {
			System.out.print("le plus grande noombre est"+C);
		}if(D>B && D>C) {
			System.out.print("le plus grande nombre est"+D);}
		sc.close();
	}
	
}