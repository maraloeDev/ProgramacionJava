package EjerciciosArrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio02_Datos {

    static int numeros[] = new int[10];
    static Random rndm = new Random();

    public static void sumaPares() {
        int suma = 0;

        for (int i = 0; i < numeros.length; i = i + 2) {
            numeros[i] = rndm.nextInt(1, 10);
            System.out.println(numeros[i]);
            suma = suma + numeros[i];

        }
        System.out.println("La suma de los numeros pares es " + suma);
        System.out.println(Arrays.toString(numeros));
    }

    public static void main(String[] args) {
        sumaPares();
    }

}
