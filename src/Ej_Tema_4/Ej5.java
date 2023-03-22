package Ej_Tema_4;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String frase;
		String esImpar;
		
		System.out.println("Introduzca una frase de no mas de 80 caracteres: ");
		frase=teclado.nextLine();
		
		if (frase.length() > 80) {
			System.out.println("La frase ha de contar solo con 80 caracteres: ");
		}
		else 
			for (int i=0; i < frase.length();i++) {
				
				
			}
		
		
	}
}
