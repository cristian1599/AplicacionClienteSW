package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import model.ServicioLocalPaciente;

import serviciosweb.Paciente;

import serviciosweb.PacienteSW;
import serviciosweb.ServicioPacienteSW;

import vista.GUIAgregarHistorialClinico;
import vista.GUIAgregarPaciente;
import vista.GUIBuscarPaciente;
import vista.GUIEliminarPaciente;
import vista.GUIListarPacienteParametro;
import vista.GUIListarPacientes;
import vista.GUIModificarPaciente;
import vista.GUIPrincipal;

public class ControladorPaciente implements ActionListener {
    public ControladorPaciente() {
        super();
    }

    private PacienteSW pacienteSW;


    Paciente paciente = new Paciente();
    GUIPrincipal guiP = new GUIPrincipal();
    GUIAgregarPaciente guiAgregarP = new GUIAgregarPaciente();
    GUIListarPacientes guiListarP = new GUIListarPacientes();
    GUIBuscarPaciente guiBuscarP = new GUIBuscarPaciente();
    GUIListarPacienteParametro guiListarParametro = new GUIListarPacienteParametro();
    GUIModificarPaciente guiModificarP = new GUIModificarPaciente();
    GUIEliminarPaciente guiEliminarP = new GUIEliminarPaciente();

    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorPaciente(GUIPrincipal principal, GUIAgregarPaciente agregar) {
        pacienteSW = ServicioLocalPaciente.getServicio();
        this.guiP = principal;
        this.guiAgregarP = agregar;
        this.guiP
            .jMenuListarPaciente
            .addActionListener(this);
        this.guiP
            .jMenuAgregarPaciente
            .addActionListener(this);
        this.guiAgregarP
            .butAgregar1
            .addActionListener(this);
        this.guiP
            .jMenuListarParametro
            .addActionListener(this);
        this.guiListarP
            .butListar
            .addActionListener(this);
        this.guiP
            .jMenuBuscarPaciente
            .addActionListener(this);
        this.guiBuscarP
            .butBuscar
            .addActionListener(this);
        this.guiP
            .jMenuModificarPaciente
            .addActionListener(this);
        this.guiModificarP
            .butBuscar
            .addActionListener(this);
        this.guiModificarP
            .butModificar
            .addActionListener(this);
        this.guiP
            .jMenuEliminarPaciente
            .addActionListener(this);
        this.guiEliminarP
            .butBuscar
            .addActionListener(this);
        this.guiEliminarP
            .butEliminar
            .addActionListener(this);
        this.guiListarParametro
            .butListar
            .addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == guiP.jMenuAgregarPaciente) {
            guiAgregarP.setVisible(true);
        }
        if (e.getSource() == guiAgregarP.butAgregar1) {
            agregar();
            limpairFormularioAgregar();
        }
        if (e.getSource() == guiP.jMenuListarPaciente) {
            guiListarP.setVisible(true);
        }
        if (e.getSource() == guiP.jMenuListarParametro) {
            guiListarParametro.setVisible(true);
        }
        if (e.getSource() == guiListarP.butListar) {
            limpiarTabla();
            listarPacientes();
        }
        if (e.getSource() == guiP.jMenuBuscarPaciente) {
            guiBuscarP.setVisible(true);
        }
        if (e.getSource() == guiBuscarP.butBuscar) {
            buscar();
            guiBuscarP.txtDocumentoParametro.setText("");
        }
        if (e.getSource() == guiP.jMenuModificarPaciente) {
            guiModificarP.setVisible(true);
        }
        if (e.getSource() == guiModificarP.butBuscar) {

            buscarModificado();
        }
        if (e.getSource() == guiModificarP.butModificar) {
            modificarPaciente();
            limpiarFormularioModificar();
        }
        if (e.getSource() == guiP.jMenuEliminarPaciente)

        {
            guiEliminarP.setVisible(true);
        }
        if (e.getSource() == guiEliminarP.butBuscar) {
            buscarEliminado();
        }
        if (e.getSource() == guiEliminarP.butEliminar) {
            eliminarPaciente();
            limpiarFormularioEliminar();
        }
        if (e.getSource() == guiListarParametro.butListar) {
            limpiarTabla();
            listarPorParametro();
        }

    }

    public void agregar() {
        String documento = guiAgregarP.txtDocumentoPaciente.getText();
        String nombre = guiAgregarP.txtNombrePaciente.getText();
        String correo = guiAgregarP.txtCorreoPaciente.getText();
        String telefono = guiAgregarP.txtTelefonoPaciente.getText();
        String genero = "";
        if (guiAgregarP.radioButMasculino.isSelected()) {
            genero = guiAgregarP.radioButMasculino.getText();
        } else {
            genero = guiAgregarP.radioButFemenino.getText();
        }
        paciente.setDocumento(documento);
        paciente.setNombre(nombre);
        paciente.setCorreo(correo);
        paciente.setTelefono(telefono);
        paciente.setGenero(genero);
        int agregado;
        agregado = pacienteSW.agregarPaciente(paciente);
        if (agregado == 1) {
            JOptionPane.showMessageDialog(guiAgregarP, "Paciente agregado con exito");
        } else {
            JOptionPane.showMessageDialog(guiAgregarP, "Error");
        }

    }

    public void listarPacientes() {
        modelo = (DefaultTableModel) guiListarP.jTablePacientes.getModel();


        List<Paciente> lista = pacienteSW.listar();


        Object[] object = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getDocumento();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getCorreo();
            object[3] = lista.get(i).getTelefono();
            object[4] = lista.get(i).getGenero();
            modelo.addRow(object);
        }

        guiListarP.jTablePacientes.setModel(modelo);
        //modelo.fireTableDataChanged();


    }

    public void buscar() {
        String documento = guiBuscarP.txtDocumentoParametro.getText();

        //ResultSet rs = paciente.buscarPaciente(documento);
        Paciente rs;
        try {
            rs = pacienteSW.buscarPaciente(documento);
            guiBuscarP.txtDocumento.setText(rs.getDocumento());
            guiBuscarP.txtNombre.setText(rs.getNombre());
            guiBuscarP.txtCorreo.setText(rs.getCorreo());
            guiBuscarP.txtTelefono.setText(rs.getTelefono());
            guiBuscarP.txtGenero1.setText(rs.getGenero());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(guiBuscarP, "Error, El paciente no existe!");
        }

    }


    public void buscarModificado() {
        String documento = guiModificarP.txtDocumentoParametro.getText();

        //ResultSet rs = paciente.buscarPaciente(documento);
        Paciente rs;
        try {
            rs = pacienteSW.buscarPaciente(documento);
            guiModificarP.txtDocumento.setText(rs.getDocumento());
            guiModificarP.txtNombre.setText(rs.getNombre());
            guiModificarP.txtCorreo.setText(rs.getCorreo());
            guiModificarP.txtTelefono.setText(rs.getTelefono());
            guiModificarP.txtGenero1.setText(rs.getGenero());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(guiModificarP, "Error, El paciente no existe!");
        }
    }


    public void modificarPaciente() {

        String Documento = guiModificarP.txtDocumentoParametro.getText();
        String documento = guiModificarP.txtDocumento.getText();
        String nombre = guiModificarP.txtNombre.getText();
        String correo = guiModificarP.txtCorreo.getText();
        String telefono = guiModificarP.txtTelefono.getText();
        String genero = guiModificarP.txtGenero1.getText();
        paciente.setDocumento(documento);
        paciente.setNombre(nombre);
        paciente.setCorreo(correo);
        paciente.setTelefono(telefono);
        paciente.setGenero(genero);
        int actualizar;

        actualizar = pacienteSW.modificarPaciente(paciente, Documento);

        if (actualizar == 1) {
            JOptionPane.showMessageDialog(guiModificarP, "Usuario Modificado con exito");
        } else {
            JOptionPane.showMessageDialog(guiModificarP, "Usuario No modificado");
        }

    }

    public void buscarEliminado() {
        String documento = guiEliminarP.txtDocumentoParametro.getText();


        Paciente rs;
        try {
            rs = pacienteSW.buscarPaciente(documento);
            guiEliminarP.txtDocumento.setText(rs.getDocumento());
            guiEliminarP.txtNombre.setText(rs.getNombre());
            guiEliminarP.txtCorreo.setText(rs.getCorreo());
            guiEliminarP.txtTelefono.setText(rs.getTelefono());
            guiEliminarP.txtGenero1.setText(rs.getGenero());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(guiEliminarP, "Error, El paciente no existe!");
        }
    }

    public void eliminarPaciente() {

        String documento = guiEliminarP.txtDocumentoParametro.getText();
        try {
            pacienteSW.eliminarPaciente(documento);
            JOptionPane.showMessageDialog(guiEliminarP, "Paciente Eliminado Con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(guiEliminarP, "Error, El paciente no pudo ser eliminado!");
        }
    }

    public void listarPorParametro() {
        modelo = (DefaultTableModel) guiListarParametro.jTablePacientes.getModel();

        String nombre = guiListarParametro.txtNombrePaciente.getText();

        List<Paciente> lista = pacienteSW.listarPorParametro(nombre);


        Object[] object = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getDocumento();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getCorreo();
            object[3] = lista.get(i).getTelefono();
            object[4] = lista.get(i).getGenero();
            modelo.addRow(object);
        }

        guiListarP.jTablePacientes.setModel(modelo);
        //modelo.fireTableDataChanged();


    }


    void limpiarTabla() {
        //modelo = (DefaultTableModel)guiL.jTableListar.getModel();
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public void limpairFormularioAgregar() {
        guiAgregarP.txtDocumentoPaciente.setText("");
        guiAgregarP.txtNombrePaciente.setText("");
        guiAgregarP.txtCorreoPaciente.setText("");
        guiAgregarP.txtTelefonoPaciente.setText("");
        guiAgregarP.radioButFemenino.setSelected(false);
        guiAgregarP.radioButMasculino.setSelected(false);
        //guiAgregarP.txtGenero.setText(rs.getGenero());
    }

    public void limpiarFormularioEliminar() {
        guiEliminarP.txtDocumentoParametro.setText("");
        guiEliminarP.txtDocumento.setText("");
        guiEliminarP.txtNombre.setText("");
        guiEliminarP.txtCorreo.setText("");
        guiEliminarP.txtTelefono.setText("");
        guiEliminarP.txtGenero.setText("");
    }

    public void limpiarFormularioModificar() {
        guiModificarP.txtDocumentoParametro.setText("");
        guiModificarP.txtDocumento.setText("");
        guiModificarP.txtNombre.setText("");
        guiModificarP.txtCorreo.setText("");
        guiModificarP.txtTelefono.setText("");
        guiModificarP.txtGenero1.setText("");
    }


}
