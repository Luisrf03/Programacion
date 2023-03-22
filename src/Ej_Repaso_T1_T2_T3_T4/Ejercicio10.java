package Ej_Repaso_T1_T2_T3_T4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int horas;
		int numh=0;
		int mins;
		int numM=0;
		int segundos;
		int convertidorh;
		int convertidorm;
		
		System.out.println("Introduzca la hora: ");
		horas=teclado.nextInt();
		System.out.println("Introduzca los minutos: ");
		mins=teclado.nextInt();
		
		
		
		for (int i=0; i<=24; i++) { //decimos que i cuente hasta 24, que son las horas que hay hasta medianoche.
			if (i>horas) {//decimos que mientras i sea mas grande que horas, sume 1 al contador numh,
				numh++; //asi como i contara hasta 24, sabremos cuantas horas quedan
			}
		}
		for (int j=0; j<=60;j++) { //decimos que j cuente hasta 60, que son los mins que tiene una hora
			if (j>mins) { //decimos que mientras j sea mas grande que minutos, sume 1 al contador numM,
				numM++;	//asi como j contara hasta 60, sabremos cuantos mins quedan
			}
		}
		convertidorh=numh*3600;// asi lo pasamos a segundos
		convertidorm= numM*60;//asi lo pasamos a segundos
		
		segundos=convertidorh+convertidorm;
		System.out.println("Quedan "+numh+" horas y "+numM+" minutos para mediaoche, es decir "+segundos+" segundos.");	
		
	}

}
