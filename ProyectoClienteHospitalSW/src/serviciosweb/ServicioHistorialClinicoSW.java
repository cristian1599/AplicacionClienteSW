
package serviciosweb;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-b170214.1743
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "ServicioHistorialClinicoSW", targetNamespace = "http://serviciosWeb/",
                  wsdlLocation =
                  "http://192.168.1.70:7101/AplicacionServidorHospitalSW-ProyectoServidorHospitalSW-context-root/HistorialClinicoSWPort?WSDL#%7Bhttp%3A%2F%2FserviciosWeb%2F%7DServicioHistorialClinicoSW")
public class ServicioHistorialClinicoSW extends Service {

    private final static URL SERVICIOHISTORIALCLINICOSW_WSDL_LOCATION;
    private final static WebServiceException SERVICIOHISTORIALCLINICOSW_EXCEPTION;
    private final static QName SERVICIOHISTORIALCLINICOSW_QNAME =
        new QName("http://serviciosWeb/", "ServicioHistorialClinicoSW");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://192.168.1.70:7101/AplicacionServidorHospitalSW-ProyectoServidorHospitalSW-context-root/HistorialClinicoSWPort?WSDL#%7Bhttp%3A%2F%2FserviciosWeb%2F%7DServicioHistorialClinicoSW");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOHISTORIALCLINICOSW_WSDL_LOCATION = url;
        SERVICIOHISTORIALCLINICOSW_EXCEPTION = e;
    }

    public ServicioHistorialClinicoSW() {
        super(__getWsdlLocation(), SERVICIOHISTORIALCLINICOSW_QNAME);
    }

    public ServicioHistorialClinicoSW(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOHISTORIALCLINICOSW_QNAME, features);
    }

    public ServicioHistorialClinicoSW(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOHISTORIALCLINICOSW_QNAME);
    }

    public ServicioHistorialClinicoSW(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOHISTORIALCLINICOSW_QNAME, features);
    }

    public ServicioHistorialClinicoSW(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioHistorialClinicoSW(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns HistorialClinicoSW
     */
    @WebEndpoint(name = "HistorialClinicoSWPort")
    public HistorialClinicoSW getHistorialClinicoSWPort() {
        return super.getPort(new QName("http://serviciosWeb/", "HistorialClinicoSWPort"), HistorialClinicoSW.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HistorialClinicoSW
     */
    @WebEndpoint(name = "HistorialClinicoSWPort")
    public HistorialClinicoSW getHistorialClinicoSWPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serviciosWeb/", "HistorialClinicoSWPort"), HistorialClinicoSW.class,
                             features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOHISTORIALCLINICOSW_EXCEPTION != null) {
            throw SERVICIOHISTORIALCLINICOSW_EXCEPTION;
        }
        return SERVICIOHISTORIALCLINICOSW_WSDL_LOCATION;
    }

}