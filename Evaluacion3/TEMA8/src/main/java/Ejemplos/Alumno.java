package Ejemplos;


import com.opencsv.bean.CsvBindByName;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author casbuialb
 * 
 * Mapeo mediante anotaciones alumnos.csv <-> POJO Alumno
 * Anotacion por nombre de columna (al tener el CSV encabezados)
 */
public class Alumno{
    //atributos private
    @CsvBindByName(column = "ID")
    private String idAlumno;
    @CsvBindByName(column = "NOMBRE")
    private String nombre;
    @CsvBindByName(column = "NOTA")
    private double nota;

    public Alumno() {
    }

    //GETTERS
    public String getIdAlumno() {
        return idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }
    
    
    //SETTER

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    //TOSTRING

    @Override
    public String toString() {
        return "ID: "+idAlumno+" Nombre: "+nombre+" Nota: "+nota;
    }
    
    
    
    
}
