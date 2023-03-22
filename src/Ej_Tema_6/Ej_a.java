package Ej_Tema_6;

import java.util.Arrays;
import java.util.Scanner;

public class Ej_a {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in); 
		
		/*
		 * Para crear un vector:
		 * 	TipoDeDatos [] nombrVector;
		 * Para crear una instancia del obj vector:
		 * 	nombreVector = new tipoDeDatos [];
		 * */
		/*
		//Ej_3
		//a)
		float [] puntoFlotante = new float [24];
		//b)
		int [] entero = new int [500];
		//c)
		double [] doblePrecision = new double [50];
		//d)
		char [] caracter = new char [10];
		
		//Ej_4
		//a)
		final int CLASS_SIZE = 30;
		//b)
		int [] quizAvg; //Para declarar un vector
		//c)
		quizAvg = new int [CLASS_SIZE];//Para crear una isntancia del obj vector
		
		//Ej_5
		int [] birdSightings; 
		birdSightings = new int [20];
		
		//Ej_6
		final int TAMAÑO = 100;
		int [] cuenta = new int[TAMAÑO];
		//a)
		for (int i=0; i<TAMAÑO; i++) {
			cuenta [i]=0;
			Arrays.fill(cuenta,0);
		//b)
			cuenta [i] = teclado.nextInt();
		}
		//c
		
		
		//Ej_7
		int[] a = new int[100];
		int[] b = new int[100];
		int j, m;
		int sumaA = 0;
		int sumaB = 0;
		int sumaDiff = 0;
		m = teclado.nextInt();
		for ( j = 0; j < m; j++ ) {
			a[j] = teclado.nextInt();
			b[j] = teclado.nextInt();
		}
		for ( j = 0; j < m; j++ ) {
		sumaA = sumaA + a[j];
		sumaB = sumaB + b[j];
		sumaDiff = sumaDiff + (a[j] - b[j]);
		}
		for ( j = m - 1; j >= 0; j-- )
		System.out.println(a[j] + " " + b[j] + " " + (a[j] - b[j]));
		System.out.println(sumaA + " " + sumaB + " " + sumaDiff);
		System.out.println();
		*/
		
		//Ej_9
		/*int[] muestra = new int[8];
		int i;
		int k;
		for ( k = 0; k < 8; k++ ) {
			muestra[k] = 10 - k;
		//System.out.println(muestra[k]);
		}
		//Ej_10
		for ( i = 0; i < 8; i++ ) {
			if ( i <= 3 )
			muestra[i] = 1;
			else
			muestra[i] = -1;
			//System.out.println(muestra[i]);
		}
		for ( k = 0; k < 8; k++ ) {
			if ( k % 2 == 0 )
			muestra[k] = k;
			else
			muestra[k] = k + 100;
		System.out.println(muestra[k]);	
		}
		*/
			
		int [] muestra = new int [8];
		
		int resultado = 0;
		
		for (int i = 0; i<8; i++) {
			muestra [i] = (int)(Math.random() * 7);
			
			resultado = resultado + muestra [i];
		}
		
		System.out.println("El resultado de la suma es: " + resultado);	
	}
}
