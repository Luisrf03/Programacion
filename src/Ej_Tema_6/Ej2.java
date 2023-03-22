package Ej_Tema_6;

public class Ej2 {

	public static void main(String[] args) {

		int [] vector1 = new int [10];
		int [] vector2 = new int [10];
		int [] vector3 = new int [10];
		
		System.out.println("Primer vector: ");
		for (int i = 0; i <10; i++) {
			vector1[i] = (int) (Math.random() * 10)+1;
			System.out.print(vector1[i]+" ");
		}
		System.out.println();
		System.out.println("Segundo vector: ");
		for (int i = 0; i <10; i++) {
			vector2[i] = (int) (Math.random() * 10)+1;
			System.out.print(vector2[i]+" ");
		}
		
		System.out.println();
		System.out.println("Suma de los vectores: ");
		for (int j = 0; j<10; j++) {
			vector3[j] = vector1[j] + vector2[j];
			System.out.print(vector3[j]+ " ");
			
		}
	}
}
