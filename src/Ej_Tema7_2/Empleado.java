package Ej_Tema7_2;

public class Empleado extends Cliente {

	private int cod_emp;
	
	
	public Empleado (String nombre, String apellidos, int edad, String fecha_nacimiento,int cod_emp) {
		super(nombre,apellidos,edad,fecha_nacimiento);
		this.cod_emp = cod_emp;
	}
	
	public Empleado () {
		
	}

	public void leerDatosEmpleado() {
		leerDatosCliente();
		System.out.println("Codigo: ");
		cod_emp = teclado.nextInt();
	}
	
	public void verDatosEmpleado() {
		verDatosCliente();
		System.out.println("Codigo: " + cod_emp);
	}
	
	
	
	
}
