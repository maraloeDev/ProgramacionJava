package Ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexionBD {
    
    static Connection con;
    static DriverManager driverManager;
    static String url;
    static String usuario;
    static String contrasena;
    
    public static void main(String[] args) {
        conectarBD();
        
    }
    
    static void conectarBD(){
        try {
            con = DriverManager.getConnection(url, usuario, contrasena);
            JOptionPane.showMessageDialog(null, "Conexion establecida");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    
    static void desconexionBD(){
        
        try {
            con.close();
            JOptionPane.showMessageDialog(null, "Desconexion de la BD");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
