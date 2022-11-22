package actividades_programacion;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n;
		int suma=0;
		int contador=0;
		
		do {
		System.out.println("Introduzca un numero: ");
		n=teclado.nextInt();
		contador++;
		suma+=n;			
		}//do
		
		while(n!=0); {									
		}//while
		
		System.out.println("La suma de todos los numeros introducidos es: "+suma+" "
				+ "y has introducido en  total: "+ (contador-1));
	}//main
}//class

