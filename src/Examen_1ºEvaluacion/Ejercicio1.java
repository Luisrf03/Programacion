package Examen_1ºEvaluacion;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main (String [] args) {
		int numero; //numero que solicitamos (variable)
		Scanner teclado = new Scanner (System.in);
		
		
		do {
		System.out.println ("Introduzca un numero entero positivo: ");
		numero = teclado.nextInt();
	
	if (numero <1)
		System.out.println("No es un numero entero positivo");
		}while(numero<1);

		for (int i=0; i<numero; i++) {
		for (int j=0; j<i; j++) {
				System.out.print("  ");//espacio
		for (j=i; j<numero; j++) { //asteriscosç
			System.out.print('*');
			System.out.println();
			
				}
			}
		}
	}
}



