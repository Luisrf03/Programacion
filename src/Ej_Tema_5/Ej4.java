package Ej_Tema_5;

import java.util.Scanner;

public class Ej4 {
	
	private int nPrimo (int num) {
		int nums, contador=2, divisor=2;
        int resto;
      
        for (contador=2; contador<num; contador++) {
            do {
                resto=contador%divisor;
                divisor++;
            }//do while2
            while(divisor<contador && resto!=0);
            
            if (resto!=0 || contador==2) {
                System.out.println("Los numeros primos que se encuentran entre 0 y "+num+" son: "+contador+"/n");
                
            }//if
                divisor=2;
        }//for
        return contador;
	}
	
	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		int num1, aux;
		
		do{System.out.println("Introduzca un numero positivo: ");
		num1= teclado.nextInt();
		}while (num1<0);
		
		Ej4 p =new Ej4();
		aux=p.nPrimo(num1);
		System.out.println("Los numeros "+aux+" son primos");

	}

}
