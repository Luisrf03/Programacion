package Ej_Tema7_2;

import java.util.Scanner;

public class Cliente{
	Scanner teclado = new Scanner (System.in);
	private String nombre;
	private String apellidos;
	private int edad;
	private String fecha_nacimiento;
	
	public Cliente (String nombre, String apellidos, int edad, String fecha_nacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public Cliente() {
		
	}

	public void leerDatosCliente() {
		
		System.out.println("Nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Apellidos: " );
		apellidos = teclado.nextLine();
		System.out.println("Edad: ");
		edad = teclado.nextInt();teclado.nextLine();
		System.out.println("Fecha de nacimiento: ");
		fecha_nacimiento = teclado.nextLine();
	}
	
	public void verDatosCliente() {
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);
		System.out.println("Fecha de nacimiento: " + fecha_nacimiento);
	
	}
	
	
	
	
	

}
