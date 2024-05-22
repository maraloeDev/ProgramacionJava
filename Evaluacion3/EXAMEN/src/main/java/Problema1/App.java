package Problema1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.SocketOptions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    static Scanner scanner = new Scanner(System.in);

    //ConexionBD
    static Connection con;
    static String url;
    static String user;
    static String password;
    static PreparedStatement ps;
    static Statement st;
    static ResultSet rs;

    //EscrituraTxt
    static BufferedWriter bw;
    static File archivo = new File(".\\src\\main\\java\\Problema1\\incidencias.txt");
    static String CIF_cliente;
    static String nombre_cliente;
    static boolean clientExist = false;

    //AlmacenaClientes
    static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public static void main(String[] args) {
        conexionBD();
        menu();
    }

    private static void conexionBD() {

        try {
            url = "jdbc:mysql://localhost:3306/junio2023";
            user = "root";
            password = "";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("Base de Datos conectada");
        } catch (SQLException ex) {
            System.err.println("Base de Datos NO conectada, comprueba credenciales");
            System.exit(0);
        }

    }

    private static void menu() {

        String opcion = "";

        do {
            try {
                System.out.println("Introduce una opcion: \n A  B o x (Salir del programa)");
                opcion = scanner.nextLine();

                switch (opcion) {
                    case "a":

                        altaClientes();
                        break;
                    case "b":

                        bajaClientes();
                        break;

                    case "x":
                        con.close();
                        System.out.println("Base de datos desconectada");
                        System.exit(0);
                    default:
                        System.out.println("Opcion incorrecta, vuelve a intentarlo");
                }
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while (!opcion.equalsIgnoreCase("a") || !opcion.equalsIgnoreCase("b") || !opcion.equalsIgnoreCase("x"));
    }

    private static void altaClientes() {
        System.out.print("Introduce un CIF: ");
        CIF_cliente = scanner.next();

        scanner.nextLine();

        System.out.println("Introduce un nombre");
        nombre_cliente = scanner.nextLine();

        try {
            String consultaComprobacion = "SELECT * FROM clientes WHERE CIF_cliente = ?";

            ps = con.prepareStatement(consultaComprobacion);
            ps.setString(1, CIF_cliente);

            ResultSet rs = ps.executeQuery();
            rs.next();
            clientExist = true;

            if (clientExist) {
                System.out.println("El cliente ya existe");
                registrarIncidencia(CIF_cliente, "El cliente ya existe");
            } else {
                String consulta = "INSERT INTO clientes (CIF_cliente, nombre_cliente) VALUES (?,?)";
                ps = con.prepareStatement(consulta);

                ps.setString(1, CIF_cliente);
                ps.setString(2, nombre_cliente);

                ps.executeUpdate();

                System.out.println("Cliente agregado correctamente");
            }

            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void registrarIncidencia(String CIF_cliente, String mensaje) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write("CIF Cliente: " + CIF_cliente + ", Incidencia: " + mensaje);
            bw.newLine();
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void bajaClientes() {

        try {
            String consulta = "DELETE FROM clientes where nombre_cliente = ?";

            System.out.println("Introduce un nombre de un cliente: ");
            String nombre_cliente = scanner.nextLine();

            ps = con.prepareStatement(consulta);

            ps.setString(1, nombre_cliente);

            ps.executeUpdate();
            System.out.println("Cliente eliminado");
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void recorreLista() {
        try {
            String consulta = "SELECT *  FROM clientes";

            st = con.createStatement();
            rs = st.executeQuery(consulta);

            while (rs.next()) {
                rs.getString(1);
                rs.getString(2);
            }
            st.close();
            rs.close();

            

        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
