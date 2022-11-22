package actividades_programacion;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int num;
		int contador;
		int producto;
		
		contador=0;
		System.out.println("Introuzca un numero entero del 1 al 10: ");
		num=teclado.nextInt();
		
		if ( 1>num || num>10 ) {
			System.out.print("El valor no esta entre el 1 o el 10");
		}
		else 
			System.out.println("TABLA DE MULTIPLICAR DEL " + num );
			while (contador < 10) {
			
			contador++;
			producto = num * contador;
			
			System.out.print(num + " x " + contador + " = " + producto + "\n");
			}			
	}
}
