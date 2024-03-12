package EjerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01_Personas {

    static Scanner scanner = new Scanner(System.in);
    static String[] personas = new String[20];

    ;

    public static void main(String[] args) {

        for (int i = 0; i < personas.length; i++) {
            System.out.print("Introduce un nombre: ");
            personas[i] = scanner.next();
        }

        System.out.println("METODO IMPRIME PERSONAS");
        imprimePersonas();

        System.out.println("---------------------------");

        System.out.println("METODO PARES");
        pares();
    }

    public static void imprimePersonas() {

        System.out.println(Arrays.toString(personas));
    }

    public static void pares() {

        for (int i = 0; i < personas.length; i++) {

            if ((i % 2) == 0) {
                System.out.println(i + " " + personas[i]);
            }

        }

    }
}
