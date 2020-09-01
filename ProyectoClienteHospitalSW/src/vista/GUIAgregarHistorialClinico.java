
package vista;

/**
 *
 * @author crist
 */
public class GUIAgregarHistorialClinico extends javax.swing.JFrame {

    /** Creates new form GUIAgregarHistorialClinico */
    public GUIAgregarHistorialClinico() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigoEnfermedad = new javax.swing.JTextField();
        txtNumeroHistoria = new javax.swing.JTextField();
        txtNombreMedico = new javax.swing.JTextField();
        txtDocumentoPaciente = new javax.swing.JTextField();
        butListarEnfermedades = new javax.swing.JButton();
        butListarPacientes = new javax.swing.JButton();
        butSalir = new javax.swing.JButton();
        butAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Historial");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText(" Numero De Historia: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, -1));

        jLabel3.setText(" Nombre De Medico: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, -1));

        jLabel5.setText("Documento Del Paciente:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, -1));

        jLabel6.setText("Codigo De La Enfermedad:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 130, -1));
        getContentPane().add(txtCodigoEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 240, 30));
        getContentPane().add(txtNumeroHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 240, 30));
        getContentPane().add(txtNombreMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 240, 30));
        getContentPane().add(txtDocumentoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 240, 30));

        butListarEnfermedades.setText("...");
        getContentPane().add(butListarEnfermedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 40, 30));

        butListarPacientes.setText("...");
        getContentPane().add(butListarPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 40, 30));

        butSalir.setText("Salir");
        butSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalirActionPerformed(evt);
            }
        });
        getContentPane().add(butSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 90, 30));

        butAgregar.setText("Agregar");
        butAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(butAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 90, 30));

        pack();
    }//GEN-END:initComponents

    private void butSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_butSalirActionPerformed

    private void butAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butAgregarActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing
                                                                   .UIManager
                                                                   .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing
                         .UIManager
                         .setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util
                .logging
                .Logger
                .getLogger(GUIAgregarHistorialClinico.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util
                .logging
                .Logger
                .getLogger(GUIAgregarHistorialClinico.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util
                .logging
                .Logger
                .getLogger(GUIAgregarHistorialClinico.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util
                .logging
                .Logger
                .getLogger(GUIAgregarHistorialClinico.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt
            .EventQueue
            .invokeLater(new Runnable() {
                public void run() {
                    new GUIAgregarHistorialClinico().setVisible(true);
                }
            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton butAgregar;
    public javax.swing.JButton butListarEnfermedades;
    public javax.swing.JButton butListarPacientes;
    public javax.swing.JButton butSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JTextField txtCodigoEnfermedad;
    public javax.swing.JTextField txtDocumentoPaciente;
    public javax.swing.JTextField txtNombreMedico;
    public javax.swing.JTextField txtNumeroHistoria;
    // End of variables declaration//GEN-END:variables

}