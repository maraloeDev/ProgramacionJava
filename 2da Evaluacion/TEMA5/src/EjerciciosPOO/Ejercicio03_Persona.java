package EjerciciosPOO;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Eduardo Martin - Sonseca
 */
public class Ejercicio03_Persona {
static Scanner teclado = new Scanner(System.in);

    private String dniPersona;
    private String nombrePersona;
    private String apellidoPersona;
    private char sexoPersona;
    private LocalDate fechaNacimientoPersona;
    private int edad;
    private double altura;
    private double peso;
    private boolean casado;

    public Ejercicio03_Persona(String dniPersona, String nombrePersona, String apellidoPersona, char sexoPersona, LocalDate fechaNacimientoPersona, int edad, double altura, double peso, boolean casado) {
        this.dniPersona = dniPersona;
        while (this.dniPersona.length() > 8){
            System.out.println("El dni no esta introducido correctamente, vuelve a introducirlo");
        this.dniPersona = teclado.nextLine();
    }
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.sexoPersona = sexoPersona;
        this.fechaNacimientoPersona = fechaNacimientoPersona;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.casado = casado;
    }

    public Ejercicio03_Persona() {

    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public char getSexoPersona() {
        return sexoPersona;
    }

    public void setSexoPersona(char sexoPersona) {
        this.sexoPersona = sexoPersona;
    }

    public LocalDate getFechaNacimientoPersona() {
        return fechaNacimientoPersona;
    }

    public void setFechaNacimientoPersona(int dia, int mes, int anio) {
        LocalDate fechaNac = LocalDate.of(anio, mes, dia);
        LocalDate hoy = LocalDate.now();
        int edad = hoy.getYear() - fechaNac.getYear();
        fechaNac.getDayOfMonth();
        fechaNac.getMonth();
        fechaNac.getYear();
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        this.fechaNacimientoPersona = fechaNacimientoPersona;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dniPersona='" + dniPersona + '\'' +
                ", nombrePersona='" + nombrePersona + '\'' +
                ", apellidoPersona='" + apellidoPersona + '\'' +
                ", sexoPersona=" + sexoPersona +
                ", fechaNacimientoPersona=" + fechaNacimientoPersona +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                ", casado=" + casado +
                '}';
    }

    public int calcularLetra(int DNI_numero) {

        Scanner teclado = new Scanner(System.in);
        String dni = "1";
        DNI_numero = 1;
        do {
            System.out.println("Introduce numero DNI:");
            this.dniPersona = dni;
            DNI_numero = Integer.parseInt(dni);
            if (dni.length() > 8 || dni.length() < 8) {

                System.out.println("Error. El DNI debe tener 8 dígitos");
                System.out.print("Introduce numero DNI:");
                dni = teclado.nextLine();
            }

        } while (dni.length() > 8 || dni.length() < 8);
        String letra = "";

        switch ((DNI_numero % 23)) {
            case 1:
                letra = "R";
                break;
            case 2:
                letra = "W";
                break;
            case 3:
                letra = "A";
                break;
            case 4:
                letra = "G";
                break;
            case 5:
                letra = "M";
                break;
            case 6:
                letra = "Y";
                break;
            case 7:
                letra = "F";
                break;
            case 8:
                letra = "P";
                break;
            case 9:
                letra = "D";
                break;
            case 10:
                letra = "X";
                break;
            case 11:
                letra = "B";
                break;
            case 12:
                letra = "N";
                break;
            case 13:
                letra = "J";
                break;
            case 14:
                letra = "Z";
                break;
            case 15:
                letra = "S";
                break;
            case 16:
                letra = "Q";
                break;
            case 17:
                letra = "V";
                break;
            case 18:
                letra = "H";
                break;
            case 19:
                letra = "L";
                break;
            case 20:
                letra = "C";
                break;
            case 21:
                letra = "K";
                break;
            case 22:
                letra = "E";
                break;

        }
        System.out.println("Letra " + letra);
        return DNI_numero;
    }

    private void CalcularEdad() {

        if (this.fechaNacimientoPersona.getDayOfYear() <= LocalDate.now().getDayOfYear()) {
            this.edad = LocalDate.now().getYear() - this.fechaNacimientoPersona.getYear();
        } else {
            this.edad = LocalDate.now().getYear() - this.fechaNacimientoPersona.getYear() - 1;
        }
    }


    public int pesoIdeal (double peso){

         peso = (0.75 * (this.altura - 150) + 50);

        if (peso < this.peso) {

            return -1;

        } else if (peso == this.peso ) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean mayorEdad(){
        return this.edad > 18;
    }

    public int edad(){
        return this.edad;
    }

}
