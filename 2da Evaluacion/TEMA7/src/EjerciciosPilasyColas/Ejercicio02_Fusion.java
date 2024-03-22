package EjerciciosPilasyColas;

import java.util.Stack;

public class Ejercicio02_Fusion {

    static Stack<Integer> pilaOrdenadaA = new Stack<>();
    static Stack<Integer> pilaOrdenadaD = new Stack<>();
    static Stack<Integer> pilaFusionada = new Stack<>();

    public static void main(String[] args) {
        pilaAscendente();
        pilaDescentente();
        pilaFusionada();
    }

    static void pilaAscendente() {

        for (int i = 1; i <= 5; i++) {
            pilaOrdenadaA.push(i);
        }

        for (Integer pilaAscendente : pilaOrdenadaA) {
            System.out.println(pilaAscendente);
        }
        System.out.println("---------");
    }

    static void pilaDescentente() {

        for (int i = 1; i <= 5; i++) {
            pilaOrdenadaD.push(i);
        }

        while (!pilaOrdenadaD.isEmpty()) {
            System.out.println(pilaOrdenadaD.pop());
        }
        System.out.println("---------");
    }

    static void pilaFusionada() {

        while (!pilaOrdenadaA.isEmpty()) {
            pilaFusionada.push(pilaOrdenadaA.pop());
        }

        while (!pilaOrdenadaD.isEmpty()) {
            pilaFusionada.push(pilaOrdenadaD.pop());
        }

        for (Integer pilaFusion : pilaFusionada) {
            System.out.println(pilaFusion);
        }
    }

}
