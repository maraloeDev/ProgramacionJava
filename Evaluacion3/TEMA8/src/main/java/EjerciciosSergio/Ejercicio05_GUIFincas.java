package EjerciciosSergio;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ejercicio05_GUIFincas extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio06_Finca
     */
    //AñadirFinca
    static FileOutputStream fos;
    static BufferedOutputStream bos;
    static DataOutputStream dos;
    static ArrayList<String> listaFincas = new ArrayList<>();
    static Ejercicio05_Fincas lasFincas = new Ejercicio05_Fincas();

    public Ejercicio05_GUIFincas() {
        initComponents();
        setFrame();
    }

    private void setFrame() {
        setTitle("El Ejercicio");
        setLocationRelativeTo(null);
        setSize(500, 300);
        setResizable(false);
    }

    void agregarFinca() {
        // Comprobaciones
        String nombreFinca = "";
        do {
            nombreFinca = JOptionPane.showInputDialog(null, "Introduce un nombre para la finca");
            if (nombreFinca == null || nombreFinca.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No has introducido nada!!!! \n VUELVE A INTENTARLO!!!!!!!!");
                return;
            }
        } while (nombreFinca.isEmpty());

        File nombreFincas = new File("C:\\Users\\Eduardo\\Desktop\\Fincas\\nombreFincas.tal");

        try {

            fos = new FileOutputStream(nombreFincas, true);
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bos);

            if (!nombreFincas.exists()) {
                nombreFincas.createNewFile();
            }

            listaFincas.add(nombreFinca);

            dos.writeInt(listaFincas.size());
            dos.writeUTF(nombreFinca);
            

            JOptionPane.showMessageDialog(null, "Finca agregada correctamente en el archivo" + nombreFincas.getCanonicalPath());
            dos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio05_GUIFincas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio05_GUIFincas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void verFincas() {

        datosFinca.setText(String.valueOf(listaFincas));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelNormal = new javax.swing.JPanel();
        datosFinca = new javax.swing.JTextField();
        anadirFinca = new javax.swing.JButton();
        borrarFinca = new javax.swing.JButton();
        verFinca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        datosFinca.setEditable(false);
        datosFinca.setBorder(javax.swing.BorderFactory.createTitledBorder("FINCAS MANOLO"));

        anadirFinca.setText("Añadir Finca");
        anadirFinca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anadirFincaMouseClicked(evt);
            }
        });

        borrarFinca.setText("Borrar Finca");

        verFinca.setText("Ver Fincas");
        verFinca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verFincaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelNormalLayout = new javax.swing.GroupLayout(PanelNormal);
        PanelNormal.setLayout(PanelNormalLayout);
        PanelNormalLayout.setHorizontalGroup(
            PanelNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNormalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verFinca)
                    .addComponent(borrarFinca)
                    .addComponent(anadirFinca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(datosFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelNormalLayout.setVerticalGroup(
            PanelNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNormalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(datosFinca)
                .addContainerGap())
            .addGroup(PanelNormalLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(anadirFinca)
                .addGap(33, 33, 33)
                .addComponent(borrarFinca)
                .addGap(33, 33, 33)
                .addComponent(verFinca)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anadirFincaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anadirFincaMouseClicked
        agregarFinca();
    }//GEN-LAST:event_anadirFincaMouseClicked

    private void verFincaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verFincaMouseClicked
        verFincas();
    }//GEN-LAST:event_verFincaMouseClicked

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
            java.util.logging.Logger.getLogger(Ejercicio05_GUIFincas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio05_GUIFincas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio05_GUIFincas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio05_GUIFincas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ejercicio05_GUIFincas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelNormal;
    private javax.swing.JButton anadirFinca;
    private javax.swing.JButton borrarFinca;
    private javax.swing.JTextField datosFinca;
    private javax.swing.JButton verFinca;
    // End of variables declaration//GEN-END:variables
}
