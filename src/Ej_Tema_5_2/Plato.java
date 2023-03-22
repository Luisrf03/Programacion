package Ej_Tema_5_2;

import java.util.Scanner;

public class Plato {
	private String nombre;
	private String categoria;
	private double precio;
	
	public Plato ( String nombre, String categoria, int precio ) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
	}
	
	public Plato() {
		
	}

	public void leerDatos( ) {
		Scanner teclado = new Scanner ( System.in );
		
		System.out.println("Ingrese el nombre del plato: ");
		nombre = teclado.nextLine();
		System.out.println("Ingrese la categoria del plato: ");
		categoria = teclado.nextLine();
		System.out.println("Ingrese el precio del plato: ");
		precio = teclado.nextDouble();
	}
	
	public void veerDatos( ) {
		System.out.println("El nombre del plato es: "+ nombre +".");
		System.out.println("La categoria del plato es: "+ categoria +".");
		System.out.println("El precio del plato es: "+ precio +" euros.");
	}
	
	
	
}
