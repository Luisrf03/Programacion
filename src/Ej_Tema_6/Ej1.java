package Ej_Tema_6;

public class Ej1 {
	
	public static void main (String [] args) {
		
		int [] aleatorio = new int [20];
		int resSuma = 0;
		int resMedia;
		int menor = 0;
		int mayor = 0;
		
		for (int i = 0; i<20; i++) {
			aleatorio[i] = (int)(Math.random() * 20)+1;
			
			System.out.println(aleatorio[i]);
			
			resSuma = resSuma + aleatorio [i];	
		}
		resMedia = resSuma/20;
		System.out.println("Resultado de la media es: "+resMedia);
		
		for (int i = 0; i<20; i++) {
			if (aleatorio[i] < resMedia) {
				menor++;
			}
		}
		System.out.println("Hay "+menor+" numeros inferiores a la media");
		for (int i = 0; i<20; i++) {
			if (aleatorio[i] > resMedia) {
				mayor++;
			}
		}
		System.out.println("Hay "+mayor+" numeros superiores a la media");
		
	}

}
