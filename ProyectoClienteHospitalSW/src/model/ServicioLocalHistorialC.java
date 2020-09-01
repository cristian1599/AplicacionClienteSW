package model;

import serviciosweb.HistorialClinicoSW;
import serviciosweb.PacienteSW;
import serviciosweb.ServicioHistorialClinicoSW;

public class ServicioLocalHistorialC {
    
    
    private static ServicioHistorialClinicoSW servicioHistorialClinicoSW = new ServicioHistorialClinicoSW();
    private static HistorialClinicoSW historialClinicoSW = servicioHistorialClinicoSW.getHistorialClinicoSWPort();
    
    private ServicioLocalHistorialC() {
        
    }
    public static void setServicio( HistorialClinicoSW servicio) {
        if( historialClinicoSW == null) {
            historialClinicoSW = servicio;
        }
    }
    
    public static HistorialClinicoSW getServicio() {
        return  historialClinicoSW;
    }
}
