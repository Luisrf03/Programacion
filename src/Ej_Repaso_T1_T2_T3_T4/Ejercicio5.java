package Ej_Repaso_T1_T2_T3_T4;

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
