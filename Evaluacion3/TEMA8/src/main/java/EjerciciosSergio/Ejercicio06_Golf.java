package EjerciciosSergio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Ejercicio06_Golf extends javax.swing.JFrame {

    static int contadorIds = 1;
    static File archivoPrincipal = new File(".\\src\\main\\java\\EjerciciosSergio\\archivoPrincipal.bin");
    static ArrayList<Ejercicio06_datosGolf> listaDatos = new ArrayList<>();
    static DefaultListModel<String> modeloLista = new DefaultListModel<>();

    //Escritura Binaria
    static FileOutputStream fos;
    static BufferedOutputStream bos;
    static DataOutputStream dos;

    //LecturaBinaria
    static FileInputStream fis;
    static BufferedInputStream bis;
    static DataInputStream dis;

    public Ejercicio06_Golf() {
        initComponents();
        setFrame();
    }

    private void setFrame() {
        setTitle("Golf");
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private void agregarPuntuaciones() {

        String nombre = JOptionPane.showInputDialog(null, "Introduce en nombre del jugador");
        int nGolpes = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce en numero de golpes"));
        int nHoyos = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce en numero de hoyos jugados"));

        int confirmacion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres guardar todo");

        if (confirmacion == JOptionPane.YES_OPTION) {

            listaDatos.add(new Ejercicio06_datosGolf(contadorIds, nombre, nGolpes, nHoyos));
            JOptionPane.showMessageDialog(null, "Datos almacenados correctamente");
            contadorIds++;
            try {
                fos = new FileOutputStream(archivoPrincipal);
                bos = new BufferedOutputStream(fos);
                dos = new DataOutputStream(fos);

                dos.writeUTF(String.valueOf(listaDatos.toString()));
                dos.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Ejercicio06_Golf.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio06_Golf.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Datos no almacenados");
        }
    }

    private void verPartidas() {

        listaPartidas.setModel(modeloLista);
        modeloLista.clear();
        try {
            fis = new FileInputStream(archivoPrincipal);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(fis);

            modeloLista.addElement(dis.readUTF());
            dis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio06_Golf.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio06_Golf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaPartidas = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuVer = new javax.swing.JMenuItem();
        menuModificar = new javax.swing.JMenuItem();
        menuExportar = new javax.swing.JMenuItem();
        menuPartidas = new javax.swing.JMenu();
        menuAgregarPuntuacion = new javax.swing.JMenuItem();
        menuCarcularResultado = new javax.swing.JMenuItem();
        menuVerPartidasGuardadas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaPartidas.setEnabled(false);
        jScrollPane1.setViewportView(listaPartidas);

        menuArchivo.setText("Archivo");

        menuVer.setText("Ver");
        menuArchivo.add(menuVer);

        menuModificar.setText("Modificar");
        menuArchivo.add(menuModificar);

        menuExportar.setText("Exportar partida");
        menuArchivo.add(menuExportar);

        jMenuBar1.add(menuArchivo);

        menuPartidas.setText("Partidas");

        menuAgregarPuntuacion.setText("Agregar una nueva puntuacion");
        menuAgregarPuntuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarPuntuacionActionPerformed(evt);
            }
        });
        menuPartidas.add(menuAgregarPuntuacion);

        menuCarcularResultado.setText("Calcular resultado de una partida");
        menuCarcularResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCarcularResultadoActionPerformed(evt);
            }
        });
        menuPartidas.add(menuCarcularResultado);

        menuVerPartidasGuardadas.setText("Ver partidas guardadas");
        menuVerPartidasGuardadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerPartidasGuardadasActionPerformed(evt);
            }
        });
        menuPartidas.add(menuVerPartidasGuardadas);

        jMenuBar1.add(menuPartidas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAgregarPuntuacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarPuntuacionActionPerformed
        agregarPuntuaciones();
    }//GEN-LAST:event_menuAgregarPuntuacionActionPerformed

    private void menuCarcularResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCarcularResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCarcularResultadoActionPerformed

    private void menuVerPartidasGuardadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerPartidasGuardadasActionPerformed
        verPartidas();
    }//GEN-LAST:event_menuVerPartidasGuardadasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicio06_Golf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio06_Golf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio06_Golf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio06_Golf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio06_Golf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaPartidas;
    private javax.swing.JMenuItem menuAgregarPuntuacion;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuCarcularResultado;
    private javax.swing.JMenuItem menuExportar;
    private javax.swing.JMenuItem menuModificar;
    private javax.swing.JMenu menuPartidas;
    private javax.swing.JMenuItem menuVer;
    private javax.swing.JMenuItem menuVerPartidasGuardadas;
    // End of variables declaration//GEN-END:variables
}
