package Ej_Tema_5_2;

import java.util.Scanner;

public class Menu {
	private String bebida;
	private String postre;
	
	public Menu ( String bebida, String postre) {
		this.bebida = bebida;
		this.postre = postre;
	}
	
	public Menu() {
		
	}
	
	public void leerDatos( ) {
		Scanner teclado = new Scanner ( System.in );
		
		System.out.println("Que quiere tomra (agua o vino): "+bebida);
		bebida = teclado.nextLine();
		System.out.println("Que quiere postre o cafe: "+postre);
		postre = teclado.nextLine();
	}
	
	public void veerDatos( ) {

		System.out.println("Ha elegido de beber "+bebida);
		System.out.println("De postre "+postre);

	}
	
}
