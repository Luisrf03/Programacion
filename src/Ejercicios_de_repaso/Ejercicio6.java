package Ejercicios_de_repaso;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		int horas;
		
		do {

			System.out.println("Introduzca una hora: ");
			horas=teclado.nextInt();
			
		}
		while(horas >=1 || horas <=24); 
		
		if (horas >=6 && horas <=12) {
			System.out.println("Buenos dias");
		}
		else if (horas >=13 && horas <=20 ) {
			System.out.println("Buenas tardes");
		}
		else if (horas >=21 && horas <=5) {
			System.out.println("Buenas noches");
		}
	 }
}
