package Ej_Repaso_T1_T2_T3_T4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int entradas;
		String dia;
		int personas, solo = 0, presolo;
		String CinePas;
		double precio=8;
		boolean tarjeta;
		double descuento;
		int parejas;
		do {
		System.out.println("Introduzca el numero de entradas deseadas: ");
		entradas=teclado.nextInt();teclado.nextLine();//necesitamos un salto de linea para que lea el siguiente.
		System.out.println("Introduzca el dia deseado: ");
		dia=teclado.nextLine();
		System.out.println("Tienes la tarjeta CinePas?:");
		CinePas=teclado.nextLine();
		
		if ( !(dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") || dia.equals("jueves") ||
				dia.equals("viernes") || dia.equals("sabado") || dia.equals("domingo")))
			System.out.println("Error, la opcion seleccionada es incorrecta.");
		
		if (CinePas.equals("si")) {
			tarjeta = true;	
		}else
			tarjeta= false;
		dia=dia.toLowerCase();
		descuento= (precio*10)/100;
		
		}while(!(dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") || dia.equals("jueves") ||
				dia.equals("viernes") || dia.equals("sabado") || dia.equals("domingo")) ) ;
		switch(dia) {
			case "lunes":case "martes": case "sabado": case "viernes": case"domingo":
					if (tarjeta == true) {
						precio= (precio-descuento)*entradas;
						System.out.println("El numero de entradas escogidas es "+entradas+", para el dia "+dia+" y son "+precio+" euros.");
						break;
					}else if (tarjeta == false)
						precio=precio*entradas;
						System.out.println("El numero de entradas escogidas son "+entradas+", para el dia "+dia+" y son "+precio+" euros.");
			break;
			case "miercoles":
				precio=5;
					if (tarjeta == true) {
						precio= (precio-descuento)*entradas;
						System.out.println("El numero de entradas escogidas son "+entradas+", para el dia "+dia+" y son "+precio+" euros.");
						break;
					}else 
						if (tarjeta==false)
							precio=precio*entradas;
							System.out.println("El numero de entradas escogidas son "+entradas+", para el dia "+dia+" y son "+precio+" euros.");
								
			break;
			case "jueves":
				parejas=entradas/2;
				solo%=parejas;
				
				if (tarjeta == true) {
					if (entradas>=2)
						precio=11;
						precio= (precio-descuento)*parejas;
						
					System.out.println("El numero de entradas escogidas son "+entradas+", para el dia "+dia+" y son "+precio+" euros.");
					break;
				}else 
					if (tarjeta==false)
						precio=11;
						precio=precio*parejas;
						presolo=(int) (11*solo);
						System.out.println("El numero de entradas escogidas son "+entradas+", para el dia "+dia+" y son "+precio+" euros mas "+solo+" entrada "+presolo+" euros.");
							
			break;
		}
	}
}
