package Ej_Repaso_T1_T2_T3_T4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int mes;
		int dia;
	
	System.out.println("Introduce tu dia de nacimiento: ");
	dia=teclado.nextInt();
	System.out.println("Introduce tu mes de nacimiento");
	mes=teclado.nextInt();
	
	if (dia >=21 && mes== 3 || dia<=21 && mes ==4) {
		System.out.println("Tu simbolo del zodiaco es Aries");
		
	}else if (dia >=21 && mes== 4 || dia<=22 && mes ==5) {
		System.out.println("Tu simbolo del zodiaco es Tauro");
		
	}else if (dia >=22 && mes== 5 || dia<=21 && mes ==6) {
		System.out.println("Tu simbolo del zodiaco es Cancer");
		
	}else if (dia >=22 && mes== 6 || dia<=22 && mes ==7) {
		System.out.println("Tu simbolo del zodiaco es Cancer");
		
	}else if (dia >=23 && mes== 7 || dia<=22 && mes ==8) {
		System.out.println("Tu simbolo del zodiaco es Leo");
		
	}else if (dia >=23 && mes== 8 || dia<=22 && mes ==9) {
		System.out.println("Tu simbolo del zodiaco es Virgo");
		
	}else if (dia >=23 && mes== 9 || dia<=22 && mes ==10) {
		System.out.println("Tu simbolo del zodiaco es Libra");
		
	}else if (dia >=23 && mes== 10 || dia<=22 && mes ==11) {
		System.out.println("Tu simbolo del zodiaco es Escorpio");
	
	}else if (dia >=23 && mes== 11 || dia<=21 && mes ==12) {
		System.out.println("Tu simbolo del zodiaco es Sagitario");
	
	}else if (dia >=22 && mes== 12 || dia<=20 && mes ==1) {
		System.out.println("Tu simbolo del zodiaco es Capricornio");
	
	}else if (dia >=21 && mes== 1 || dia<=19 && mes ==2) {
		System.out.println("Tu simbolo del zodiaco es Acuario");
	
	}else if (dia >=20 && mes== 2 || dia<=20 && mes ==3) {
		System.out.println("Tu simbolo del zodiaco es Piscis");
	
		}
	}
}

