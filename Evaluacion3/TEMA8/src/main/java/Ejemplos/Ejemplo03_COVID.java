package Ejemplos;

import com.opencsv.bean.CsvBindByName;
import java.time.LocalDate;


public class Ejemplo03_COVID {
   // @CsvBindByName(column = "First Name", required = true);
    
    //@Csv
    LocalDate fecha;
    String provincia;
    int casosConfirmados;
    int nuevosPositivos;
    int altas;
    int fallecimientos;
    int codigoIne;
    int posicion;

    public Ejemplo03_COVID(LocalDate fecha, String provincia, int casosConfirmados, int nuevosPositivos, int altas, int fallecimientos, int codigoIne, int posicion) {
        this.fecha = fecha;
        this.provincia = provincia;
        this.casosConfirmados = casosConfirmados;
        this.nuevosPositivos = nuevosPositivos;
        this.altas = altas;
        this.fallecimientos = fallecimientos;
        this.codigoIne = codigoIne;
        this.posicion = posicion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getCasosConfirmados() {
        return casosConfirmados;
    }

    public void setCasosConfirmados(int casosConfirmados) {
        this.casosConfirmados = casosConfirmados;
    }

    public int getNuevosPositivos() {
        return nuevosPositivos;
    }

    public void setNuevosPositivos(int nuevosPositivos) {
        this.nuevosPositivos = nuevosPositivos;
    }

    public int getAltas() {
        return altas;
    }

    public void setAltas(int altas) {
        this.altas = altas;
    }

    public int getFallecimientos() {
        return fallecimientos;
    }

    public void setFallecimientos(int fallecimientos) {
        this.fallecimientos = fallecimientos;
    }

    public int getCodigoIne() {
        return codigoIne;
    }

    public void setCodigoIne(int codigoIne) {
        this.codigoIne = codigoIne;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Ejemplo03_COVID{" + "fecha=" + fecha + ", provincia=" + provincia + ", casosConfirmados=" + casosConfirmados + ", nuevosPositivos=" + nuevosPositivos + ", altas=" + altas + ", fallecimientos=" + fallecimientos + ", codigoIne=" + codigoIne + ", posicion=" + posicion + '}';
    }
    
    
    
    
}
