package Ej_Tema_4;

import java.util.Scanner;

public class Ej4_4_2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String nombre1 , nombre2, apellido1="" , apellido2;
		boolean final1= true;
		int i=0;
		System.out.println("Introduzca un nombre y su apellido: ");
		nombre1=teclado.nextLine();
		System.out.println("Introduzca otro nombre y su apellido: ");
		nombre2=teclado.nextLine();
		

			while (i<nombre1.length())
					i++;
	
			apellido1+=nombre1.lastIndexOf(i);
			System.out.println(apellido1);
		
		}
	}


