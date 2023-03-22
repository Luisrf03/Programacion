package Ej_Tema_7;

import java.util.Scanner;

public class EmpleadoSA {
	private static final String NOM_EMPRESA = "Abbot" ;
	private String nombre;
	private int edad;
	private double  incre_sueldo;
	private double sueldo;
	
	public  EmpleadoSA () {
		
	}
	
	public   EmpleadoSA (String nombre, int edad, double incre_sueldo, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.incre_sueldo = incre_sueldo;
		this.sueldo = sueldo;
	}
	
	public String getNom_empresa() {
		return NOM_EMPRESA;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getIncre_sueldo() {
		return incre_sueldo;
	}


	public void setIncre_sueldo(double incre_sueldo) {
		this.incre_sueldo = incre_sueldo;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public void veerDatos() {
		
		
	}
	
	public void leerEmpleado() {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca el nombre del empleado: ");
		nombre = teclado.nextLine();
		System.out.println("Introduzca la edad del empleado: ");
		edad = teclado.nextInt();
		System.out.println("Introduzca el incremento del sueldo: ");
		incre_sueldo = teclado.nextInt();
		System.out.println("Introduzca el sueldo del empleado: ");
		sueldo = teclado.nextInt();
		
	
	}
	
	public void verEmpleado() {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("El nombre de la empresa: "+NOM_EMPRESA);
		System.out.println("El nombre nombre del empleado: "+nombre);
		System.out.println("Introduzca la edad del empleado: "+edad);
		System.out.println("El sueldo del empleado: "+sueldo);
		System.out.println("Introduzca el incremento del sueldo del empleado: "+incre_sueldo);
		
		
	
	}
	
	
}
