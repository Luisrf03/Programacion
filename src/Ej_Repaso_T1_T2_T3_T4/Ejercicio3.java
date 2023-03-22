package Ej_Repaso_T1_T2_T3_T4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		int base;
		int altura;
		int area;
		
		System.out.println("CALCULO DE AREA DE UN RECTANGULO");
		System.out.println("--------------------------------");
		
		System.out.println("Introduzca la base del rectangulo: ");
		base=teclado.nextInt();
		System.out.println("Introduzca la altura del rectangulo: ");
		altura=teclado.nextInt();
		
		area=base*altura;
		System.out.println("El area del rectangulo es de: "+area);
		
		
		
	}
}
