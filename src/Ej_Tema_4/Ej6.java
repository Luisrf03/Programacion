package Ej_Tema_4;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		String frase;
		int contVocal=0;
		int contConsonante=0;
		String trim;
		
		System.out.println("Introduzca una frase de menos de 80 caracteres: ");
		frase=teclado.nextLine();
		
		while (frase.length()>80) {
		System.out.println("La frase introducida tiene mas de 80 caracteres.");
		System.out.println("Introduzca una frase de menos de 80 caracteres: ");
		frase=teclado.nextLine();
		}//while
		for (int i=0;i<frase.length(); i++) {
			frase=frase.trim();
		if (frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u' ) {
			contVocal++;
		}//if 
		else 
			contConsonante++;
		}//for	
		
		System.out.println("El numero de vocales en la frase es: "+contVocal+", y el numero de consonantes es de: "+
		contConsonante+".");
	}//main
}//class

