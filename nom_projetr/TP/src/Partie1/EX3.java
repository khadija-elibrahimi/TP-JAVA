package Partie1;
import java.util.Scanner;
public class EX3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("donner un nombres : ");
		int E=sc.nextInt();
		int P;
		System.out.println("Table de multiplication est  :");
		
		for(int i=0 ; i<=10; i++) {
			P=E*i;
			System.out.println(E + " x " + i + " = " + (E * i));
        }
			
		}
		
		

	}


