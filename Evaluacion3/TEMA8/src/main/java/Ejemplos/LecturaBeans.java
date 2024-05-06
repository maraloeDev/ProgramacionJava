
import Ejemplos.Alumno;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author casbuialb
 */
public class LecturaBeans {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("./ficheros/alumnos.csv"))) {
            
        //Creamos un csvBean Reader
        CsvToBean<Alumno> csvBeans= new CsvToBeanBuilder<Alumno>(br)
                .withType(Alumno.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();
        
        
        //Iteramos por los objetos alumnos cargados en el objeto csvBean
//            for (Iterator<Alumno> it=csvBeans.iterator();it.hasNext();) {
//                Alumno alumno=it.next();
//                System.out.println(alumno);
//                
//            }
            //otra forma
            for (Alumno alumno : csvBeans.parse()) {
                System.out.println(alumno);
            }
            //otra mas
//            for (Alumno alumno : (Iterable<Alumno>)csvBeans) {
//                System.out.println(alumno);
//            }
            

        } catch (FileNotFoundException ex) {
            System.out.println("ERROR. Fichero inexistente");
        } catch (IOException ex) {
            System.out.println("ERROR DE ENTRADA/SALIDA");
            System.out.println(ex.getMessage());
        }
    }}
