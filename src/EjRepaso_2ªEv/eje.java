package EjRepaso_2ªEv;
import java.util.Scanner;

public class eje {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String[] nombres = new String[10];
        int[] edades = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = input.nextLine();
            System.out.print("Introduce la edad de la persona " + (i + 1) + ": ");
            edades[i] = input.nextInt();
            input.nextLine(); // Consumir el salto de línea después de la edad
        }

        System.out.println("\nLas personas introducidas son:");

        for (int i = 0; i < 10; i++) {
            System.out.println(nombres[i] + ", " + edades[i] + " años");
        }
    }
}