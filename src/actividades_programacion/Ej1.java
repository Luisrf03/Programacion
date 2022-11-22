package actividades_programacion;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num1;
		int num2;
		int suma=0;
		int contador;
		
		
		System.out.println("Introduzca un numero entero: ");
		num1= teclado.nextInt();
		System.out.println("Introduzca otro numero entero: ");
		num2= teclado.nextInt();
		

 
		if (num1< num2) {
			System.out.println("El primero numero entero ha de ser mayor que el segundo");
		}//if
		else if (num1==num2){
			System.out.println("Los numeros introducidos son iguales");
		}//if
			else {
				contador=num1+1;
				while (contador < num2 );
					suma=suma+contador;
					contador++;
		}//else				
		System.out.println("La suma de digitos entre tus numeros es: "+ suma);						
	}//main
}//class