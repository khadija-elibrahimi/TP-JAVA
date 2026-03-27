package Partie1;
import java.util.Scanner;
public class EX1 {
	 public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 System.out.print("enter un nombre : ");
    	int A =sc.nextInt();
		 
    	if(A>0) {
    		System.out.print("le nombre est positif");
    	}else if(A<0) {
    		System.out.print("les nombr est negative");
    		
    	}else {
    		System.out.print("les nombr est null");} 
        sc.close();
}}
