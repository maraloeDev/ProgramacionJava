package EjerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04_Frases {

    static String[] frases = new String[5];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        for (int i = 0; i < frases.length; i++) {

            System.out.print("Introduce una frase: ");
            frases[i] = scanner.nextLine();
        }
        imprimeFrases();
        mayorFrase();
        menorFrase();
    }

    public static void imprimeFrases() {

        System.out.println(Arrays.toString(frases));
    }

    public static void mayorFrase() {

        String mayor = "";
        int indiceMayor = 0;
        for (int i = 0; i < frases.length; i++) {

            if (frases[i].length() > mayor.length()) {
                mayor = frases[i];
                indiceMayor = i;

            }

        }
        System.out.println("La frase de mayor longitud es " + mayor + " y ocupa la posicion " + indiceMayor);
    }
    
    public static void menorFrase() {

       String menor = frases[0];
       int indiceMenor = 0;
        int i;
        for (i = 0; i < frases.length; i++) {

            if (frases[i].length() < menor.length()) {
                menor = frases[i];
                indiceMenor = i;

            }

        }
        System.out.println("La frase de menor longitud es " + menor + " y ocupa la posicion " + indiceMenor);
    }
}
