package Ej_Tema_5;

import java.util.Scanner;

public class Ej2 {
    
    private int nDiv(int num) {
        int div=0;
        for(int contador=2;contador<num;contador++){
            if(num%contador==0) {
                div++;
            }
        }
        return div;
    }
    
    public static void main(String[]args) {
        Scanner teclado=new Scanner (System.in);
        int q;
        int p;
        int div1,div2;
        
        do{System.out.print("Escribe un numero positivo: ");
        p = teclado.nextInt();
        }while(p<0);
        
        Ej2 f=new Ej2();
        div1 = f.nDiv(p);
        
        do{System.out.print("Escribe otro numero positivo: ");
        q = teclado.nextInt();
        }while(q<0);
        
        div2 = f.nDiv(q);
        
        System.out.print("El numero " + p + " tiene " + (div1>div2? " mas" : "menos") + " divisores que " + q);
    }
}
