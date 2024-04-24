package EjerciciosSergio;

import Ejercicios.*;
import javax.swing.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Ejercicio05_LaCarta {

    static JFileChooser jfc;

    /*
    Se quiere escribir una carta de felicitación de cumpleaños a los empleados de
una empresa. El texto de la carta se encuentra en el archivo secuencial
Carta.txt. El nombre y dirección de los empleados se encuentra en el archivo
binario Empleados.dat, como una secuencia de registros con los campos
nombre y dirección, ambos son cadenas grabadas en formato UTF.
Escribe un programa que genere un archivo de texto por cada empleado, de
tal forma, que la primera línea contenga el nombre del empleado, la segunda
línea en blanco, la tercera tendrá la dirección y en la quinta empezará el texto
de la felicitación.
El nombre de los archivos generados seguirá el patrón: carta<nº>.txt, donde
<nº> es el número de orden de cada carta empezando por el 1
     */

    //Lectura
    static FileReader fr;
    static BufferedReader br;
    static ArrayList<String> laCarta;

    //Lectura
    static FileInputStream fis;
    static BufferedInputStream bis;
    static DataInputStream dis;
    static ArrayList<String> losDatos;

    //Escritura
    static FileWriter fw;
    static BufferedWriter bw;
    static int nOrden = 1;

    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
    static LocalDate hoy = LocalDate.now();

    public static void main(String[] args) {
        lecturaBinaria();
        lecturaTexto();
        generarCarta();
    }

    static void lecturaBinaria() {
        //System.out.println(System.getProperty("user.dir"));
        try {
            fis = new FileInputStream("./src/TEMA8/Ejercicios/Ejercicio05_Empleados.dat");
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            losDatos = new ArrayList<>();
            while (dis.available() > 0) {
                String dato = dis.readUTF();
                losDatos.add(dato);
            }


            dis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void lecturaTexto() {
        try {
            fr = new FileReader("./src/TEMA8/Ejercicios/Ejercicio05_Carta.txt");
            br = new BufferedReader(fr);

            String linea1 = "";

            laCarta = new ArrayList<>();
            while ((linea1 = br.readLine()) != null) {
                laCarta.add(linea1);
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    static void generarCarta() {
        for (int i = 0; i < losDatos.size(); i++) {

            if ((i % 2) != 0) {
                String nombre = losDatos.get(i - 1);
                String direccion = losDatos.get(i);

                File nuevaCarta = new File("C:\\Users\\Eduardo\\Desktop\\LaCarpeta\\carta" + nOrden + ".txt");

                if (!nuevaCarta.exists()) {
                    try {
                        nuevaCarta.createNewFile();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

                try {
                    fw = new FileWriter(nuevaCarta);
                    bw = new BufferedWriter(fw);

                    bw.write(nombre);
                    bw.newLine();
                    bw.newLine();
                    bw.write(direccion + "\t\t Valladolid, " + sdf.format(new Date()));
                    bw.newLine();
                    bw.newLine();
                    for(String laCartaEpica: laCarta){

                    bw.write(String.valueOf(laCartaEpica));
                    bw.newLine();
                    bw.newLine();
                    }
                    bw.close();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                nOrden++;
            }

        }

    }

}
