package Problema1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public static void main(String[] args) {
        conexionBD();
        menu();

    }

    private static void conexionBD() {
        
        try {
            url = "jdbc:mysql://localhost:3306/junio2023";
            user = "root";
            password="";
            
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
                    case "A":
                        
                        altaClientes();
                        break;
                    case "B":
                        
                        bajaClientes();
                        break;
                        
                    case "x " :
                        con.close();
                        System.out.println("Base de datos desconectada");
                        System.exit(0);
                    default:
                        System.out.println("Opcion incorrecta, vuelve a intentarlo");
                }
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while (!opcion.equalsIgnoreCase("A") || !opcion.equalsIgnoreCase("B") || !opcion.equalsIgnoreCase("x"));
        
        

    }
    
    private static void altaClientes(){
        
        try {
            String consulta = "INSERT INTO clientes (CIF_cliente, nombre_cliente) VALUES (?,?)";
            
            ps = con.prepareStatement(consulta);
            
            System.out.print("Introduce un CIF: ");
                String CIF_cliente = scanner.next();
                
                scanner.nextLine();
                
                System.out.println("Introduce un nombre");
                String nombre_cliente = scanner.nextLine();
                
                ps.setString(1, CIF_cliente);
                ps.setString(2, nombre_cliente);
                
                ps.executeUpdate();
                
            System.out.println("Cliente agregado correctamente");
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    private static void bajaClientes(){
        
        try {
            String consulta = "DELETE FROM clientes where nombre_cliente = ?";
            
            System.out.println("Introduce un nombre de un cliente: ");
            String nombre_cliente = scanner.nextLine();
            
            ps = con.prepareStatement(consulta);
            
            ps.setString(1b, nombre_cliente);
            
            ps.executeUpdate();
            System.out.println("Cliente eliminado");
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    

}
