	package Ej_Tema_5_2;

import java.util.Scanner;

public class Trabajador {

		private int num_identificativo;
		private String nombre;
		private String estado_civil;
		private String turno;
		private int titulacion;
		private int años;
		
		
		public Trabajador(int num_identificativo, String nombre, String estado_civil, String turno, int titulacion, int años) {
			this.num_identificativo = num_identificativo;
			this.nombre = nombre;
			this.estado_civil = estado_civil;
			this.turno = turno;
			this.titulacion = titulacion;
			this.años = años;
		}
		
		public Trabajador() {
			this.num_identificativo = 22;
			this.nombre = "Luis";
			this.estado_civil = "C";
			this.turno = "D";
			this.titulacion = 2;
			this.años = 0;
			
		}
		
		public int getNum_identifivativo() {
			return num_identificativo;
		}
			
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getEstado_civil() {
			return estado_civil;
		}
		
		public void setEstado_civil (String estado_civil) {
			this.estado_civil = estado_civil;
		}
		
		public String getTruno() {
			return turno;
		}
		
		public void setTurno (String turno) {
			this.turno = turno;
		}
		
		public int getTitulacion() {
			return titulacion;
		}
		
		public void setTitulacion (int titulacion) {
			this.titulacion = titulacion;
		}
		
		public int getAños() {
			return años;
		}
		
		public void setAño (int años) {
			this.años = años;
		}
		
		public void veerTrabajador() {
			System.out.println("Numero identificativo del trabajador: " + num_identificativo);
			System.out.println("Nombre del trabajador: " + nombre);
			System.out.println("Estado civil del trabajador: " + estado_civil);
			System.out.println("Turno del trabajador: " + turno);
			System.out.println("Titulacion del trabajador: " + titulacion);
			System.out.println("Años de la empresa: " + años);
			System.out.println("------------------------------------------");
		}
		
		public void leerTrabajador() {
			Scanner teclado = new Scanner (System.in);
			System.out.println("Numero identificativo del trabajador: ");
			num_identificativo = teclado.nextInt();
			System.out.println("Nombre del trabajador: ");
			nombre = teclado.nextLine();teclado.nextLine();
			System.out.println("Estado civil del trabajador: ");
			estado_civil =  teclado.nextLine();
			System.out.println("Turno del trabajador: ");
			turno =  teclado.nextLine();
			System.out.println("Titulacion del trabajador: " );
			titulacion = teclado.nextInt();
			System.out.println("Años de la empresa: ");
			años = teclado.nextInt();
		}
		
		public void salario() {
			int salariob = 425;
			int aux;
			
			turno=turno.toUpperCase();
			
			if (turno == "N") {
				aux = salariob + 100;
			}else
				aux = salariob;
			
			if (años < 0 ) {
				System.out.println("Error");
			}else
				aux+=años * 75;
			
			if (titulacion < 0 || titulacion > 4) {
				System.out.println("Error con la titulacion");
			}else if (titulacion == 0) {
				aux+= 250;
			}else if (titulacion == 1) {
				aux+= 500;
			}else if (titulacion == 2) {
				aux+= 1000;
			}else if (titulacion == 3) {
				aux+= 1250;
			}else if (titulacion == 4) {
				aux+= 1500;
			}
			
			System.out.println("El salario de " + nombre + " es: " + aux + " euros.");
				
			
			
		}
		
}
