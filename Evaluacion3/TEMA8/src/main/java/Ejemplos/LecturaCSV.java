
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author altalopa
 */
public class LecturaCSV {

    //Construir un csv Parser
    //withSeparator(',') aqui tengo que poner lo que separa los datos del fichero CSV
    //buil devuelve un CSVparser que es el utilizaremos
    public static CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

    //lectura linea a linea con configuracion del parser
    public static void lecturaLineasParse(Reader reader) throws IOException {

        //el skip line sirve para saltarte lineas como los encabezados
        //El build es commo el finisher cnd lo configures bn ps pones el build y acabas
        try ( CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build()) {

            String[] linea;

            try {
                while ((linea = csvReader.readNext()) != null) {
                    System.out.println(linea[0] + "->" + linea[1]);

                }
            } catch (CsvValidationException ex) {
                Logger.getLogger(LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //Lectura línea a linea sin parser
    public static void lecturaLineas(Reader reader) {

        try ( CSVReader csvReader = new CSVReader(reader)) {

            String[] linea;

            try {
                while ((linea = csvReader.readNext()) != null) {
                    System.out.println(linea[0] + "->" + linea[1]);

                }
            } catch (CsvValidationException ex) {
                Logger.getLogger(LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException ex) {
            Logger.getLogger(LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Lectura completa con configuracion del paser

    public static void lecturaCompletaParser(Reader reader) {
        try ( CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build()) {

            String[] linea;

            List<String[]> todo = csvReader.readAll();

            for (String[] ejemplo : todo) {
                System.out.println(ejemplo[0] + "->" + ejemplo[1]);
            }

        } catch (IOException ex) {
            Logger.getLogger(LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CsvException ex) {
            Logger.getLogger(LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //Lectura completa sin parser

    public static void lecturaCompleta(Reader reader) {

    }

    public static void main(String[] args) {
        System.out.println("Lectura CSV -- Linea a Linea");

        System.out.println("-----------------------------");

        try ( BufferedReader br = new BufferedReader(new FileReader("./ficheros/datosCSV.csv"))) {

            System.out.println(">>>>>>Con Parser");
            lecturaLineasParse(br);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

         try ( BufferedReader br = new BufferedReader(new FileReader("./ficheros/datosCSV.csv"))) {

            System.out.println(">>>>>>Lectua Linea a linea sin parser");
            lecturaLineas(br);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        try ( BufferedReader br = new BufferedReader(new FileReader("./ficheros/datosCSV.csv"))) {

            System.out.println(">>>>>>Lectua completa parser");
            lecturaCompletaParser(br);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
