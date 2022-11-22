package Tema4Problemas;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		String frase;
		String palabra;
		String p2;
		
		
		System.out.println("Introduzca una frase: ");
		frase= teclado.nextLine();
		System.out.println("Introduzca la palabra que quieras buscar: ");
		p2= teclado.nextLine();
		
		if (frase.length() > 80 ) {
			System.out.println("La frase ha de ser como maximo de 80 caracteres");
			System.out.println("Introduzca una frase de no mas de 80 caracteres: ");
			frase=teclado.nextLine();
			System.out.println("Introduzca la palabra que quieras buscar: ");
			p2= teclado.nextLine();
		System.out.println("La posicion de la palabra en la frase introducida esta "
					+ "en la posicion " + frase.indexOf(p2)+1);
		}else
		System.out.println("La posicion de la palabra en la frase introducida esta "
				+ "en la posicion " + frase.indexOf(p2)+1);	
	}
}
