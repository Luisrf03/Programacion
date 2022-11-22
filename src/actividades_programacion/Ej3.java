package actividades_programacion;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int n;
		int res=0;
		
		System.out.println("Introuzca un numero entero: ");
		n=teclado.nextInt();
						
		for (int divi=1; divi <n; divi++){
			res= n % divi;
			if (res==0) {
			System.out.println("Los numeros divisores de " + n + " son "+ divi );
													
			}//if		
		}//for
	}//main
}//class
