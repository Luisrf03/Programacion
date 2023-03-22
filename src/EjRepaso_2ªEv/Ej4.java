package EjRepaso_2ªEv;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        // Creamos un array para representar las 10 mesas del restaurante
        int[] mesas = new int[10];

        // Creamos un scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle principal del programa
        while (true) {
            // Mostramos el estado actual de las mesas
            System.out.println("Estado actual de las mesas:");
            for (int i = 0; i < mesas.length; i++) {
                if (mesas[i] == 0) {
                    System.out.println("Mesa " + (i + 1) + ": vacía");
                } else {
                    System.out.println("Mesa " + (i + 1) + ": " + mesas[i] + " comensal(es)");
                }
            }

            // Pedimos al usuario que introduzca el tamaño del grupo
            System.out.print("¿Cuántos son? (1-4) ");
            int tamanoGrupo = scanner.nextInt();

            // Verificamos que el tamaño del grupo sea válido
            if (tamanoGrupo < 1 || tamanoGrupo > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + tamanoGrupo + ", solo grupos de 4 personas como máximo.");
                continue;
            }

            // Buscamos la primera mesa libre con suficiente capacidad
            int mesaLibre = -1;
            for (int i = 0; i < mesas.length; i++) {
                if (mesas[i] == 0 && tamanoGrupo <= 4) {
                    mesaLibre = i;
                    break;
                }
            }

            // Si no se encontró una mesa libre, mostramos un mensaje y volvemos al principio del bucle
            if (mesaLibre == -1) {
                System.out.println("Lo siento, no quedan mesas libres.");
                continue;
            }

            // Ocupamos la mesa libre con el grupo
            mesas[mesaLibre] = tamanoGrupo;

            // Mostramos un mensaje confirmando la asignación de la mesa
            System.out.println("Por favor, siéntense en la mesa " + (mesaLibre + 1) + ".");
        }
    }
}