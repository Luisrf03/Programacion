package Ej_Tema_6;

public class Ej4 {

	public static void main(String[] args) {
		int aux = 0;
		int aux1 = 0;
		int cont = 0;
		int n = 0;
		
		int [] v1 = new int [10];
		int [] v2 = new int [10];
		
		System.out.print("Primero vector: ");
		for (int i = 0; i<10; i++) {
			v1[i] = (int)(Math.random() * 5 +1);
			System.out.print(v1[i]+ " ");	
		}
		System.out.println();
		System.out.print("Segundo vector: ");
		for (int i = 0; i<10; i++) {
			v2[i] = (int)(Math.random() * 5 +1);
			System.out.print(v2[i]+ " ");
		}
		System.out.println();
		for (int j = 0; j<v1.length; j++) {	
			for (int k=0; k<v2.length; k++){
			
			if (v1[j] == v2[k]) {
				cont ++;
			}	
			}//for k
			System.out.println("El elemento "+j+" ("+v1[j]+"): "+cont+" veces.");
			cont =0;
		}//for j	
	}
}
