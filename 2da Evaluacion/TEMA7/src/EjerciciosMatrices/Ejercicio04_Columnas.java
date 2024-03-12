package EjerciciosMatrices;

import java.util.Random;

public class Ejercicio04_Columnas {

    public static void main(String[] args) {
        Random random = new Random();
        int filas = random.nextInt(5) + 3;
        int columnas = random.nextInt(5) + 3;

        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        System.out.println("\nRecorrido por columnas:");
        recorrerPorColumnas(matriz);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void recorrerPorColumnas(int[][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
