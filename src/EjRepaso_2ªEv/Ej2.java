package EjRepaso_2ªEv;

public class Ej2 {

	public static void main(String[] args) {
		
		int [] vector = new int [20];
		int [] vectorpos = new int [20];
		int [] par = new int [20];
		int [] impar = new int [20];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int)(Math.random() * 100)+1;
			System.out.print(vector[i]+ " ");
		}

			System.out.println();
			
		for (int j = 0; j < vector.length; j++) {
			int posicion;
			int esPar = 0;
			int esImpar = 0;
		
			if (vector [j] % 2 == 0) {
				par[esPar] = vector[j];
				esPar++;
				
			} 
			else {
				impar[esImpar] = vector[j];
				esImpar++;
			}
			
			
		}
		
		for (int k = 0; k < vector.length; k++) {
			if (par[k] != 0) {
				System.out.print(par[k]+" ");
			}else
				System.out.print(impar[k]+" ");
		}
		
		
		
	}
}
