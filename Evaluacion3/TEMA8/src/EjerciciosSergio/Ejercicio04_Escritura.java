package TEMA8.EjerciciosSergio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio04_Escritura {

    /*

    Escribe un programa Java que genere un archivo HTML con una tabla de multiplicar.

    El programa debe solicitar al usuario ingresar un número
    y luego escribir una tabla de multiplicar del 1 al 10 para ese número en un archivo HTML llamado "tabla_multiplicar_X.html".

    X siendo el numero del usuario.
     */

    static Scanner scanner;
    static FileWriter fr;
    static BufferedWriter br;
    static int numero;

    static int pideDato() {
        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        return numero;
    }

    static void escribirArchivo(){

        try {
            fr = new FileWriter(String.valueOf(pideDato()));
            br = new BufferedWriter(fr);

            File archivo = new File("tabla_multiplicar_" + numero + ".html");
            if ()
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
