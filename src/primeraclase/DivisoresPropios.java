package primeraclase;

/**
 * Clase para la determinacion dedivisores propios
 * @author alu
 *
 */

public class DivisoresPropios {
	int numero;
	
	public DivisoresPropios ( int num ) {
		this(); //Invoca al constructor que no tiene paramtros  al numero
		numero=num;
	}
	public DivisoresPropios () {
		//Si no hace nada, no deberia exixtir
		//System.out.println("Soy el constructor sin parametros");
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;//This significa, el objeto actual
	}
	public String calcula ( ) {
		String salida="Sin divisores propios";
		
		System.out.println("Clacula: "+ numero);
		if (numero <=3)
			salida="El numero "+ numero +" no tiene divisorespropios";
		else
			for (int i=0; i<numero/2;i++) {
				if (numero % i == 0 && i < numero / i) {
					salida +="El numero "+i+" es divisor propio de " + numero + "\n"
					+ " El numero "+ numero/i +" es divisor propio de "+ numero +"\n";				}
				
			}
		return salida;
	}
	
	public boolean equals (DivisoresPropios dp) {
		return  this.numero == dp.numero;
		/*
		if (this.numero == dp.numero)
			return true;
		else
			return false;
			*/		
	}
	public String toString () {
		return "" + numero;
	}

}
