package actividades_programacion;

import java.util.Scanner;

public class Ej6 {
	

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n;
		int sumaPar=0;
		int sumaImpar=0;
		int contador=0;
		
		do {
			System.out.println("Introduzca un numero: ");
			n=teclado.nextInt();
			contador++;
			
		if (contador % 2 ==0) {
			sumaPar+=n;		
		}
		else 
			sumaImpar+=n;			
		}
		 while(n!=0 ); {		 
		}
		System.out.println("La suma de los numeros impares es: "+sumaImpar);
		System.out.println("La suma de los numeros pares es: "+sumaPar);
	}
}