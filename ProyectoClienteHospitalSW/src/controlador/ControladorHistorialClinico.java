package controlador;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import serviciosweb.HistorialClinicoSW;
import serviciosweb.Paciente;
import serviciosweb.PacienteSW;
import serviciosweb.ServicioHistorialClinicoSW;
import serviciosweb.ServicioPacienteSW;

import vista.GUIAgregarHistorialClinico;
import vista.GUIListarPacientesHistorial;
import vista.GUIPrincipal;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import model.ServicioLocalHistorialC;

import model.ServicioLocalPaciente;

import serviciosweb.Enfermedad;
import serviciosweb.HistorialClinico;
import serviciosweb.ListarEnfermedades;

import serviciosweb.ServicioEnfermedadSW;
import serviciosweb.ServicioEnfermedadSW_Service;

import vista.GUIBuscarHistorialClinico;
import vista.GUIEliminarHistorialClinico;
import vista.GUIListarEnfermedades;
import vista.GUIListarHistorialClinico;
import vista.GUIListarHistorialParametro;
import vista.GUIModificarHistorialClinico;

public class ControladorHistorialClinico implements ActionListener  {
    public ControladorHistorialClinico() {
        super();
    }
    
    
    private PacienteSW pacienteSW ;
    private HistorialClinicoSW historialClinicoSW;
    ServicioEnfermedadSW_Service servicioEnfermedadSW_Service = new ServicioEnfermedadSW_Service();
    ServicioEnfermedadSW servicioEnfermedadSW = servicioEnfermedadSW_Service.getServicioEnfermedadSWPort();
    
   
    HistorialClinico h = new HistorialClinico();
    Paciente paciente = new Paciente();
    GUIPrincipal guiP = new GUIPrincipal();
    GUIAgregarHistorialClinico guiAgregarH = new GUIAgregarHistorialClinico();
    GUIListarPacientesHistorial guiListarPacientes = new GUIListarPacientesHistorial(guiAgregarH);
    GUIListarEnfermedades guiListarE = new GUIListarEnfermedades(guiAgregarH);
    GUIListarHistorialClinico guiListarHistorial = new GUIListarHistorialClinico();
    GUIBuscarHistorialClinico guiBuscarHistorial = new GUIBuscarHistorialClinico();
    GUIModificarHistorialClinico guiModificarHistorial = new GUIModificarHistorialClinico();
    GUIEliminarHistorialClinico guiEliminarHistorial = new GUIEliminarHistorialClinico();
    GUIListarHistorialParametro guiListarHParametro  = new GUIListarHistorialParametro();
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    
    public ControladorHistorialClinico(GUIPrincipal principal)
    
    {
        historialClinicoSW = ServicioLocalHistorialC.getServicio();
        pacienteSW = ServicioLocalPaciente.getServicio();
        this.guiP = principal;
        this.guiP.jMenuBuscarHistorial.addActionListener(this);
        this.guiP.jMenuListarHistorial.addActionListener(this);
        this.guiP.jMenuAgregarHistorial.addActionListener(this);
        this.guiP.jMenuModificarrHistorial.addActionListener(this);
        this.guiP.jMenuEliminarHistorial.addActionListener(this);
        this.guiP.jMenuListarPHistorial.addActionListener(this);
        this.guiAgregarH.butAgregar.addActionListener(this);
        this.guiAgregarH.butListarEnfermedades.addActionListener(this);
        this.guiAgregarH.butListarPacientes.addActionListener(this);
        this.guiListarHistorial.butListar.addActionListener(this);
        this.guiBuscarHistorial.butBuscar.addActionListener(this);
        this.guiModificarHistorial.butBuscar2.addActionListener(this);
        this.guiModificarHistorial.butModificarHistorial.addActionListener(this);
        this.guiEliminarHistorial.butBuscar2.addActionListener(this);
        this.guiEliminarHistorial.butEliminarHistorial.addActionListener(this);     
        this.guiListarHParametro.butListar1.addActionListener(this);
        
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == guiP.jMenuAgregarHistorial) {
            guiAgregarH.setVisible(true);
        }
        if(e.getSource() == guiP.jMenuListarHistorial) {
            guiListarHistorial.setVisible(true);
        }
        if(e.getSource() == guiP.jMenuBuscarHistorial) {
            guiBuscarHistorial.setVisible(true);
        }
        if(e.getSource() == guiP.jMenuModificarrHistorial) {
            guiModificarHistorial.setVisible(true);
        }
        if(e.getSource() == guiP.jMenuEliminarHistorial) {
            guiEliminarHistorial.setVisible(true);
        }
        if(e.getSource()== guiP.jMenuListarPHistorial) {
            guiListarHParametro.setVisible(true);
        }
        
        if(e.getSource() == guiAgregarH.butListarPacientes) {
            guiListarPacientes.setVisible(true);
            limpiarTablaPaciente();
            listarPacientes(guiListarPacientes.jTablePacientesHistorial);
        }
        if(e.getSource() == guiAgregarH.butListarEnfermedades) {
            guiListarE.setVisible(true);
            limpiarTablaPaciente();
            listarEnfermedad(guiListarE.jTableListarEnfermedad);
            
        }
        if(e.getSource() == guiAgregarH.butAgregar) {
            agregarHistorial();
            limpiarFormularioAgregar();
        }
        if(e.getSource() == guiListarHistorial.butListar) {
            limpiarTabla();
            listarHistorial(guiListarHistorial.JTableHistorial);
        }
        if(e.getSource() == guiBuscarHistorial.butBuscar) {
            buscarHistorial();
            guiBuscarHistorial.txtDocumentoParametro.setText("");
            guiBuscarHistorial.txtNumeroHistoriaParametro.setText("");
        }
        if(e.getSource() == guiModificarHistorial.butBuscar2) {
            buscarHistorialModificar();
            
        }
        if(e.getSource() == guiModificarHistorial.butModificarHistorial) {
            modificarHistorial();
        }
        if(e.getSource() == guiEliminarHistorial.butBuscar2) {
            buscarHistorialEliminar();
                
        }
        if(e.getSource() == guiEliminarHistorial.butEliminarHistorial) {
            eliminarHistorial();
            limpiarFormularioEliminar();
        }
        if(e.getSource() == guiListarHParametro.butListar1) {
            limpiarTabla();
            listarHistorialParametro(guiListarHParametro.JTableHistorial);
        }
        
    }
    
    public void agregarHistorial() {
        int numeroHistoria = Integer.parseInt(guiAgregarH.txtNumeroHistoria.getText());
               String nombreDoctor = guiAgregarH.txtNombreMedico.getText();
               String documento = guiAgregarH.txtDocumentoPaciente.getText();
               int codigoEnfermedad = Integer.parseInt(guiAgregarH.txtCodigoEnfermedad.getText());
               h.setNumeroHistoria(numeroHistoria);
               h.setNombreDoctor(nombreDoctor);
               h.setFkPaciente(documento);
               h.setFkEnfermedad(codigoEnfermedad);
               int agregar; 
               try {
                   agregar = historialClinicoSW.agregarHistorial(h);
               if(agregar == 1)
               {
                    JOptionPane.showMessageDialog(guiAgregarH, "Historial agregado con exito");
               }else{
                   JOptionPane.showMessageDialog(guiAgregarH, "Error");
               }
               
               
               
               } catch (Exception e) {
               }
    }
    
    public void listarHistorial(JTable table) {
        modelo = (DefaultTableModel)table.getModel();
                
                
                  // List<Paciente> lista = servicio.listar();
                   List<HistorialClinico> lista = historialClinicoSW.listarHistorial();
                
                Object[]object = new Object[4];
                for(int i = 0; i < lista.size(); i++)
                {
                    object[0] = lista.get(i).getNumeroHistoria();
                    object[1] = lista.get(i).getNombreDoctor();
                    object[2] = lista.get(i).getFkPaciente();
                    object[3] = lista.get(i).getFkEnfermedad();
                     
                    modelo.addRow(object);
                }
                
        guiListarHistorial.JTableHistorial.setModel(modelo);
                
    }
    
    
    public void listarPacientes(JTable table) {
        
        modelo2 = (DefaultTableModel)table.getModel();
                
               
                   List<Paciente> lista = pacienteSW.listar();
                   
                
                Object[]object = new Object[5];
                for(int i = 0; i < lista.size(); i++)
                {
                    object[0] = lista.get(i).getDocumento();
                    object[1] = lista.get(i).getNombre();
                    object[2] = lista.get(i).getCorreo();
                    object[3] = lista.get(i).getTelefono();
                    object[4] = lista.get(i).getGenero();  
                    modelo2.addRow(object);
                }
                
                
                guiListarPacientes.jTablePacientesHistorial.setModel(modelo2);
                
    }
    
    public void listarEnfermedad(JTable table)
        {
            modelo2 = (DefaultTableModel)table.getModel();
            
            
              
          List<Enfermedad> lista = servicioEnfermedadSW.listarEnfermedades();
            
            Object[]object = new Object[3];
            for(int i = 0; i < lista.size(); i++)
            {
                object[0] = lista.get(i).getCodigo();
                object[1] = lista.get(i).getNombre();
                object[2] = lista.get(i).getTipo();
                 
                modelo2.addRow(object);
            }
            
           guiListarE.jTableListarEnfermedad.setModel(modelo2);
            
            
            
        }   
    
    public void buscarHistorial() {
       
       
        
        int numeroH;
        numeroH = tryParse(guiBuscarHistorial.txtNumeroHistoriaParametro.getText(), 0);
        String documento = guiBuscarHistorial.txtDocumentoParametro.getText();

        try{
        h = historialClinicoSW.buscarHistorial(numeroH,documento);
        //guiBuscarHistorial.txtID.setText(Integer.toString(h.getCodigo()));
        guiBuscarHistorial.txtNumeroHistoria.setText(Integer.toString(h.getNumeroHistoria()));
        guiBuscarHistorial.txtNombreMedico.setText(h.getNombreDoctor());
        guiBuscarHistorial.txtDocumentoPaciente.setText(h.getFkPaciente());
        guiBuscarHistorial.txtCodigoEnfermedad.setText(Integer.toString(h.getFkEnfermedad()));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(guiBuscarHistorial, "Error, La historia clinica no existe!");
        }
    }
    
    public int tryParse(String value, int defaultVal) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }

    
    public void  buscarHistorialModificar() {
        int numeroH = Integer.parseInt(guiModificarHistorial.txtNumeroHistoriaParametro.getText());
          
          
        try{
        h = historialClinicoSW.buscarHistorialSolo(numeroH);
        //guiModificarHistorial.txtID.setText(Integer.toString(h.getCodigo()));
        guiModificarHistorial.txtNumeroHistoria.setText(Integer.toString(h.getNumeroHistoria()));
        guiModificarHistorial.txtNombreMedico.setText(h.getNombreDoctor());
        guiModificarHistorial.txtDocumentoPaciente.setText(h.getFkPaciente());
        guiModificarHistorial.txtCodigoEnfermedad.setText(Integer.toString(h.getFkEnfermedad()));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(guiModificarHistorial, "Error, La historia clinica no existe!");
        }

    }
    
    public void modificarHistorial() {
        
        int numeroH = Integer.parseInt( guiModificarHistorial.txtNumeroHistoriaParametro.getText());
                    int numeroHistoria = Integer.parseInt( guiModificarHistorial.txtNumeroHistoria.getText());
                    String nombreD =  guiModificarHistorial.txtNombreMedico.getText();
                    String documento =  guiModificarHistorial.txtDocumentoPaciente.getText();
                    int codigoE = Integer.parseInt( guiModificarHistorial.txtCodigoEnfermedad.getText());
                    h.setNumeroHistoria(numeroHistoria);
                    h.setNombreDoctor(nombreD);
                    h.setFkPaciente(documento);
                    h.setFkEnfermedad(codigoE);
                    int modificar;
                    try {
                        modificar = historialClinicoSW.modificarHistorial(h, numeroHistoria);
                        if(modificar== 1)
                        {
                              JOptionPane.showMessageDialog(guiP, "Historial Medico Modificado con exito");
                        }else{
                              JOptionPane.showMessageDialog(guiP, "Eroor!! Intente Nuevamente");
                        }
                    } catch (Exception e) {
                    }
        
    }
    
    public void buscarHistorialEliminar() {
        int numeroH = Integer.parseInt(guiEliminarHistorial.txtNumeroHistoriaParametro.getText());


        try{
        h = historialClinicoSW.buscarHistorialSolo(numeroH);
        //guiEliminarHistorial.txtID.setText(Integer.toString(h.getCodigo()));
        guiEliminarHistorial.txtNumeroHistoria.setText(Integer.toString(h.getNumeroHistoria()));
        guiEliminarHistorial.txtNombreMedico.setText(h.getNombreDoctor());
        guiEliminarHistorial.txtDocumentoPaciente.setText(h.getFkPaciente());
        guiEliminarHistorial.txtCodigoEnfermedad.setText(Integer.toString(h.getFkEnfermedad()));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(guiEliminarHistorial, "Error, La historia clinica no existe!");
        }
    }
    
    public void eliminarHistorial(){
        int numeroH = Integer.parseInt(guiEliminarHistorial.txtNumeroHistoriaParametro.getText());
                try {
                    
                    historialClinicoSW.eliminarHistorial(numeroH);
                    JOptionPane.showMessageDialog(guiEliminarHistorial, "Historial Clinico Eliminado Con exito");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(guiEliminarHistorial, "Eroor! intente nuevamente");
                }
    }
    
    public void  listarHistorialParametro(JTable table) {
        modelo = (DefaultTableModel)table.getModel();
                
                String nombre = guiListarHParametro.txtNombreDoctor.getText();
                  // List<Paciente> lista = servicio.listar();
                   List<HistorialClinico> lista = historialClinicoSW.listarHistorialPorParametro(nombre);
                
                Object[]object = new Object[4];
                for(int i = 0; i < lista.size(); i++)
                {
                    object[0] = lista.get(i).getNumeroHistoria();
                    object[1] = lista.get(i).getNombreDoctor();
                    object[2] = lista.get(i).getFkPaciente();
                    object[3] = lista.get(i).getFkEnfermedad();
                     
                    modelo.addRow(object);
                }
                
        guiListarHistorial.JTableHistorial.setModel(modelo);
    }
    
    
    void limpiarTablaPaciente()
      {
         //modelo = (DefaultTableModel)guiL.jTableListar.getModel();
          for( int i = modelo2.getRowCount() - 1; i >= 0; i-- ) {
          modelo2.removeRow(i);
      }  
    
      }
    
    void limpiarTabla()
     {
        //modelo = (DefaultTableModel)guiL.jTableListar.getModel();
         for( int i = modelo.getRowCount() - 1; i >= 0; i-- ) {
         modelo.removeRow(i);
     }
     }
    
    public void limpiarFormularioAgregar(){
        
        guiAgregarH.txtNumeroHistoria.setText("");
        guiAgregarH.txtNombreMedico.setText("");
        guiAgregarH.txtDocumentoPaciente.setText("");
        guiAgregarH.txtCodigoEnfermedad.setText("");
    }
    
    
    public void limpiarFormularioModificar(){
        guiModificarHistorial.txtNumeroHistoriaParametro.setText("");
        guiModificarHistorial.txtNumeroHistoria.setText("");
        guiModificarHistorial.txtNombreMedico.setText("");
        guiModificarHistorial.txtDocumentoPaciente.setText("");
        guiModificarHistorial.txtCodigoEnfermedad.setText("");
    }
    
    public void limpiarFormularioEliminar(){
        guiEliminarHistorial.txtNumeroHistoriaParametro.setText("");
        guiEliminarHistorial.txtNumeroHistoria.setText("");
        guiEliminarHistorial.txtNombreMedico.setText("");
        guiEliminarHistorial.txtDocumentoPaciente.setText("");
        guiEliminarHistorial.txtCodigoEnfermedad.setText("");
    }
    
    
    
    
    
    
    
    
    
    
}
