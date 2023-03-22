package Ej_Tema_7;

import java.util.Scanner;

public class Ej3 {

	public static void main(String [] args) {
		Scanner teclado = new Scanner ( System.in);
		int opcion;
		
		System.out.println("Introduzca datos");
		System.out.println("Jefe(1) o Empleado(2)");
		opcion = teclado.nextInt();
		
		
		EmpleadoSA e1 = new EmpleadoSA();
		JefeSA j1 = new JefeSA();
		
		if ( opcion == 1) {
			j1.leerJefe();
			e1.verEmpleado();
			j1.veerJefe();
		}else if ( opcion == 2 ) {
			e1.leerEmpleado();
			e1.verEmpleado();
		}else 
			System.out.println("Error");
	}

}
