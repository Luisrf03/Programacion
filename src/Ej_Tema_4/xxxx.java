package Ej_Tema_4;

import java.util.Scanner;

public class xxxx {

	public static void main(String[] args) {
		Scanner teclado =  new Scanner (System.in); 
			
		int n1 = 0;
		int n2 = 0;
		int suma = 0;
		
		do {
			System.out.println("METE UN NUMERO n1:");
			n1= teclado.nextInt();
			System.out.println("METE UN NUMERO n2:");
			n2= teclado.nextInt();	
		}
		while(n1 < 0 ||  n2 < 0);
		
		suma = n1 +n2;
		System.out.println(suma);
		
	
		
		
		

	}

}
