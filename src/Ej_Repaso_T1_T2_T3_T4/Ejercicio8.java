package Ej_Repaso_T1_T2_T3_T4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		double g=9.18;
		double divi;
		int h;
		double t;
		
		System.out.println("Clculador de Tiempo");
		System.out.println("-------------------");
		
		System.out.println("Introduzca una altura: ");
		h=teclado.nextInt();
		
		h=2*h;
		divi=h/g;
		t= Math.sqrt(divi);
		System.out.println("El tiempo que tarda en caer desde la altura "+ h + " metros, es "+t+" segundos.");
		
	}

}
