package Ej_Repaso_T1_T2_T3_T4;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		String tijeras, papel, piedra;
		String us1,us2;
		System.out.println("JUEGO PIEDRA , PAPEL O TIJERA");
		
		do {
		System.out.println("Turno del usuario 1");
		System.out.println("Introduce una opcion(piedra papel o tijera): ");
		us1=teclado.nextLine();
		System.out.println("Turno del usuario 2");
		System.out.println("Introduce una opcion(piedra papel o tijera): ");
		us2=teclado.nextLine();
		
		us1=us1.toLowerCase();
		us2=us2.toLowerCase();
		}while (!(us1.equals("papel") || us1.equals("tijeras") || us1.equals("piedra") || us2.equals("papel") || us2.equals("piedra") ||us2.equals("tijeras") ));
		
		switch (us2) {
		case "tijeras":
			if (us1.equals("tijeras") && !us2.equals("tijeras")){
				System.out.println("El usuario1 uso "+us1+" y el usuario2 uso "+us2+", gana el usuario1");
			}else if(us1.equals("tijeras") && us2.equals("tijeras")){
				System.out.println("El usuario 1 uso "+us1+" y el usuario 2 uso "+us2+", empate");
			}else if (!us1.equals("tijeras") && us2.equals("tijeras")) {
				System.out.println("El usuario1 uso "+us1+" y el usuario2 uso "+us2+", gana el usuario2");
			}
			
		break;
		case "papel":
			if (us1.equals("papel") && !us2.equals("papel")){
				System.out.println("El usuario1 uso "+us1+" y el usuario2 uso "+us2+", gana el usuario1");
			}else if(us1.equals("papel") && us2.equals("papel")){
				System.out.println("El usuario 1 uso "+us1+" y el usuario 2 uso "+us2+", empate");
			}else if (!us1.equals("papel") && us2.equals("papel")) {
				System.out.println("El usuario1 uso "+us1+" y el usuario2 uso "+us2+", gana el usuario2");
			}
			//break;
		case "piedra":
			if (us1.equals("piedra") && !us2.equals("piedra")){
				System.out.println("El usuario1 uso "+us1+" y el usuario2 uso "+us2+", gana el usuario1");
			}else if(us1.equals("piedra") && us2.equals("pidra")){
				System.out.println("El usuario 1 uso "+us1+" y el usuario 2 uso "+us2+", empate");
			}else if (!us1.equals("piedra") && us2.equals("piedra")) {
				System.out.println("El usuario1 uso "+us1+" y el usuario2 uso "+us2+", gana el usuario1");
			}
		break;
		default:
				System.out.println("ERROR!!!!!!");
		}
	}	
}



