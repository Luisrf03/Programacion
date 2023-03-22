package Ej_Tema_5;
import java.util.Scanner;



/*Escribir un método que reciba dos parámetros enteros p y q y devuelva el mínimo
común múltiplo de ambos.*/

public class Ej6 {
	
	private int minCM (int p, int q) {
		int minC = -1, auxp, i = 1;
		
		do {
			auxp = p * i;
			if (auxp % q ==0){
				minC=auxp;
				
			}
			i++;
			
		}while (minC == -1);
		return minC;	
	}
	
	public static void main (String args[]) {
		Scanner teclado = new Scanner (System.in);
		int p,q,minCM;
		
		System.out.println("Introduzca dos numeros enteros para calcular el MCM:");
		q= teclado.nextInt();
		p=teclado.nextInt();
		
		Ej6 n = new Ej6();
		minCM = n.minCM(p, q);
		System.out.println("El minimo comun multiplo de "+p+" y "+q+" es: "+minCM);
	}

	

}
