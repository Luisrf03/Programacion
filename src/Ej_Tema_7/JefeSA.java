package Ej_Tema_7;

import java.util.Scanner;

public class JefeSA extends EmpleadoSA {
	private int plus;
	private String departamento;
	static Scanner teclado = new Scanner (System.in);
	
	public JefeSA() {
		
	}

	public int getPlus() {
		return plus;
	}

	public void setPlus(int plus) {
		this.plus = plus;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public void leerJefe() {
		leerEmpleado();
		
		System.out.println("Introduzca el plus por ser jefe: ");
		plus = teclado.nextInt();teclado.nextLine();
		System.out.println("Introduzca el nombre del departamento");
		departamento = teclado.nextLine();
	
	}
	
	
	public void veerJefe() {
		verEmpleado();
		System.out.println("El plus por ser jefe: "+plus);	
		System.out.println("El nombre del departamento es: "+departamento);
	
	}
	
	
	
	
	
	
	
	
}
