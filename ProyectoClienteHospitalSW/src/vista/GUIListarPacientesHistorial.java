
package vista;

/**
 *
 * @author crist
 */
public class GUIListarPacientesHistorial extends javax.swing.JFrame {
    GUIAgregarHistorialClinico padre;
    /** Creates new form GUIListarPacientesHistorial */
    public GUIListarPacientesHistorial(GUIAgregarHistorialClinico pPadre) {
        initComponents();
        this.setLocationRelativeTo(null);
        padre = pPadre;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePacientesHistorial = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Pacientes");

        jTablePacientesHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombre", "Correo", "Telefono", "Genero"
            }
        ));
        jTablePacientesHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacientesHistorialMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePacientesHistorial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );

        pack();
    }//GEN-END:initComponents

    private void jTablePacientesHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacientesHistorialMouseClicked
        // TODO add your handling code here:
        int column = 0;
              
                int row = jTablePacientesHistorial.getSelectedRow();
                String value = jTablePacientesHistorial.getModel().getValueAt(row, column).toString();
                padre.txtDocumentoPaciente.setText(value);
                this.dispose();
    }//GEN-LAST:event_jTablePacientesHistorialMouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTablePacientesHistorial;
    // End of variables declaration//GEN-END:variables

}