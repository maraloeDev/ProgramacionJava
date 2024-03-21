package EjerciciosArraysObjetos;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    static Contacto[] listaContactos = new Contacto[5];
    static Scanner scanner = new Scanner(System.in);
    static Contacto c;

    public static void main(String[] args) {
        menu();
    }

    static void menu() {

        int opcion;
        do {
            System.out.println("Menu:");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Mostrar listado");
            System.out.println("6. Vaciar agenda");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarContacto();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                   mostrarContactos();

                    break;
                case 6:
                    
                    Arrays.fill(listaContactos, null);
                    System.out.println("Agenda vaciada correctamente");

                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 0);

    }

    static void agregarContacto() { 
        System.out.print("introduce un nombre ");
        String nombre = scanner.next();

        System.out.print("Introduce un telefono ");
        String telefono = scanner.next();

        for (int i = 0; i < listaContactos.length; i++) {
            c = new Contacto(nombre, telefono);
            System.out.println("Contacto agregado correctamente");
            break;

        }

    }
    
    static void mostrarContactos() {
        for (Contacto contacto : listaContactos) {
            if (contacto != null) {
                System.out.println(contacto);
            }
        }
    }

}
