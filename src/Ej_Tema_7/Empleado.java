package Ej_Tema_7;

import java.util.Scanner;

public class Empleado {
		private int sueldo;
		private String nombre;
		
		public Empleado (String nombre, int sueldo) {
			this.sueldo = sueldo;
			this.nombre = nombre;
		}

		public void setsueldo ( int sueldo) {
			sueldo = sueldo;
		}
		
		public void setnombre (String nombre) {
			nombre = nombre;
		}
		public int getsueldo () {
			return sueldo;
		}
		
		public String getnombre () {
			return nombre;
		}		 	
	


	public class jefe extends Empleado {
		private int sueldo;
		private String nombre;
		private String titulo;
		private String departamento;
		
		public jefe (String nombre, String titulo, String departamento, int sueldo) {
			super(nombre, sueldo);
			this.titulo = titulo;
			this.departamento = departamento;
		}
		
		public void setdepartamento (String departamento) {
			departamento = departamento;
		}
		public void settitulo (String titulo) {
			titulo = titulo;
		}
		
		public String getdepartamento () {
			return departamento;
		}
		public String gettitulo () {
			return titulo;
		}
	}

	
	public class visualizaDatos {
		public static void main(String [] args) {
			Scanner teclado = new Scanner (System.in);			
			int num;
			
			System.out.println("Cuantos empleados quieres que le muestre: ");
			num = teclado.nextInt();
			
			
			Empleado nombre = new Empleado("Juan",16000);
			System.out.println("Nombre del empleado: "+nombre.getnombre());
		}
	}
	
}

