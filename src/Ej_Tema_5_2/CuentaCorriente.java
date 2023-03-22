package Ej_Tema_5_2;

import java.util.Scanner;

public class CuentaCorriente {

		private float sueldo;
		private String titular;
		private String  codigo;
		
		
		public CuentaCorriente (float sueldo, String titular, String codigo) {
			this.sueldo = sueldo;
			this.titular = titular;
			this.codigo = codigo;
		}
		
		public CuentaCorriente() {
			
		}
		/*
		public float getSueldo () {
			return sueldo;
		}
		
		public void setSueldo(float sueldo) {
			this.sueldo = sueldo;
		}
		
		public String getTitular () {
			return titular;
		}
		
		public void setTitular(String titular) {
			this.titular = titular;
		}
		public String getCodigo () {
			return codigo;
		}
		
		public void setSueldo(String codigo) {
			this.codigo = codigo;
		}
		*/
		
		public void leerDatos() {
			Scanner teclado = new Scanner (System.in);
			
			System.out.println("Introduzca el sueldo de la cuenta: ");
			sueldo = teclado.nextFloat();teclado.nextLine();
			System.out.println("Introduzca el titular de la cuenta: ");
			titular = teclado.nextLine();
			System.out.println("Introduzca el codigo de la cuenta: (8 digitos) ");
			codigo = teclado.nextLine();
		
		
		}
		
		public void veerDatos() {
			System.out.println("DATOS CUENTA");
			System.out.println("------------");
			System.out.println("El saldo de la cuenta es: "+ sueldo+" euros");
			System.out.println("El titular de la cuenta es: "+ titular);
			System.out.println("El codigo de la cuenta es: "+codigo);
		}
		
		public void ingresarDinero() {
			Scanner teclado = new Scanner (System.in);
			float ingreso = 0;
			float result;
			
			System.out.println("Cuanta cantidad quieres ingresar: ");
			ingreso = teclado.nextFloat();
			
			System.out.println("Sualdo actual es de "+sueldo+" euros");
			result = sueldo + ingreso;
			System.out.println("Sueldo actualizado es de "+result+" euros" );
		}
		
		public void retirarDinero() {
			Scanner teclado = new Scanner (System.in);
			float retirada = 0;
			float resultado =0;
			
			System.out.println("Ingrese el dinero que desea retirar: ");
			retirada = teclado.nextFloat();
			
			if (retirada > sueldo) {
				System.out.println("No es posible realizar la operaqcion,"
						+ " el dinero ha retirar es mayor que el saldo de la cuenta.");
				System.out.println("Saldo actual de la cuenta es de: "+sueldo+" euros");
			} else
				resultado = sueldo - retirada;
			System.out.println("Saldo actualizado es de: "+resultado+" euros");
					
			
		}
}
