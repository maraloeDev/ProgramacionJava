package EjerciciosSergio;

import java.io.File;


public class Ejercicio06_Golf extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio06_Golf
     */
    
    static File archivoPrincipal = new File(pathname)
    public Ejercicio06_Golf() {
        initComponents();
        setFrame();
    }
    
private void setFrame(){
        setLocationRelativeTo(null);
        setResizable(false);
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
        datosJugadores = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        verArchivo = new javax.swing.JMenuItem();
        modificarArchivo = new javax.swing.JMenuItem();
        exportarPartida = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        agregarPuntuacion = new javax.swing.JMenuItem();
        calcularResultado = new javax.swing.JMenuItem();
        verPartidas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setEnabled(false);
        setResizable(false);

        datosJugadores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(datosJugadores);

        jMenu2.setText("Archivo");

        verArchivo.setText("Ver");
        jMenu2.add(verArchivo);

        modificarArchivo.setText("Modificar");
        jMenu2.add(modificarArchivo);

        exportarPartida.setText("Exportar una partida");
        jMenu2.add(exportarPartida);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Opciones");

        agregarPuntuacion.setText("Agregar una nueva puntuación");
        jMenu3.add(agregarPuntuacion);

        calcularResultado.setText("Calcular resultado de una partida");
        jMenu3.add(calcularResultado);

        verPartidas.setText("Ver partidas guardadas");
        jMenu3.add(verPartidas);

        jMenuBar1.add(jMenu3);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        java.awt.EventQueue.invokeLater(() -> {
            new Ejercicio06_Golf().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agregarPuntuacion;
    private javax.swing.JMenuItem calcularResultado;
    private javax.swing.JList<String> datosJugadores;
    private javax.swing.JMenuItem exportarPartida;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem modificarArchivo;
    private javax.swing.JMenuItem verArchivo;
    private javax.swing.JMenuItem verPartidas;
    // End of variables declaration//GEN-END:variables
}
