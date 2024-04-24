package EjercicioSergio;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjercicioLecturaEscrituraTxt {

    static Scanner scanner = new Scanner(System.in);
    static JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

    // Leer
    static FileReader fr;
    static BufferedReader br;

    // Escribir
    static FileWriter fw;
    static BufferedWriter bw;

    public static void main(String[] args) {
        menu();
    }

    static File seleccionArchivo() {

        int respuesta = jfc.showOpenDialog(null);

        if (respuesta == JFileChooser.APPROVE_OPTION) {
            System.out.println("Archivo seleccionado : " + jfc.getSelectedFile().getName());
        }

        return jfc.getSelectedFile();
    }

    static void menu() {
        int opcion;
        do {

            System.out.println("""
                    Introduce que quiere realizar: \

                    1. Leer archivo\

                    2. Aniadir al archivo""");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    leerArchivo();
                    break;
                case 2:
                    anadirAlArchivo();
                    break;
                default:
                    System.out.println("Opcion no contemplada");
                    System.out.println("----------------------");
            }
        } while (opcion != 3);

    }

    static void leerArchivo() {
        try {

            try {
                fr = new FileReader(seleccionArchivo());
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            br = new BufferedReader(fr);

            String linea;

            while ((linea = br.readLine()) != null) {

                System.out.println(linea);

            }
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (IOException ex) {
            Logger.getLogger(EjercicioLecturaEscrituraTxt.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static void anadirAlArchivo() {
        String texto = "";

        File archivosExit=seleccionArchivo();
        try {

            try {
                fr = new FileReader(archivosExit);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            br = new BufferedReader(fr);

            String linea;

            while ((linea = br.readLine()) != null) {

                texto += linea;

            }
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (IOException ex) {
            Logger.getLogger(EjercicioLecturaEscrituraTxt.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            fw = new FileWriter(archivosExit);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        bw = new BufferedWriter(fw);

        System.out.println("Introduce lo que quieras ");
        scanner.nextLine();
        String txt = scanner.nextLine();

        try {
            bw.write(texto + txt);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
