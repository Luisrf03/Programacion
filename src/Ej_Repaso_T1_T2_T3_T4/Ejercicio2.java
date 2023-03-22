package Ej_Repaso_T1_T2_T3_T4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int  num1;
		int num2;
		int suma;
		int resta;
		int multiplicacion;
		float division;
		
		System.out.println("OPERACIONES ENTRE DOS NUMEROS");
		System.out.println("-----------------------------");
		
		System.out.println("Introduzca un numero: ");
		num1 =teclado.nextInt();
		System.out.println("Introduzca otro numero: ");
		num2 =teclado.nextInt();
		
		suma=num1+num2;
		System.out.println("La suma de los dos numeros es de: "+num1+"+"+num2+"= "+suma);
		
		multiplicacion=num1*num2;
		System.out.println("La multiplicacion de los dos numeros es de: "+num1+"x"+num2+"= "+multiplicacion);
		
		division=num1/num2;
		System.out.println("La division de los dos numeros es de: "+num1+":"+num2+"= "+division);
		
		resta=num1-num2;
		System.out.println("La resta de los dos numeros es de: "+num1+"-"+num2+"= "+resta);
	}

}
