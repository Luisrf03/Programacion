package Ej_Tema_5;

import java.util.Scanner;

public class Ej7{
    private Double casos(int r,int opcion) {
        double PI=3.14159;
        double resultado = 0;
        
        switch(opcion) {
        case 1: 
            resultado=(Double) (2*PI*r);
            break;
        case 2:
            resultado=(Double) (PI*r*r);
            break;
        case 3:
            resultado=(Double) (4/3*PI*r*r*r);
            break;
        }
        return resultado;
}
    public static void main(String[]args) {
        Scanner teclado=new Scanner(System.in);
        
        int r,opcion;
        Double resultado;
        
        System.out.println("Introduce en cm el radio de la circunferencia:");
        r=teclado.nextInt();
        System.out.println("Elige un caso, 1(perimetro), 2 (superficie), 3(area)");
        opcion=teclado.nextInt();
        
        Ej7 circunferencia= new Ej7();
        resultado=circunferencia.casos(r,opcion);
        
        System.out.println(resultado + " cm");
    }
}

