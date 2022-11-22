package actividades_programacion;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n;
		int suma=0;
		int contador=0;
		int max=0;
		int min=0;
		
		do {
			System.out.println("Introduzca un numero: ");
			n=teclado.nextInt();
			suma+=n;
			contador++;
			
			if (n>max){
				max=n;
			}
			if (n<min && n!=0 ) {
					min=n;
			}
			
		}//do		
		while(n!=0); {						
		}
		float media = suma/(contador-1);
		System.out.println("La media de todos los numeros introducidos es: "+ media);
		System.out.println("El maximo es: "+ max);
		System.out.println("El minimo es: "+ min);																
	}//main
}//class
