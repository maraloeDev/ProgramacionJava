package Ejemplos;

import com.opencsv.CSVWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EscrituraCSV {

    static BufferedWriter bw;
    static Ejemplo03_TiempoGolf partidos;
    static CSVWriter csvW;
    static File archivo = new File(".\\src\\main\\java\\Ejemplos\\golf-dataset.csv");

    public static void main(String[] args) {

        try {
            bw = new BufferedWriter(new FileWriter(archivo));
            csvW = new CSVWriter(bw);

            partidos = new Ejemplo03_TiempoGolf("Calido", "Frio", "Normal", true, "Si");

            csvW.writeNext(partidos.toArray());
            csvW.close();

        } catch (IOException ex) {
            Logger.getLogger(EscrituraCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
