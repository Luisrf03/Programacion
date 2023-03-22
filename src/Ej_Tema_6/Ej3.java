package Ej_Tema_6;

public class Ej3 {

	public static void main(String[] args) {
		int mayor = 0;
		int menor = 10;
		int posicionMayor = 0;
		int posicionMenor = 0;

		int [] vector = new int [10];
		System.out.println("El vector es: ");
		for (int i = 0; i<10; i++) {
			vector[i] = (int)(Math.random() * 10 +1);
			System.out.print(vector[i]+ " ");
		}
		for ( int i = 0; i < 10; i++ ) {
				if (vector[i]> mayor) {
					posicionMayor = i+1;
					mayor = vector[i];	
				}
		}
		System.out.println();
		System.out.print("El numero mayor es: "+mayor+" y esta en la posicion: "+posicionMayor);
		System.out.println();
		for ( int i = 0; i < 10; i++ ) {
			if (vector[i]< menor) {
				posicionMenor = i+1;
				menor = vector[i];	
			}
		}
		System.out.println();
		System.out.print("El numero mayor es: "+menor+" y esta en la posicion: "+posicionMenor);

	}
}
