package model;

import serviciosweb.PacienteSW;
import serviciosweb.ServicioPacienteSW;

public class ServicioLocalPaciente {
   
    private static ServicioPacienteSW servicioPacienteSW = new ServicioPacienteSW();
    private static PacienteSW pacienteSW = servicioPacienteSW.getPacienteSWPort();
    
    private ServicioLocalPaciente() {
        
    }
    
    public static void setServicio(PacienteSW servicio) {
        if(pacienteSW == null) {
            pacienteSW = servicio;
        }
    }
    
    public static PacienteSW getServicio() {
        return pacienteSW;
    }
    
}
