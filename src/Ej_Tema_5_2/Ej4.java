package Ej_Tema_5_2;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		int operacion  = 0 ;
		Scanner teclado = new Scanner (System.in);

		CuentaCorriente c1 = new CuentaCorriente();
		c1.leerDatos();
		c1.veerDatos();
		
		System.out.println("Que operacion desea hacer");
		System.out.println("- (1) Ingresar dinero ");
		System.out.println("- (2) Retirar dinero ");
		
		operacion = teclado.nextInt();
		
		if (operacion == 1) {
			c1.ingresarDinero();
		}else if (operacion == 2) {
			c1.retirarDinero();
		
		}
	}

}
