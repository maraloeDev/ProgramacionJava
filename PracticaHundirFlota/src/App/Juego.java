package App;

import java.util.Scanner;

public class Juego {

    static Scanner scanner = new Scanner(System.in);
    static Jugador jugador1 = new Jugador("Jugador 1");
    static Jugador jugador2 = new Jugador("Jugador 2");

    public static void main(String[] args) {

        // Colocación de barcos para el jugador 1
        jugador1.colocarBarco(1, 'A', "horizontal", new Barco("Portaviones", 5));
        jugador1.colocarBarco(2, 'D', "vertical", new Barco("Buque", 4));
        jugador1.colocarBarco(5, 'G', "horizontal", new Barco("Lancha", 3));
        jugador1.colocarBarco(8, 'C', "vertical", new Barco("Submarino", 3));

        // Colocación de barcos para el jugador 2
        jugador2.colocarBarco(1, 'B', "vertical", new Barco("Portaviones", 5));
        jugador2.colocarBarco(4, 'E', "horizontal", new Barco("Buque", 4));
        jugador2.colocarBarco(7, 'H', "vertical", new Barco("Lancha", 3));
        jugador2.colocarBarco(3, 'J', "horizontal", new Barco("Submarino", 3));

        // Mostrar tableros
        System.out.println("Tablero de Jugador 1:");
        jugador1.getTablero().mostrarTablero();
        System.out.println("\nTablero de Jugador 2:");
        jugador2.getTablero().mostrarTablero();
    }
}
