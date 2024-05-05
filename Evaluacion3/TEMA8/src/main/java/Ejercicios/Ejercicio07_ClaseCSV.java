package Ejercicios;

import com.opencsv.bean.CsvBindByName;

public class Ejercicio07_ClaseCSV {
    
    @CsvBindByName(column = "id")
    int id_Empleado;
    
    @CsvBindByName(column = "nombre")
    String nombre_Empleado;
    
    @CsvBindByName(column = "apellidos")
    String apellido_Empleado;
    
    @CsvBindByName(column = "nombre departamento")
    String nombre_Departamento;

    public Ejercicio07_ClaseCSV() {
    }

    public int getId_Empleado() {
        return id_Empleado;
    }

    public void setId_Empleado(int id_Empleado) {
        this.id_Empleado = id_Empleado;
    }

    public String getNombre_Empleado() {
        return nombre_Empleado;
    }

    public void setNombre_Empleado(String nombre_Empleado) {
        this.nombre_Empleado = nombre_Empleado;
    }

    public String getApellido_Empleado() {
        return apellido_Empleado;
    }

    public void setApellido_Empleado(String apellido_Empleado) {
        this.apellido_Empleado = apellido_Empleado;
    }

    public String getNombre_Departamento() {
        return nombre_Departamento;
    }

    public void setNombre_Departamento(String nombre_Departamento) {
        this.nombre_Departamento = nombre_Departamento;
    }

    @Override
    public String toString() {
        return "Id " + id_Empleado + "\n" +
                "Nombre " + nombre_Empleado + "\n" +
                "Apellidos " + apellido_Empleado + "\n" +
                "Nombre de departamento " + nombre_Departamento;
    }
    
    
    
    
}
