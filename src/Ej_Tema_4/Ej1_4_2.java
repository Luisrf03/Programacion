package Ej_Tema_4;

import java.util.Scanner;

public class Ej1_4_2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String frase;
		String caracter;

		System.out.println("Introduzca una frase: ");
		frase=teclado.nextLine();
		
		do {
		System.out.println("Introduzca la letra que quieres cambiar: ");
		caracter=teclado.nextLine();
		}while(caracter.length()>1);
		System.out.println(frase.replace(caracter , caracter.toUpperCase()));
		
		
	}

}
