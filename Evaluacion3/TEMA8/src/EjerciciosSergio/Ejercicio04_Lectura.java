package EjerciciosSergio;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio04_Lectura {
    
    /*
    Escribe un programa Java que genere un archivo HTML con una tabla de multiplicar.

    El programa debe solicitar al usuario ingresar un número
    y luego escribir una tabla de multiplicar del 1 al 10 para ese número en un archivo HTML llamado "tabla_multiplicar_X.html".

    X siendo el numero del usuario.
     */

    static Scanner scanner;
    static int numero;

    //Escritura
    static FileWriter fw;
    static BufferedWriter bw;

    public static void main(String[] args) {
        pidoNumero();
        escrituraArchivo();
    }

    static File archivo;

    static int pidoNumero() {
        scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        numero = scanner.nextInt();

        return numero;

    }

    static void escrituraArchivo() {

        archivo = new File("tabla_multiplicar_" + numero + ".html");

        if (!archivo.exists()) {

            try {
                archivo.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                fw = new FileWriter(archivo);
                bw = new BufferedWriter(fw);

                bw.write("<!DOCTYPE html>");
                bw.write("<html lang=\"en\">");
                bw.write("<head>");
                bw.write("    <meta charset=\"UTF-8\">");
                bw.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
                bw.write("    <title>Document</title>");
                bw.write("</head>");
                bw.write("<body>");

                for (int i = 0; i <= 10; i++) {
                    bw.write(i + " * " + numero + " = " + (i * numero));
                }

                bw.write("</body>");
                bw.write("</html>");

                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {
            System.out.println("El archivo " + archivo.getName() + " ya existe");
        }
    }

}
