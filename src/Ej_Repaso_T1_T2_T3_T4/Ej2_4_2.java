package Ej_Repaso_T1_T2_T3_T4;

import java.util.Scanner;

public class Ej2_4_2 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		String frase, vacio="";
		String letra;
		
		
		do {
		System.out.println("Introduzca una frase de 80 caracteres como maximo: ");
		frase=teclado.nextLine();
		
		}while (frase.length()>80); 
			
		do {
		System.out.println("Introduzca una letra y se eliminara sus 3 primeras apariciones: ");
		letra=teclado.nextLine();
		
		}while(letra.length()>1);
			for (int i =0; i<3; i++) {
				frase=frase.replaceFirst(letra, vacio="");
			}
		
		
		System.out.println(frase);
	}

}
