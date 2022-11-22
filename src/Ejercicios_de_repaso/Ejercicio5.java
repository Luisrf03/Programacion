package Ejercicios_de_repaso;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		double nota;
		double notaEv;
		double notaTotal;
	
		System.out.println("Introduzca la nota que sacaste en el anterior examen: ");
		nota=teclado.nextDouble();
		System.out.println("¿Que nota quieres sacar en la segunda evaluacion?: ");
		notaEv= teclado.nextDouble();
		
		notaTotal= nota*0.3;
		notaEv= notaEv-nota;
		notaTotal+= nota*0.7;
		System.out.println("Para sacar un "+notaEv+" en la segunda evaluacion, tienes que sacar "
				+notaTotal+" en el segundo examen");
		
		
		
	}

}
