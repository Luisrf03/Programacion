package Ejercicios_de_repaso;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		int numHoras;
		int salario;
		int extras;
		int diferencia;
	
		System.out.println("Introduzca el numero de horas que ha realizado el trabajador: ");
		numHoras=teclado.nextInt();
		
	
		if (numHoras<= 0) {
			System.out.println("El numero de horas introducido es incorrecto.");
			
		}else if (numHoras<=40) {
			salario=numHoras*12;
			System.out.println("El salario del trabajador en proporcion a las horas trabajads son "+
					+salario+" euros");	
			
			
		}else if (numHoras>40) {
			salario=40*12;
			diferencia=numHoras-40;
			extras=diferencia *16;
			salario=extras+salario;
			
			System.out.println("El salario del trabajador en proporcion a las horas trabajads son "+
					+salario+" euros");

		}	
		
	}
}
