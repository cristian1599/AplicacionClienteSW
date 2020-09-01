
package serviciosweb;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-b170214.1743
 * Generated source version: 2.2
 *
 */
@WebService(name = "ServicioEnfermedadSW", targetNamespace = "http://serviciosWeb/")
@XmlSeeAlso({ ObjectFactory.class })
public interface ServicioEnfermedadSW {


    /**
     *
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregarEnfermedad", targetNamespace = "http://serviciosWeb/",
                    className = "serviciosweb.AgregarEnfermedad")
    @ResponseWrapper(localName = "agregarEnfermedadResponse", targetNamespace = "http://serviciosWeb/",
                     className = "serviciosweb.AgregarEnfermedadResponse")
    @Action(input = "http://serviciosWeb/ServicioEnfermedadSW/agregarEnfermedadRequest",
            output = "http://serviciosWeb/ServicioEnfermedadSW/agregarEnfermedadResponse")
    public int agregarEnfermedad(@WebParam(name = "arg0", targetNamespace = "") Enfermedad arg0);

    /**
     *
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarEnfermedades", targetNamespace = "http://serviciosWeb/",
                    className = "serviciosweb.ListarEnfermedades")
    @ResponseWrapper(localName = "listarEnfermedadesResponse", targetNamespace = "http://serviciosWeb/",
                     className = "serviciosweb.ListarEnfermedadesResponse")
    @Action(input = "http://serviciosWeb/ServicioEnfermedadSW/listarEnfermedadesRequest",
            output = "http://serviciosWeb/ServicioEnfermedadSW/listarEnfermedadesResponse")
    public List<Enfermedad> listarEnfermedades();

}
