package Ejemplos;


public class finca {
    int contadorIds;
    int id;
    String direccion;
    double area;
    int propiestarioId;

    public finca() {
    }

    public finca(String direccion, double area, int propiestarioId) {
        this.id = contadorIds;
        this.direccion = direccion;
        this.area = area;
        this.propiestarioId = propiestarioId;
    }

    public int getContadorIds() {
        return contadorIds;
    }

    public void setContadorIds(int contadorIds) {
        this.contadorIds = contadorIds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPropiestarioId() {
        return propiestarioId;
    }

    public void setPropiestarioId(int propiestarioId) {
        this.propiestarioId = propiestarioId;
    }

    @Override
    public String toString() {
        return "finca{" + "contadorIds=" + contadorIds + ", id=" + id + ", direccion=" + direccion + ", area=" + area + ", propiestarioId=" + propiestarioId + '}';
    }
    
    
    
    
}
