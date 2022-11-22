package actividades_programacion;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		boolean esPrimo=false;
		int primoExceso;
		boolean prueboPrimo;
		int num;
		
		System.out.println("Introduzca un numero entero: ");
		num=teclado.nextInt();
		primoExceso = num + 1 ;
		
		while (!esPrimo) {
			prueboPrimo = true;
			
			for (int i=2; i<primoExceso - 1; i++) {
				if (primoExceso % i==0) {
					prueboPrimo=false;	
				}//for		
				}//if
				if(prueboPrimo == true) {
					esPrimo= true;
				}//if
					else 
						primoExceso = primoExceso + 1;																							
		}//while	
		System.out.println("El primo por exceso de "+ num +" : "+ primoExceso);	
	}//main
}//class
