package Ej_Tema_5_2;

import java.util.Scanner;

public class empleados {
	private String nombre;
	private int identificador;
	
	public empleados(String nombre, int identificador) {
		this.nombre = nombre;
		this.identificador = identificador;
	}
	
	public empleados() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public int getIdentificador() {
		return identificador;
	}
	
	public void setIdentidicador (int identificador) {
		this.identificador = identificador;
	}


	public void veerEmpleado() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nombre empleado "+nombre);
		nombre = teclado.nextLine();
		System.out.println("Identificador empleado "+identificador);
		identificador = teclado.nextInt();
	}


}
