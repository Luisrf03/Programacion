package primeraclase;

import java.util.Scanner;

public class aplicacion {
	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in);
		int numero;
		DivisoresPropios dp1,dp2;
		
		dp1 = new DivisoresPropios (8);
		System.out.println("Valor: " + dp1.getNumero());
		System.out.println("Valor (con cast): "+ dp1);
		System.out.println("Valor (conn toString): " + dp1.toString());
		
		
		/*DivisoresPropios dp1,dp2;
		dp1 = dp2 = new DivisoresPropios(8);
		System.out.println("Resultado de dp1 == dp2: "+ (dp1 == dp2));
		System.out.println("Resultado de dp1.equals(dp2): "+ dp1.equals(dp2));
		
		dp1 =new DivisoresPropios (18);	
		System.out.println("Resultado de dp1 == dp2: "+ (dp1 == dp2));
		System.out.println("Resultado de dp1.equals(dp2): "+ dp1.equals(dp2));
		 */
	/**dp= new DivisoresPropios(5);
	dp.setNumero(20);// Con setNumero le puedo asignar un valor
	System.out.println("El valos de numero que es: " + dp.getNumero());
	dp =new DivisoresPropios();
	System.out.println("El valor de numero que es: " + dp.getNumero());
	dp.setNumero(20);
	System.out.println("El valor de numero que es: " + dp.getNumero());
	System.out.println(dp.calcula());
	*/
	/*
	System.out.println("Introduce un numero: ");
	numero=teclado.nextInt();
	
	if (numero <=0)
		dp= new DivisoresPropios();
	else
		dp=new DivisoresPropios(numero);
	
	*/
		
	
	
	
	
	
	}
}
