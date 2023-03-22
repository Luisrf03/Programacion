package Ej_Repaso_T1_T2_T3_T4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		int numHoras;
		int salario;
		
		System.out.println("Introduzca el numero de horas que ha realizado el trabajador: ");
		numHoras=teclado.nextInt();
		
		salario=numHoras*12;
		System.out.println("El salario del trabajador en proporcion a las horas trabajads son "+
				+salario+" euros");
	}

}
