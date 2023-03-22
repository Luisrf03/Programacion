package Ej_Tema_5;

import java.util.Scanner;

/**
 * 
 * @author Luisrf03
 * Clase para hacer la ecuacion de segundo grado
 *
 */
public class RaizCuadrada{ 
	private double a;
	private double b;
	private double c;
	
	public  void veerDatos () {
		double result ;
		double ecu1 ;
		double ecu2 ;
		double raiz;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca valor de 'a':" );
		a = teclado.nextDouble();
		System.out.println("Introduzca valor de 'b':" );
		b = teclado.nextDouble();
		System.out.println("Introduzca valor de 'c':" );
		c = teclado.nextDouble();
		
		result = ( this.b * this.b ) - ( 4 * this.a * this.c );
	
		if (result < 0) {	
			
			System.out.println("No se pudo ejecutar la ecuacion, verifiquelo otra vez.");		
			
		}else if (result == 0) {
			
			raiz = -b / (2 * a);
			System.out.println("Solo existe una raiz: "+raiz);
			
		}else {
			ecu1 = (b*(-1)) + Math.sqrt(result) / 2*a;
			ecu2 = (b*(-1)) - Math.sqrt(result) / 2*a;
			
			System.out.println("Resultado de la primera ecuacion; "+ecu1+" resultado de la segunda ecuacion; "+ecu2);
		}
						
	}//RaizCuadrada	
}//class
