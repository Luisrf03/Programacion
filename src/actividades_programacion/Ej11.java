package actividades_programacion;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num;
		boolean esPrimo=false;
		boolean prueboPrimo=false;
		int primoExceso;
		
		System.out.println("Introduzca un numero entero: ");
		num=teclado.nextInt();
		for (primoExceso=1; primoExceso<num -1; primoExceso++) {		
		
		}
		
		for (int i=2; i<primoExceso-1 ; i++){
			if (primoExceso % i==0) 
				prueboPrimo= false;									
		}		
		if (prueboPrimo == true)
			
			esPrimo=true;										

		System.out.println(primoExceso+" es primo.");
	}
}
