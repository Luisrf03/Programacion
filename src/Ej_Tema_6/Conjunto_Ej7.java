package Ej_Tema_6;
/*
 * Representacion de un conjutno de enteros: no contiene duplicados
 * 
 */
public class Conjunto_Ej7 {
	final static int MAX_ELTOS = 100;
	private Integer []  tabla; // = new Integer [MAX_ELTOS];
	int cantidad; // elementos del conjunto
	
	public Conjunto_Ej7 () {
		tabla = new Integer[MAX_ELTOS];
	}
	
	public void vaciar( ) { // Es poner a null todo.
		// tabla = new Integer [MAX_ELTOS];
		
		for (int i = 0; i < tabla.length; i ++) {
			tabla[i] = null;
			cantidad = 0;
		}
	}
	
	/**
	 * Introduce un elemento en el conjunto
	 * @param x elemento a insertar
	 * @return verdadero si el elemento esta contenido; falso en caso contrario.
	 */
	
	public boolean agregar ( int x) {
		if (esMiembro(x)) {
			return false;
		}
		else
		for (int i = 0; i < tabla.length; i++ )
			if ( tabla[i] == null ) {
				tabla[i] = x;
				cantidad++;
				return true;
			}
		return false;
				
	}
	
	/**
	 * Elimina un elemento del conjunto
	 * @param x elemento a eliminar
	 * @return verdadero si lo elimino; false si no.
	 */
	public boolean eliminar ( int x ) {
		int aux = posicion(x);
		if (aux == -1)
			return false;
		
		tabla[aux] = null;
		cantidad--;
		return true;
	} 
		/*
		for (int i = 0 ; i<tabla.length;i++)
			if (tabla[i] !=null && tabla[i].equals(x)) {
				tabla[i] = null;
			return true;
		}
	return false;
	}
	*/
	
	public void copiar ( Conjunto_Ej7 c ) {
		for ( int i = 0; i < tabla.length; i++ )
			if ( c.tabla[i] != null )
				agregar ( tabla[i] );
	}
	
	public Conjunto_Ej7 ( Conjunto_Ej7 c ) {
		tabla = c.tabla.clone();
		cantidad = c.cantidad;
		
	}
	
	public Conjunto_Ej7 union ( Conjunto_Ej7 c ) {
		//Conjunto_Ej7 aux= new Conjunto_Ej7();
		//aux.copiar(this);
		//Conjunto_Ej7 aux =  new Conjunto_Ej7();
		//aux.tabla = this.tabla.clone();
		Conjunto_Ej7 aux = new Conjunto_Ej7 (this);
		aux.copiar(c);
		return aux;
		
	}
	/**
	 * Localiza un elemento y devuelve la posicion en la tabla
	 * @param x elemento a localizar
	 * @return la posicion si pertenece al conjunto; -1 si no
	 */
	private int posicion ( int x ) {
		for ( int i = 0; i < tabla.length; i++ ) 
			if ( tabla[i] !=null && tabla[i].equals(x) )
				return i;
		return -1;
	}
	/**
	 * Comprueba si contiene un elemento 
	 * @param x elemento a comprobar
	 * @return cerdadero si el elemento esta contenido; falso en caso contrario
	 */
	public boolean esMiembro ( int x ) {
		return posicion(x) != -1;
		/*
		for ( int i = 0; i < tabla.length; i++ ) 
			if ( tabla[i] !=null && tabla[i].equals(x) )
				return true;
		return false;
		*/
	}
	
/*	
	public boolean esMiembro (Integer x ) {
		for ( int i = 0; i < tabla.length; i++ ) 
			if ( tabla[i].equals(x) )
				return true;
		return false;
	}
*/	
	/**
	 * Compara dos conjuntos : son iguales si contienen los mismo elementos
	 * @param c Conjunto a comparar con este
	 * @return verdadero si C es igual; falso si no.
	 */
	public boolean esIgual ( Conjunto_Ej7 c ) {	
		if ( cantidad != c.cantidad)
			return false;
		for ( int i = 0; i < c.tabla.length; i++ ) { 
			if ( c.tabla [i] != null ) {
					if ( ! esMiembro(c.tabla[i]) )
						return false;
			}
		}
		
	for ( int i = 0; i < tabla.length; i++ ) { 
		if ( tabla [i] != null ) {
				if ( ! esMiembro(tabla[i]) )
					return false;
		}
	}
		
	return false;
	}
	
	public String imprimir () {
		return "";
	}
	
	
}
