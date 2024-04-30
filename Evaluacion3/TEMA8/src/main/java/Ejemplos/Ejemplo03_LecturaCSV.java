package Ejemplos;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvCustomBindByName;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejemplo03_LecturaCSV {
    
    static FileReader fr;
    static CSVReader CSVr;
    
    static File archivo = new File("C:\\Users\\Eduardo\\Desktop\\ProgramacionJava\\Evaluacion3\\TEMA8\\src\\main\\java\\Ejemplos\\download.csv");
    
    public static void main(String[] args) {
        elFacilito();
        
        elComplicado();
    }
    
    static void elFacilito() {
        
        try {
            fr = new FileReader(archivo);
            CSVr = new CSVReader(fr);
            
            String[] cosas = new String[5];
            
            while ((cosas = CSVr.readNext()) != null) {
                
                for (int i = 0; i < cosas.length; i++) {
                    
                    System.out.print(cosas[i].trim() + "\t\t");
                    
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
            fr = new FileReader(archivo);
            CsvToBean<Ejemplo03_Clase> bean = new CsvToBeanBuilder(fr).withType(Ejemplo03_Clase.class).withIgnoreLeadingWhiteSpace(true).build();
            
            Iterator<Ejemplo03_Clase> it = bean.iterator();
            
            while (it.hasNext()) {
                Ejemplo03_Clase aux = it.next();
                
                System.out.println(aux);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejemplo03_LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    
}
