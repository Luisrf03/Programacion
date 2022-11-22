package actividades_programacion;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n;
		int factorial;
		int contador;
		
		System.out.println("Introduzca un numero: ");
		n=teclado.nextInt();
		contador= n-1;
		factorial=n;
		
		if (n<=0) {
			System.out.println("El numero ha de ser positivo. ");
			n=teclado.nextInt();
		}
		else 
			
			do {
				factorial=factorial*contador;
				contador--;				
			}
			while(contador > 0); 					
			System.out.println("El factorial de "+n+" es = "+factorial);	
	}
}
