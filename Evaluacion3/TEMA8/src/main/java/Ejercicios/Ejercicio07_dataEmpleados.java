package Ejercicios;

import com.opencsv.bean.CsvBindByName;


public class Ejercicio07_dataEmpleados {
    
    @CsvBindByName(column = "id")
    private int id_Empleado;
    
    @CsvBindByName(column = "apellidos")
    private String apellido_Empleado;
    
    @CsvBindByName(column = "nombre departamento")
    private String nombre_Departamento;

    public Ejercicio07_dataEmpleados(int id_Empleado, String apellido_Empleado, String nombre_Departamento) {
        this.id_Empleado = id_Empleado;
        this.apellido_Empleado = apellido_Empleado;
        this.nombre_Departamento = nombre_Departamento;
    }

    public int getId_Empleado() {
        return id_Empleado;
    }

    public void setId_Empleado(int id_Empleado) {
        this.id_Empleado = id_Empleado;
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
        return "id del empleado " + id_Empleado + "\n" +
                "Apellido " + apellido_Empleado + "\n" +
                "Nombre departamento " + nombre_Departamento;
    }
    
    
    
}
