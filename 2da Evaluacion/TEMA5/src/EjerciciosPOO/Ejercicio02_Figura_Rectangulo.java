
import EjerciciosPOO.Ejercicio01_Punto;


public class Ejercicio02_Figura_Rectangulo extends Ejercicio01_Punto {

    private double ancho;
    private double alto;

    public Ejercicio02_Figura_Rectangulo(double ancho, double alto, int x, int y) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "ancho=" + ancho + ", alto=" + alto + '}';
    }

    public double areaRectangulo() {

        double areaRectangulo = this.alto * this.ancho;
        return areaRectangulo;
    }

    public double perimetroRectangulo() {

        double perimetroRectangulo = (Math.pow(alto, 2)) * Math.pow(ancho, 2);
        return perimetroRectangulo;
    }

    public double diagonalRectangulo() {

        //DecimalFormat df = new DecimalFormat("0.00");
        double diagonalRectangulo = Math.sqrt(Math.pow(alto, 2) * Math.pow(ancho, 2));

        double trunks = diagonalRectangulo * 100;
        double trunks2 = trunks / 100;

        return trunks2;
    }
}
