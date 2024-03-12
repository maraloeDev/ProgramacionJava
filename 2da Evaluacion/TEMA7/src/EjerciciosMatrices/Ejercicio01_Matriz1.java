package EjerciciosMatrices;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio01_Matriz1 {

    static Random rndm = new Random();
    static int[][] matriz = new int[5][5];

    public static void main(String[] args) {
        imprimirMatriz();
        sumaMatriz();
        diagonal();
    }

    public static void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if ((matriz[i][j] % 2) == 0) {
                    matriz[i][j] = rndm.nextInt(1, 5) * 2;
                } else {
                    matriz[i][j] = rndm.nextInt(1, 5) * 3;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");

        }
    }

    public static void sumaMatriz() {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];

            }

        }
        System.out.println("La suma de la matriz es " + suma);
    }
    
    public static void diagonal(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                if (i==j){
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.print("");
            } 
       }
        System.out.println("");
    }
}
