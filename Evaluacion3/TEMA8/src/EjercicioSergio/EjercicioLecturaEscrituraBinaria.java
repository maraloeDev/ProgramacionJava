package EjercicioSergio;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.util.Scanner;

public class EjercicioLecturaEscrituraBinaria {

    static Scanner scanner = new Scanner(System.in);
    static JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

    // Leer
    static FileInputStream fis;
    static BufferedInputStream bis;
    static DataInputStream dis;

    // Escribir
    static FileOutputStream fos;
    static BufferedOutputStream bos;
    static DataOutputStream dos;

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

        seleccionArchivo();
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
            fis = new FileInputStream(seleccionArchivo());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        bis = new BufferedInputStream(fis);
        dis = new DataInputStream(bis);

        try {
            String linea;

            while (dis.available() > 0) {
                linea = dis.readUTF();
                System.out.println(linea);
            }
            dis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    static void anadirAlArchivo() {

        File archivosExit = seleccionArchivo();
        String texto = "";

        try {
            fis = new FileInputStream(archivosExit);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        bis = new BufferedInputStream(fis);
        dis = new DataInputStream(bis);

        try {
            String linea;

            while (dis.available() > 0) {
                linea = dis.readUTF();
                texto += linea;
            }
            dis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            fos = new FileOutputStream(archivosExit);
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(fos);

            System.out.println("Introduce lo que quieras ");
            scanner.nextLine();
            String txt = scanner.nextLine();

            try {
                dos.writeUTF(texto + txt);
                dos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
