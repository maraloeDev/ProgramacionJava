package EjerciciosPOO;

import java.text.NumberFormat;
import java.util.Locale;

public class Ejercicio04_Racional {
    
    private int numerador;
    private int denominador;

    
    public Ejercicio04_Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }


    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return  numerador + "/" + denominador;
    }

    public Ejercicio04_Racional sumar(Ejercicio04_Racional r) {

        int sumaNumerador = (this.numerador * r.denominador) + (this.denominador * r.numerador);
        int sumaDenominador = (this.numerador * r.denominador) ;

        return simplifica(new Ejercicio04_Racional(sumaNumerador,sumaDenominador ));
    }

    public Ejercicio04_Racional resta(Ejercicio04_Racional r) {
        int restaNumerador = (this.numerador * r.denominador) - (this.denominador * r.numerador);
        int restaDenominador = (this.numerador * r.denominador);

        return simplifica(new Ejercicio04_Racional(restaNumerador,restaDenominador ));
    }
    public Ejercicio04_Racional producto(Ejercicio04_Racional r) {
        int productoNumerador = (this.numerador * r.denominador) * (this.denominador * r.numerador);
        int ProductoDenominador = (this.numerador * r.denominador) ;

        return simplifica(new Ejercicio04_Racional(productoNumerador,ProductoDenominador ));
    }

    public Ejercicio04_Racional dividir(Ejercicio04_Racional r) {
        int divisionNumerador = (this.numerador * r.denominador) / (this.denominador * r.numerador);
        int divisionDenominador = (this.numerador * r.denominador) ;

        return simplifica(new Ejercicio04_Racional(divisionNumerador,divisionDenominador ));
    }

    public double toDecimal() {
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(2);
        return Double.parseDouble(nf.format((double) this.numerador / (double) this.denominador));
    }

   public boolean toEquals(Ejercicio04_Racional r) {

        if (r.equals(r.denominador) && (r.equals(r.numerador))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean compareTo(Ejercicio04_Racional r) {

        if ((r.denominador > this.denominador) && (r.numerador > this.numerador)) {

        } else if ((r.numerador < r.denominador) && (r.denominador > this.denominador)) {

        } else if ((r.numerador == this.numerador) && (r.denominador == this.denominador)) {

        }
        return false;
    }

    public int MCD(int n1, int n2) {


        int resto;
        int aux;
        do {
            resto = n1 % n2;

            if (resto != 0) {
                aux = n2;
                n2 = resto;
                n1 = aux;
            }
        } while (resto != 0);
        return n2;
    }

    private Ejercicio04_Racional simplifica(Ejercicio04_Racional r) {
        int mcd = MCD(Math.abs(r.numerador), Math.abs(r.denominador));
        r.numerador= r.numerador / mcd;
        r.denominador = r.denominador / mcd;
        return new Ejercicio04_Racional(r.numerador, r.denominador);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ejercicio04_Racional other = (Ejercicio04_Racional) obj;
        if (this.numerador != other.numerador) {
            return false;
        }
        return this.denominador == other.denominador;
    }
}
