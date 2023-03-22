package Ej_Tema_5_2;

import java.util.Scanner;

public class Disco {
	private String titulo;
	private int n_canciones; 
	private double precio;
	private String fecha_compra;
	static private Scanner teclado = new Scanner (System.in);
	
	public Disco(){
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getN_canciones() {
		return n_canciones;
	}
	public void setN_canciones(int n_canciones) {
		this.n_canciones = n_canciones;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getFecha_compra() {
		return fecha_compra;
	}
	public void setFecha_compra(String fecha_compra) {
		this.fecha_compra = fecha_compra;
	}
	
	public void leerDatos() {
		System.out.println("Introduce el titulo del disco: ");
		titulo = teclado.nextLine();
		System.out.println("Introduce el numero de canciones del disco: ");
		n_canciones = teclado.nextInt();
		System.out.println("Introduce el precio del disco: ");
		precio = teclado.nextDouble();teclado.nextLine();
		System.out.println("Introduce la fecha de compra del disco: ");
		fecha_compra = teclado.nextLine();
	}
	public void verDatos() {
		System.out.println("Informacion de los discos");
		System.out.println("Titulo: "+titulo);
		System.out.println("Numero de canciones: "+n_canciones);
		System.out.println("Precio: "+precio);
		System.out.println("Fecha de compra: "+fecha_compra);
		
	}
}
