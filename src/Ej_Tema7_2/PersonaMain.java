package Ej_Tema7_2;

public class PersonaMain {

	public static void main(String[] args) {
		
		Empleado e = new Empleado ();
		Cliente c = new Cliente ();
		
		System.out.println("Datos del Cliente: ");
		c.leerDatosCliente();
		System.out.println("Datos del Empleado: ");
		e.leerDatosEmpleado();
		System.out.println("Datos del Cliente: ");
		c.verDatosCliente();
		System.out.println("Datos del Empleado: ");
		e.verDatosEmpleado();
		

		 
		
		
	}

}
