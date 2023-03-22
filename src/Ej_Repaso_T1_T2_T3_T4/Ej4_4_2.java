package Ej_Repaso_T1_T2_T3_T4;

import java.util.Scanner;

public class Ej4_4_2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String nom1, nom2;
		int n1, n2;
		String nom3, nom4;
		
		System.out.println("Introduce un nombre y un appelido: ");
		nom1=teclado.nextLine();
		System.out.println("Introduce otro nombre y un appelido: ");
		nom2=teclado.nextLine();
		
		n1=nom1.indexOf(' ');
		n2=nom2.indexOf(' ');
		
		nom3=nom1.substring((n1+1), nom1.length());
		nom4=nom1.substring((n2+1), nom2.length());
		
		nom1=nom1.replace(nom3, nom4);
		nom2=nom2.replace(nom4,nom3);
		System.out.println(nom1);
		System.out.println(nom2);
	}

}
