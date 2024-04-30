package Ejemplos;

import com.opencsv.bean.CsvBindByName;

public class Ejemplo03_Clase {

    @CsvBindByName(column = "DEPTNO")
    int nDepartamento;
    
    @CsvBindByName(column = "DNAME")
    String nombreDepart;
    
    @CsvBindByName(column = "LOC")
    String localizacion;

    public Ejemplo03_Clase(int mDepartamento, String nombreDepart, String localizacion) {
        this.nDepartamento = mDepartamento;
        this.nombreDepart = nombreDepart;
        this.localizacion = localizacion;
    }

    public int getmDepartamento() {
        return nDepartamento;
    }

    public void setmDepartamento(int mDepartamento) {
        this.nDepartamento = mDepartamento;
    }

    public String getNombreDepart() {
        return nombreDepart;
    }

    public void setNombreDepart(String nombreDepart) {
        this.nombreDepart = nombreDepart;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return "Ejemplo03_Clase{" + "mDepartamento=" + nDepartamento + ", nombreDepart=" + nombreDepart + ", localizacion=" + localizacion + '}';
    }

}
