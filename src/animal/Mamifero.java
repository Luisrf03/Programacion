package animal;

public class Mamifero  extends Animal{
	int huesos, extremidades;
	
	public Mamifero() {
		System.out.print(", mamifero");
	}
	
	/*
	 * Transformador que actualiza el numero de huesos
	 * param huesos Numero de huesos del mamifero
	 */
	public void setHuesos(int huesos) {
		this.huesos = huesos;
	}
	
	public void setExtremidades (int extremidades) {
		this.extremidades = extremidades;
	}
	
	public void visualizaMamiferos () {
		visualizaDatos();
		System.out.println("Huesos: "+huesos);
		System.out.println("Extremidades: "+extremidades);
	}

}
