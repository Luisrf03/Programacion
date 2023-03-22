package Ej_Tema_5_2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String nombre = "";
		int num_empleado = 0;
		
		Empleado e1 = new Empleado (nombre, num_empleado);
		e1.veerEmpleado();
		
		
	}
}
