package Ej_Tema_5;

import java.util.Scanner;

public class Ej3 {
	
	private int factorial(int num) {
		int aux = 1;
		
		for ( int i=1 ; i<num;i++) {
			aux+=aux*i;
			}
		return aux;
	}
	public static void main(String[] args) {
		Scanner teclado  = new Scanner (System.in);
		int num1, auxnum;
		
		do{System.out.println("Introduzca un numero positivo: ");
		num1=teclado.nextInt();
		}while(num1<0);
		Ej3 n= new Ej3();
		auxnum= n.factorial(num1);
		System.out.println("El factorial del numero "+num1+" es "+auxnum);


	}

}
