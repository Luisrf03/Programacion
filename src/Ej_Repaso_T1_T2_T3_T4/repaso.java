package Ej_Repaso_T1_T2_T3_T4;

import java.util.Scanner;

public class repaso {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		char caracter;
		int codigo;
		System.out.println("Introduzca un caracter ASCII: ");
		caracter=teclado.next().charAt(0);

		codigo=(int)caracter;
		System.out.println(codigo);
	}

}
