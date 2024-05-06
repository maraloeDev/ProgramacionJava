package Ejemplos;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejemplo03_LecturaCSV {

    static BufferedReader br;
    static CSVReader CSVr;

    static File archivo = new File("C:\\Users\\maraloed\\Desktop\\ProgramacionJava\\Evaluacion3\\TEMA8\\src\\main\\java\\Ejemplos\\download.csv");

    public static void main(String[] args) {
        //   elFacilito();
        elComplicado();
    }

    static void elFacilito() {

        try {
            br = new BufferedReader(new BufferedReader(br));
            CSVr = new CSVReader(br);

            String[] cosas = new String[5];

            while ((cosas = CSVr.readNext()) != null) {

                for (int i = 0; i < cosas.length; i++) {

                    System.out.print(cosas[i] + "\t\t");

                }
                System.out.println("");

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejemplo03_LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo03_LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CsvValidationException ex) {
            Logger.getLogger(Ejemplo03_LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void elComplicado() {

        try {
            br = new BufferedReader(new FileReader(archivo));
            CsvToBean<Ejemplo03_Clase> bean
                    = new CsvToBeanBuilder(br)
                            .withType(Ejemplo03_Clase.class)
                            .withIgnoreLeadingWhiteSpace(true)
                            .build();

            for (Ejemplo03_Clase aux : bean) {
                System.out.println(aux);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejemplo03_LecturaCSV.class.getName()).log(Level.SEVERE, "Archivo no encontrado", ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo03_LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
