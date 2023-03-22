package Ej_Tema_6;

public class Conductor_Ej7 {

	public static void main(String[] args) {
		Conjunto_Ej7 c = new Conjunto_Ej7 ();
		
		if ( c.agregar(4) )
			System.out.println("Agregado 4");
		if ( c.esMiembro(4) )
			System.out.println("Es miembro 4");
		else
			System.out.println("No es miembro 4");
		if ( c.esMiembro(6) )
			System.out.println("Es miembro 6");
		else
			System.out.println("No es miembro 6");
	}

}
