package Ejercicios;

import com.opencsv.bean.CsvBindByName;


public class Ejercicio07_dataEmpleados {
    
    @CsvBindByName(column = "id")
    private int id_Empleado;
    
    @CsvBindByName(column = "apellidos")
    private String apellido_Empleado;
    
    @CsvBindByName(column = "nombre departamento")
    private String nombre_Departamento;
    
    
}
