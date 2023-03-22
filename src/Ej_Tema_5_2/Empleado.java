package Ej_Tema_5_2;

import java.util.Scanner;

public class Empleado {
	 static Scanner teclado = new Scanner(System.in);

	 	/*Atributos*/
	 
		private String nombre;
		private int num_empleado;
		
		/*Constructor con parametros*/
		
		public Empleado(String nombre, int num_empleado) {
			this.nombre = nombre;
			this.num_empleado = num_empleado;
		}
			
		public String getNombre ( ) {
				return nombre;
		}
		
		public void setNombre ( String nombre ) {
			this.nombre = nombre;
		}
		
		public int getNum_empleado ( ) {
			return num_empleado;
		}
	
		public void setNum_empleado ( int num_empleado ) {
		this.num_empleado = num_empleado;
		}
		
		
		/*Metodos*/
		private void leerEmpleado() {
			
			System.out.println("Introduzca el nombre del empleado: ");
			nombre = teclado.nextLine();
			System.out.println("Introduzca el numero del empleado: ");
			num_empleado = teclado.nextInt();
		}
		
		public void veerEmpleado() {
			leerEmpleado();
			System.out.println("El nombre del empleado es : " + nombre);
			System.out.println("El numero del empleado es : " + num_empleado);
		}
		
		

	
}



