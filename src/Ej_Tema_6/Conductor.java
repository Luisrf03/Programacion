package Ej_Tema_6;

public class Conductor  {

	public static void main(String[] args) {
		Empleado [] e = new Empleado [50];
		final String[] nombres = {"uno","dos","tres","luis"};
		
		int creados = 0;
		while (creados < 50) {
			Empleado aux = new Empleado();
			if ( Math.random() < 0.8) {
				aux.setNombre(nombres[(int)(Math.random()*nombres.length)]);
				e[creados++] = aux;
			}
		}
		for (int i = 0 ; i < e.length; i++) {
			System.out.println("Visualizo datos empleado: "+e[i]);
		}
		/*
		e =new Empleado();
		System.out.println("Visualizo datos empleados: "+e);
		e.verDatos();
		System.out.println("Leo datos empleados: "+e);
		e.leerDatos();
		System.out.println("Visualizo datos empleados: "+e);
		e.veerDatos();
		System.out.println("Fin datos empleados: "+e);
		*/
		

	}

}
