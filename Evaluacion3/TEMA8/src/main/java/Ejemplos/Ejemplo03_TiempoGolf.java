package Ejemplos;

import com.opencsv.bean.CsvBindByName;


public class Ejemplo03_TiempoGolf {
    
    @CsvBindByName(column = "Panorama")
    private String panorama;
    
    @CsvBindByName(column = "Temperatura")
    private String temperatura;
    
    @CsvBindByName(column = "Humedad")
    private String humedad;
    
    @CsvBindByName(column = "Viento")
    private boolean viento;
    
    @CsvBindByName(column = "Jugar Golf")
    private String jugarGolf;

    public Ejemplo03_TiempoGolf() {
    }

    public Ejemplo03_TiempoGolf(String panorama, String temperatura, String humedad, boolean viento, String jugarGolf) {
        this.panorama = panorama;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.viento = viento;
        this.jugarGolf = jugarGolf;
    }
    
    

    public String getPanorama() {
        return panorama;
    }

    public void setPanorama(String panorama) {
        this.panorama = panorama;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    public boolean isViento() {
        return viento;
    }

    public void setViento(boolean viento) {
        this.viento = viento;
    }

    public String getJugarGolf() {
        return jugarGolf;
    }

    public void setJugarGolf(String jugarGolf) {
        this.jugarGolf = jugarGolf;
    }

    @Override
    public String toString() {
        return 
                 panorama + "," +
                 temperatura +"," +
                 humedad +"," +
                 viento +"," +
                 jugarGolf;
    }
    
    public String[] toArray(){
        
        String [] datos = new String[5];
        
        datos[0] = panorama;
        datos[1] = temperatura;
        datos[2] = humedad;
        datos[3] = String.valueOf(viento);
        datos[4] = jugarGolf;
        
        return datos;
    }
    
    
}
