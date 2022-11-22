package Ejercicios_de_repaso;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		double euros;
		double cantidad=0;
		double  pesetas = 166.386;
		
		System.out.println("CONVERTOR DE EUROS A PESETAS ");
		System.out.println("-----------------------------");
		System.out.println("Introduza cuantos euros quieres convertir en pesetas:" );
		euros=teclado.nextInt();
		
		
		
		if (euros < 0)
			System.out.println("La cantidad de euros ha de ser positiva.");
		else if (euros == 0)
			System.out.println("Las pesetas son = 0.");
		else 
			cantidad= euros * pesetas ;
		
		System.out.println("La cantidad de "+ euros+" euros, son  "+ cantidad +" pesetas" );
		
	}
}
