package Ej_Tema_5;


import java.util.Scanner;
public class Ej1 {  
 /*
 Descripcion:Hacer un programa que lea un número N y nos escriba en la pantalla, mediante un mensaje, si es o no primo
 */
    private boolean esPrimo(int num){ //la forma de escribirlo es, private mas el tipo de lo que quieras poner
    								// boolean, int, float, double...
        int contador=2;
        boolean primo = true;
        while(primo && contador<num) {
            primo=num%contador++!=0;
        }
        return primo;
    }

public static void main(String[] args) {
    Scanner teclado=new Scanner (System.in);
    
        int num;
        boolean primo = true;	
        System.out.print("Introduzca un numero: ");
        num=teclado.nextInt();
        Ej1 p=new Ej1();
        primo=p.esPrimo(num);
        System.out.println("El numero " + num + (primo ? "" : " no") + " es primo");
    }
}
