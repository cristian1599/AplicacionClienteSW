package main;

import controlador.ControladorHistorialClinico;
import controlador.ControladorPaciente;

import vista.GUIAgregarHistorialClinico;
import vista.GUIAgregarPaciente;
import vista.GUIPrincipal;

public class main {
    public main() {
        super();
    }

    public static void main(String[] args) {
        main main = new main();
        GUIPrincipal guiP = new GUIPrincipal();
        GUIAgregarPaciente guiAgregarP = new GUIAgregarPaciente();
        ControladorPaciente controladorP = new ControladorPaciente(guiP,guiAgregarP);
        GUIAgregarHistorialClinico guiAgregarH = new GUIAgregarHistorialClinico();
        ControladorHistorialClinico controladorHistorial = new ControladorHistorialClinico(guiP);
       
        guiP.setVisible(true);
        
    }
}
