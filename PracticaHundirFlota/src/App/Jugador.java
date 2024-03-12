package App;

import java.util.ArrayList;

public class Jugador {
    
    private String nick;
    private Tablero tablero;
    private ArrayList<Barco> flota;

    public Jugador(String nick) {
        this.nick = nick;
        this.tablero = new Tablero();
        this.flota = new ArrayList<>();
    }

    public void colocarBarco(int fila, char columna, String orientacion, Barco barco) {
        char[][] tableroJugador = tablero.getTablero();
        int longitud = barco.getLongitud();
        int filaInicio = fila - 1;
        int columnaInicio = columna - 'A';
        if (orientacion.equals("vertical")) {
            for (int i = filaInicio; i < filaInicio + longitud; i++) {
                if (tableroJugador[i][columnaInicio] != 'A') {
                    System.out.println("Posición ocupada por otro barco.");
                    return;
                }
            }
            for (int i = filaInicio; i < filaInicio + longitud; i++) {
                tableroJugador[i][columnaInicio] = barco.getFigura().charAt(0);
            }
        } else if (orientacion.equals("horizontal")) {
//            for (int j = columnaInicio; j < columnaInicio + longitud; j++) {
//                if (tableroJugador[filaInicio][j] != 'A') {
//                    System.out.println("Posición ocupada por otro barco.");
//                    return;
//                }
//            }
//            for (int j = columnaInicio; j < columnaInicio + longitud; j++) {
//                tableroJugador[filaInicio][j] = barco.getFigura().charAt(0);
//            }
//        } else {
//            System.out.println("Orientación incorrecta.");
//            return;
//        }
        }
        flota.add(barco);
    }

    // Métodos de acceso
    public String getNick() {
        return nick;
    }

    public ArrayList<Barco> getFlota() {
        return flota;
    }

    public Tablero getTablero() {
        return tablero;
    }
}
