package EjerciciosPOO;

import java.awt.Dimension;
import java.awt.Toolkit;


public class Ejercicio01_Punto {
    
    private int x;
    private int y;

    public Ejercicio01_Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ejercicio01_Punto() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return x + "," + y;
    }
    
    public void desplazar(int nuevaDistanciaY, int nuevaDistanciaX){
        y+=nuevaDistanciaY;
        x+=nuevaDistanciaX;
    }
    
    public void mover(int nuevaX, int nuevaY){
        y = nuevaY;
        x = nuevaX;
    }
    
    public double distancia(double otroPuntoX, double otroPuntoY) {

        double a = otroPuntoX - this.x;
        double b = otroPuntoY - this.y;

        double distanciaNueva = Math.sqrt(Math.pow(a, 2) + (Math.pow(b, 2)));
        return distanciaNueva;
    }

    //Método que mueva el punto actual al centro de la pantalla.
    public void centro() {
        Dimension tamanio = Toolkit.getDefaultToolkit().getScreenSize();
        int centrox = tamanio.width / 2;
        int centroy = tamanio.height / 2;
        x = centrox;
        y = centroy;

    }
    
    
    
}
