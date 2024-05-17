package Ejercicios;

import com.opencsv.bean.CsvBindByName;

public class Ejercicio07_datosEmpleados{
    
    @CsvBindByName(column = "ID")
    private int id;
    
    @CsvBindByName(column = "APELLIDOS")
    private String apellidos;
    
    @CsvBindByName(column = "NOMBRE DEPARTAMENTO")
    private String nombreDepartamento;

    public Ejercicio07_datosEmpleados() {
    }

    public Ejercicio07_datosEmpleados(int id, String apellidos, String nombreDepartamento) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombreDepartamento = nombreDepartamento;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    @Override
    public String toString() {
        return id + "," + apellidos + "," + nombreDepartamento;
    }

    
    
    public String[] toArray(){
        
        String[] datos = {"ID", "APELLIDOS", "NOMBRE DEPARTAMENTO"};
        return datos;
    }
    
    
}
