package EjerciciosPOO;


public class Ejercicio02_Figura_Circulo extends Ejercicio01_Punto {

    private double radio;

    public Ejercicio02_Figura_Circulo(double radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    /*De todas las figuras nos interesa conocer su área y perímetro*/
    public double areaCirculo() {

        double areaCirculo = Math.PI * (Math.pow(this.radio, 2));

        return areaCirculo;
    }

    public double perimetroCirculo() {

        double perimetroCirculo = 2 * Math.PI * this.radio;
        return perimetroCirculo;

    }

}
