package Ejercicios;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;


public class Ejercicio05_Carta {
    static JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    
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
    static void seleccionArchivo(){
        
    }
    
}
