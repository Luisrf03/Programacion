package Ej_Tema_6;

public class Empleado {
		private String nombre;
		private int numero;
		private static int matricula = 1;
	
	public Empleado () {
		numero = matricula++;
	}
	
	public Empleado(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public void setNumero (int numero) {
		this.numero = numero;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String toString() {
		return numero + "-" + nombre;
	}
		
}
