package EjerciciosArrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio05_ListaAleatoria {
    
    static int[] enteros = new int[10];
    static Random rndm = new Random();
    
    public static void main(String[] args) {
        
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = rndm.nextInt(1, 10);
            
        }
        System.out.println(Arrays.toString(enteros));
    }
}
