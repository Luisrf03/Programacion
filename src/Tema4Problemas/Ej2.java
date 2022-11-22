package Tema4Problemas;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String frase;
		int mayus =0 ;
		int minus= 0;
		
		
		System.out.println("Introduzca una frase de no mas de 80 caracteres: ");
		frase=teclado.nextLine();
		
		
		if (frase.length() > 80 ) {
			System.out.println("La frase ha de ser como maximo de 80 caracteres");
			System.out.println("Introduzca una frase de no mas de 80 caracteres: ");
			frase=teclado.nextLine();
		}	
		for (int x=0; x<frase.length(); x++) {
		
		if (frase.charAt(x)>='a' &&  frase.charAt(x)<='z' || frase.charAt(x)=='ñ') {
			minus++;
		}else
			if ( frase.charAt(x)>='A' && frase.charAt(x)<='Z' || frase.charAt(x)=='Ñ') {
				mayus++;
			}	
		}
		System.out.println("La frase tienen " + mayus + " mayusculas y " + minus + " minusculas.");
		}
	}		

	


