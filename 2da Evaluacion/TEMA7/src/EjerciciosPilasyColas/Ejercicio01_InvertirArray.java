package EjerciciosPilasyColas;

import java.util.Random;
import java.util.Stack;

public class Ejercicio01_InvertirArray {

    static Integer[] numeros = new Integer[5];
    static Stack<Integer> pila = new Stack<>();
    static Random rndm = new Random();

    public static void main(String[] args) {

        for (Integer i = 0; i < numeros.length; i++) {

            numeros[i] = rndm.nextInt(1, 100);

            pila.push(numeros[i]);
        }

        // Muestra la pila
        for (Integer pilaNumbers : pila) {
            System.out.println(pilaNumbers);
        }
        System.out.println("----------");

        //Le doy la vuelta
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

    }

}
