package Ej_Tema_5_2;

public class Ej_Plato {

	public static void main(String[] args) {
		double rest;
		Plato p1 = new Plato();
		Menu m1 = new Menu();
		Plato p2 = new Plato();

		System.out.println("Primer PLATO");
		System.out.println("--------------");
		p1.leerDatos();
		System.out.println("Segundo PLATO");
		System.out.println("---------------");
		p2.leerDatos();
		System.out.println("Bebida y Postre");
		System.out.println("-----------------");
		m1.leerDatos();
		System.out.println("Mostrar:");
		p1.veerDatos();
		p2.veerDatos();
		m1.veerDatos();
		

	}

}
