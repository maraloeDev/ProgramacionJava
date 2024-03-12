package EjerciciosMatrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio03_Permutacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        System.out.print("Ingrese el número de la primera fila a intercambiar: ");
        int fila1 = scanner.nextInt();
        System.out.print("Ingrese el número de la segunda fila a intercambiar: ");
        int fila2 = scanner.nextInt();
        permutaFilas(matriz, fila1, fila2);

        System.out.println("Matriz después de permutar las filas:");
        mostrarMatriz(matriz);

        System.out.print("Ingrese el número de la primera columna a intercambiar: ");
        int columna1 = scanner.nextInt();
        System.out.print("Ingrese el número de la segunda columna a intercambiar: ");
        int columna2 = scanner.nextInt();
        permutaColumnas(matriz, columna1, columna2);

        System.out.println("Matriz después de permutar las columnas:");
        mostrarMatriz(matriz);

        scanner.close();
    }

    public static void permutaFilas(int[][] matriz, int fila1, int fila2) {
        int[] temp = matriz[fila1];
        matriz[fila1] = matriz[fila2];
        matriz[fila2] = temp;
    }

    public static void permutaColumnas(int[][] matriz, int columna1, int columna2) {
        for (int i = 0; i < matriz.length; i++) {
            int temp = matriz[i][columna1];
            matriz[i][columna1] = matriz[i][columna2];
            matriz[i][columna2] = temp;
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
}
