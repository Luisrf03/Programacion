package Ej_Tema_6;

public class Menu {
	private int num_clientes;
	private String plato1;
	private String plato2;
	
	public Menu (int  num_clientes, String plato1, String plato2) {
		this.num_clientes = num_clientes;
		this.plato1 = plato1;
		this.plato2 = plato2;
	}
	
	public void verMenu() {
		System.out.println("MENU DEL DIA");
		System.out.println("");
	}
	

}
