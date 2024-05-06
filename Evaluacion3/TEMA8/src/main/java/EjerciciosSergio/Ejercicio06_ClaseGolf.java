package EjerciciosSergio;

public class Ejercicio06_ClaseGolf {

    int idContador = 0;
    int id;
    String nombre;
    int golpes;
    int hoyos;

    public Ejercicio06_ClaseGolf(String nombre, int golpes, int hoyos) {
        this.id = idContador;
        this.nombre = nombre;
        this.golpes = golpes;
        this.hoyos = hoyos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGolpes() {
        return golpes;
    }

    public void setGolpes(int golpes) {
        this.golpes = golpes;
    }

    public int getHoyos() {
        return hoyos;
    }

    public void setHoyos(int hoyos) {
        this.hoyos = hoyos;
    }

    @Override
    public String toString() {
        return "Id=" + id + "\n"
                + "Nombre=" + nombre + "\n"
                + "Ngolpes=" + golpes + "\n"
                + "Hoyos=" + hoyos;
    }

}
