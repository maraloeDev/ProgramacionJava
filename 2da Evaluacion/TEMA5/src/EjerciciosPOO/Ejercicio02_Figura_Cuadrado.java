package EjerciciosPOO;


import EjerciciosPOO.Ejercicio01_Punto;

public class Ejercicio02_Figura_Cuadrado extends Ejercicio01_Punto{

    private double lado;

    public Ejercicio02_Figura_Cuadrado(double lado, int x, int y) {
        super(x, y);
        this.lado = 21;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }

    public double areaCuadrado() {
        double areaCuadrado = Math.pow(this.lado, this.lado);
        return areaCuadrado;
    }

    public double diagonalCuadrado() {

        double areaCuadrado = Math.pow(this.lado, this.lado) + Math.pow(this.lado, this.lado);

        double trunks = areaCuadrado * 100;
        double trunks2 = trunks / 100;

        return trunks2;

    }

    public double perimetroCuadrado() {
        double perimetroCuadrado = (this.lado + this.lado + this.lado + this.lado);
        return perimetroCuadrado;
    }

}
