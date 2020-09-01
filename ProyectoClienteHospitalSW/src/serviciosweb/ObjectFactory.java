
package serviciosweb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the serviciosweb package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AgregarEnfermedad_QNAME = new QName("http://serviciosWeb/", "agregarEnfermedad");
    private final static QName _AgregarEnfermedadResponse_QNAME =
        new QName("http://serviciosWeb/", "agregarEnfermedadResponse");
    private final static QName _ListarEnfermedades_QNAME = new QName("http://serviciosWeb/", "listarEnfermedades");
    private final static QName _ListarEnfermedadesResponse_QNAME =
        new QName("http://serviciosWeb/", "listarEnfermedadesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviciosweb
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarEnfermedad }
     *
     */
    public AgregarEnfermedad createAgregarEnfermedad() {
        return new AgregarEnfermedad();
    }

    /**
     * Create an instance of {@link AgregarEnfermedadResponse }
     *
     */
    public AgregarEnfermedadResponse createAgregarEnfermedadResponse() {
        return new AgregarEnfermedadResponse();
    }

    /**
     * Create an instance of {@link ListarEnfermedades }
     *
     */
    public ListarEnfermedades createListarEnfermedades() {
        return new ListarEnfermedades();
    }

    /**
     * Create an instance of {@link ListarEnfermedadesResponse }
     *
     */
    public ListarEnfermedadesResponse createListarEnfermedadesResponse() {
        return new ListarEnfermedadesResponse();
    }

    /**
     * Create an instance of {@link Enfermedad }
     *
     */
    public Enfermedad createEnfermedad() {
        return new Enfermedad();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEnfermedad }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarEnfermedad }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviciosWeb/", name = "agregarEnfermedad")
    public JAXBElement<AgregarEnfermedad> createAgregarEnfermedad(AgregarEnfermedad value) {
        return new JAXBElement<AgregarEnfermedad>(_AgregarEnfermedad_QNAME, AgregarEnfermedad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEnfermedadResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarEnfermedadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviciosWeb/", name = "agregarEnfermedadResponse")
    public JAXBElement<AgregarEnfermedadResponse> createAgregarEnfermedadResponse(AgregarEnfermedadResponse value) {
        return new JAXBElement<AgregarEnfermedadResponse>(_AgregarEnfermedadResponse_QNAME,
                                                          AgregarEnfermedadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEnfermedades }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarEnfermedades }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviciosWeb/", name = "listarEnfermedades")
    public JAXBElement<ListarEnfermedades> createListarEnfermedades(ListarEnfermedades value) {
        return new JAXBElement<ListarEnfermedades>(_ListarEnfermedades_QNAME, ListarEnfermedades.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEnfermedadesResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarEnfermedadesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviciosWeb/", name = "listarEnfermedadesResponse")
    public JAXBElement<ListarEnfermedadesResponse> createListarEnfermedadesResponse(ListarEnfermedadesResponse value) {
        return new JAXBElement<ListarEnfermedadesResponse>(_ListarEnfermedadesResponse_QNAME,
                                                           ListarEnfermedadesResponse.class, null, value);
    }

}
