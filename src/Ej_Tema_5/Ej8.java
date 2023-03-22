package Ej_Tema_5;

import java.util.Scanner;

public class Ej8 {
    
    private int factorial(int n) {
        int resultado = n;
        for(int cont=1;cont<n;cont++) {
            resultado=resultado*(n-cont);
        }
        
        return resultado;
    }

    public static void main(String[]args) {
        Scanner teclado=new Scanner(System.in);
        
        int n,m,resultado1,resultado2,resultado3,mn,resultado_final;
        
        do {
        	
        System.out.println("Introduce un numero:");
        m=teclado.nextInt();
        System.out.println("Introduce otro numero menor que el anterior:");
        n=teclado.nextInt();
        
        }while(m<n);
        
        if(m==n) {
            resultado_final=1;
        }else {
            Ej8 factorial2= new Ej8();
            resultado1=factorial2.factorial(n);
            resultado2=factorial2.factorial(m);
            mn=(m-n);
            resultado3=factorial2.factorial(mn);
            resultado_final=resultado2/(resultado1*resultado3);
            
        }
        System.out.println(resultado_final);
    }
}