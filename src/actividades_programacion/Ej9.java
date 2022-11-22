package actividades_programacion;

import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n;
		int suma=0;
		int resto=0;
		
		System.out.println("Introduzca un numero: ");
		n=teclado.nextInt();
		
		for (int divi=1; divi <n; divi++){
			resto= n % divi;
			if (resto==0) {
				suma+=divi;
			}//for
			}//if
			if (suma-n==0 && n!=0) {
				System.out.println("El numero es perfecto");
			}
			else {
				System.out.println("El numero no es perfecto");		
			}
	}//main
}//class
