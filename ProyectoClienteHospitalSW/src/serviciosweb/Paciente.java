
package serviciosweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paciente complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="paciente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paciente", propOrder = { "correo", "documento", "genero", "id", "nombre", "telefono" })
public class Paciente {

    protected String correo;
    protected String documento;
    protected String genero;
    protected int id;
    protected String nombre;
    protected String telefono;

    /**
     * Gets the value of the correo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Sets the value of the correo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Gets the value of the documento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Sets the value of the documento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumento(String value) {
        this.documento = value;
    }

    /**
     * Gets the value of the genero property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Sets the value of the genero property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Gets the value of the id property.
     *
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the nombre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the telefono property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

}
