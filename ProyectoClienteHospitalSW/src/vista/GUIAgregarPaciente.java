
package vista;

/**
 *
 * @author crist
 */
public class GUIAgregarPaciente extends javax.swing.JFrame {

    /** Creates new form GUIAgregarPaciente */
    public GUIAgregarPaciente() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombrePaciente = new javax.swing.JTextField();
        txtDocumentoPaciente = new javax.swing.JTextField();
        txtCorreoPaciente = new javax.swing.JTextField();
        txtTelefonoPaciente = new javax.swing.JTextField();
        radioButMasculino = new javax.swing.JRadioButton();
        radioButFemenino = new javax.swing.JRadioButton();
        butSalir = new javax.swing.JButton();
        butAgregar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Paciente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 17, -1, -1));

        jLabel2.setText("Documento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, -1, -1));

        jLabel3.setText("Telefono :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 162, -1, -1));

        jLabel4.setText("Correo :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 105, -1, -1));

        jLabel5.setText("Genero: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 215, -1, -1));

        txtNombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePacienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 12, 230, 25));

        txtDocumentoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtDocumentoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 55, 230, 25));

        txtCorreoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 100, 230, 25));

        txtTelefonoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefonoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 157, 230, 25));

        radioButMasculino.setText("Masculino");
        getContentPane().add(radioButMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 213, -1, -1));

        radioButFemenino.setText("Femenino");
        getContentPane().add(radioButFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 213, -1, -1));

        butSalir.setText("Salir");
        butSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalirActionPerformed(evt);
            }
        });
        getContentPane().add(butSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 70, -1));

        butAgregar1.setText("Agregar");
        getContentPane().add(butAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 70, -1));

        pack();
    }//GEN-END:initComponents

    private void txtNombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePacienteActionPerformed

    private void txtDocumentoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoPacienteActionPerformed

    private void txtCorreoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoPacienteActionPerformed

    private void txtTelefonoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoPacienteActionPerformed

    private void butSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalirActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_butSalirActionPerformed

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
                .getLogger(GUIAgregarPaciente.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util
                .logging
                .Logger
                .getLogger(GUIAgregarPaciente.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util
                .logging
                .Logger
                .getLogger(GUIAgregarPaciente.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util
                .logging
                .Logger
                .getLogger(GUIAgregarPaciente.class.getName())
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
                    new GUIAgregarPaciente().setVisible(true);
                }
            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton butAgregar1;
    public javax.swing.JButton butSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JRadioButton radioButFemenino;
    public javax.swing.JRadioButton radioButMasculino;
    public javax.swing.JTextField txtCorreoPaciente;
    public javax.swing.JTextField txtDocumentoPaciente;
    public javax.swing.JTextField txtNombrePaciente;
    public javax.swing.JTextField txtTelefonoPaciente;
    // End of variables declaration//GEN-END:variables

}
