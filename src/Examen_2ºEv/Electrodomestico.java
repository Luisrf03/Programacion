package Examen_2ºEv;

public abstract class Electrodomestico implements Revision{
	
	private final int peso; // No modificable
	private int color; // 24 bits de menos peso
	// Para que sus subclases tengan acceso
	protected int dias; // Dias en servicio
	
	public final int NEGRO = 0;
	public final int BLANCO = (int)(Math.pow(2,24)-1);ç
	
	public int getPeso() {
		return peso;
	}
	
	public int getColor() {
		return color;
	}
	
	public Electrodomestico (int peso) {
		this.peso = peso;
		color = BLANCO;
		dias = 0;
		
		if ( peso <= 0) 
			throw new IllegalArgumentException("Electrodomestico sin peso");
	}
	
	public void diasTranscurridos ( int dias ) {
		if ( dias < 1)
			throw new IllegalArgumentException("Dias menor que 1");
		this.dias += dias;
	}
	
	public void diasTranscurridos() {
		diasTranscurridos(30);
		dias+= 30;
	}
	
	public abstract boolean debeReevisarse();
	public abstract boolean pasarRevision();
	

}

