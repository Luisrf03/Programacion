package Tema4Problemas;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String frase;
		int opcion;
		boolean value =false;
		
		while (value== false) {
			System.out.println("Introduzca una frase: ");
			frase=teclado.nextLine();
			if (frase.length() > 80 ) {
				System.out.println("La frase ha de ser como maximo de 80 caracteres");
				value=false;
				System.out.println("Introduzca una frase: ");
				frase=teclado.nextLine();
				System.out.println("Elige una opcion (Mayusculas(1) o Minusculas(2)): ");
				opcion=teclado.nextInt();teclado.nextLine();
			}else
			
			System.out.println("Elige una opcion (Mayusculas(1) o Minusculas(2)): ");
			opcion=teclado.nextInt();teclado.nextLine();
			
			
		switch (opcion) {
			case 1:
				value=true;
				System.out.println("La frase en mayusculas es: ");
				frase=frase.toUpperCase();
				System.out.println(frase);
				break;
			case 2:
				value=true;
				System.out.println("La frase en minusculas es: ");
				frase=frase.toLowerCase();
				System.out.println(frase);
				break;
			default:
				value=false;
				System.out.println("La opcion elegida no es correcta.");
				break;
			}//switch	
		}//while	
	}//main
}//class
