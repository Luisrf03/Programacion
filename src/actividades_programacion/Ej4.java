package actividades_programacion;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		boolean esPrimo=true;
		int n;
		int noPrimo;
		
		System.out.println("Introduzca un numero: ");
		n=teclado.nextInt();
		
		
		for (int i = 2; i< n ; i++) {
			
			if ( n % i ==0) {
				esPrimo= false;					
		}//if					
		}//for
			if (esPrimo==false) {
				System.out.println("El numero "+ n + " no es primo");
			}//if		
			else
				System.out.println("El numero "+ n + " es primo");				 				
	}//main												
}//class




