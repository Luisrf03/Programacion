package EjRepaso_2ªEv;

public class Ej1 {
	public static void main(String[] args) {
		int [] numero = new int [20];
		int [] cuadrado = new int [20];
		int [] cubo = new int [20];
		
	for (int i = 0; i < numero.length; i++) {
		numero [i]  = (int)(Math.random() * 100)+1;		
	}
	
	for (int j = 0; j < 20; j++) {
		int contador;
		contador = numero[j];
		cuadrado[j] = (int)(Math.pow(contador, 2));
	}	
	
	for (int k = 0; k < 20; k++) {
		int contador;
		contador = numero[k];
		cubo[k] = (int)(Math.pow(contador, 3));
	}
	
	for (int l = 0; l < numero.length;l++) {
		System.out.println(numero[l]+"\t"+ cuadrado[l]+"\t"+cubo[l]+"\t");
	}
	
	}	
}
