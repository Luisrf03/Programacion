package actividades_programacion;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		String triangulo; 
		String cuadrado; 
		String rectangulo;
		String valor;
		int area, base, altura;
		
		
		
		System.out.println("Vamos a calcular el area");
		System.out.println("Eliga una opcion: ");
		System.out.println("-Rectangulo");
		System.out.println("-Cuadrado ");
		System.out.println("-Triangulo");
		valor=teclado.nextLine();
		valor=valor.toLowerCase();
		
		if (valor.equals("triangulo")) {
			System.out.println("Introduzca la base: ");
			base=teclado.nextInt();
			System.out.println("Introduzca la altura: ");
			altura=teclado.nextInt();
			
			area=(base*altura)/2;
			System.out.println("El area del triangulo con base "+base+" y altura "+altura+" es igual a "+area);
		}else 
			if (valor.equals("rectangulo")) {
			System.out.println("Introduzca la base: ");
			base=teclado.nextInt();
			System.out.println("Introduzca la altura: ");
			altura=teclado.nextInt();
			
			area=(base*altura);
			System.out.println("El area del triangulo con base "+base+" y altura "+altura+" es igual a "+area);
		}else 
			if (valor.equals("cuadrado")) {
			System.out.println("Introduzca un lado: ");
			base=teclado.nextInt();
			
			area=base*base;
			System.out.println("El area del triangulo con lado "+base+" es igual a "+area);
		}else
			System.out.println("ERROR!! La opcion escogida no es correcta");
		
		
		
		
		
		
	}

}
