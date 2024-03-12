package EjerciciosArraysObjetos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01_ArraysAgenda {

    static Contacto[] contactos = new Contacto[5];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        String opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Buscar Contacto");
            System.out.println("3. Modificar Contacto");
            System.out.println("4. Eliminar Contacto");
            System.out.println("5. Mostrar Contactos");
            System.out.println("6. Vaciar Agenda");
            System.out.println("7. Salir");

            opcion = scanner.nextLine();

            switch (opcion) {
                case "1" -> agregarContacto();
                case "2" -> submenuBuscar();
                case "3" -> modificarContacto();
                case "4" -> eliminarContacto();
                case "5" -> mostrarContactos();
                case "6" -> vaciarAgenda();
                case "7" -> System.out.println("Has salido...");
                default -> System.out.println("Opción no válida");
            }
        } while (!opcion.equals("7"));
    }

    public static void submenuBuscar() {
        String opcion;
        do {
            System.out.println("Seleccione una opción de búsqueda:");
            System.out.println("1. Buscar por nombre");
            System.out.println("2. Buscar por teléfono");
            System.out.println("3. Volver al menú principal");

            opcion = scanner.nextLine();

            switch (opcion) {
                case "1" -> buscarPorNombre();
                case "2" -> buscarPorTelefono();
                case "3" -> menu();
                default -> System.out.println("Opción no válida");
            }
        } while (!opcion.equals("3"));
    }

    public static void agregarContacto() {
        
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                System.out.print("Introduce el nombre: ");
                String nombre = scanner.nextLine();
                
                System.out.print("Introduce el teléfono: ");
                String telefono = scanner.nextLine();
                
                contactos[i] = new Contacto(nombre, telefono);
                System.out.println("Contacto agregado correctamente");
                return;
            }
        }
        System.out.println("La agenda está llena. No se puede agregar más contactos.");
    }

    public static void buscarPorNombre() {
        System.out.print("Introduce el nombre a buscar: ");
        String nombre = scanner.nextLine();
        
        boolean encontrado = false;
        for (Contacto contacto : contactos) {
            if (contacto != null && contacto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(contacto);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto no encontrado");
        }
    }

    public static void buscarPorTelefono() {
        System.out.print("Introduce el teléfono a buscar: ");
        String telefono = scanner.nextLine();
        
        boolean encontrado = false;
        for (Contacto contacto : contactos) {
            if (contacto != null && contacto.getTelefono().equalsIgnoreCase(telefono)) {
                System.out.println(contacto);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto no encontrado");
        }
    }

    public static void modificarContacto() {
        System.out.print("Introduce el nombre del contacto a modificar: ");
        String nombreModificar = scanner.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(nombreModificar)) {
                
                System.out.print("Introduce el nuevo nombre: ");
                String nuevoNombre = scanner.nextLine();
                
                System.out.print("Introduce el nuevo teléfono: ");
                String nuevoTelefono = scanner.nextLine();
                
                contactos[i].setNombre(nuevoNombre);
                contactos[i].setTelefono(nuevoTelefono);
                
                System.out.println("Contacto modificado correctamente");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto no encontrado");
        }
    }

    public static void eliminarContacto() {
        System.out.print("Introduce el nombre del contacto a eliminar: ");
        String nombreEliminar = scanner.nextLine();
        
        boolean encontrado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(nombreEliminar)) {
                contactos[i] = null;
                System.out.println("Contacto eliminado correctamente");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto no encontrado");
        }
    }

    public static void mostrarContactos() {
        System.out.println("Contactos en la agenda:");
        
        for (Contacto contacto : contactos) {
            if (contacto != null) {
                System.out.println(contacto);
            }
        }
    }

    public static void vaciarAgenda() {
        Arrays.fill(contactos, null);
        System.out.println("Agenda vaciada correctamente");
    }
}
