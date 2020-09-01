
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
@WebServiceClient(name = "ServicioPacienteSW", targetNamespace = "http://serviciosWeb/",
                  wsdlLocation =
                  "http://192.168.1.70:7101/AplicacionServidorHospitalSW-ProyectoServidorHospitalSW-context-root/PacienteSWPort?WSDL#%7Bhttp%3A%2F%2FserviciosWeb%2F%7DServicioPacienteSW")
public class ServicioPacienteSW extends Service {

    private final static URL SERVICIOPACIENTESW_WSDL_LOCATION;
    private final static WebServiceException SERVICIOPACIENTESW_EXCEPTION;
    private final static QName SERVICIOPACIENTESW_QNAME = new QName("http://serviciosWeb/", "ServicioPacienteSW");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://192.168.1.70:7101/AplicacionServidorHospitalSW-ProyectoServidorHospitalSW-context-root/PacienteSWPort?WSDL#%7Bhttp%3A%2F%2FserviciosWeb%2F%7DServicioPacienteSW");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOPACIENTESW_WSDL_LOCATION = url;
        SERVICIOPACIENTESW_EXCEPTION = e;
    }

    public ServicioPacienteSW() {
        super(__getWsdlLocation(), SERVICIOPACIENTESW_QNAME);
    }

    public ServicioPacienteSW(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOPACIENTESW_QNAME, features);
    }

    public ServicioPacienteSW(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOPACIENTESW_QNAME);
    }

    public ServicioPacienteSW(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOPACIENTESW_QNAME, features);
    }

    public ServicioPacienteSW(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioPacienteSW(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns PacienteSW
     */
    @WebEndpoint(name = "PacienteSWPort")
    public PacienteSW getPacienteSWPort() {
        return super.getPort(new QName("http://serviciosWeb/", "PacienteSWPort"), PacienteSW.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PacienteSW
     */
    @WebEndpoint(name = "PacienteSWPort")
    public PacienteSW getPacienteSWPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serviciosWeb/", "PacienteSWPort"), PacienteSW.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOPACIENTESW_EXCEPTION != null) {
            throw SERVICIOPACIENTESW_EXCEPTION;
        }
        return SERVICIOPACIENTESW_WSDL_LOCATION;
    }

}
