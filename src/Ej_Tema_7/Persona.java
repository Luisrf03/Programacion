package Ej_Tema_7;

import java.util.Scanner;

public class Persona {
	private String nombre;
	private int num_empleados;
	private int cod_empleado;
	
	public Persona () {
		
	}
	
	public void pedirTodosDatos() {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca el nombre de la empresa: ");
		nombre =teclado.nextLine();
		System.out.println("Introduzca el numero de empleados: ");
		num_empleados = teclado.nextInt();
		System.out.println("Introduzca el codigo del empleado: ");
		cod_empleado = teclado.nextInt();
	}
	
	public void viusualizarDatos() {
		System.out.println("Nombre de la empresa: "+nombre);
		System.out.println("Numero de empleados: "+num_empleados);
		System.out.println("Codigo del empleado: "+cod_empleado);
	}
	
	
	
	
	
}
