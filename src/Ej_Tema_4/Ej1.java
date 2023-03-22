//Leer una frase de maxima 80 caracters y escribirla progresivamente.


package Ej_Tema_4;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String frase;
		String cadena="";
		
		System.out.println("Introduzca una frase: ");
		frase=teclado.nextLine();
		
		if (frase.length() > 80 ) {
			System.out.println("La frase ha de ser como maximo de 80 caracteres");
		}		
		else
			for (int i=0; i <frase.length();i++) {
				cadena += frase.charAt(i);
			System.out.println(cadena);
			}
		System.out.println("El numero de caracteres introudcidos son: "+ frase.length());
	}
}
