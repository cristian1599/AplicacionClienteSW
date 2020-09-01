
package serviciosweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for historialClinico complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="historialClinico"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fk_enfermedad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fk_paciente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreDoctor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroHistoria" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historialClinico",
         propOrder = { "codigo", "fkEnfermedad", "fkPaciente", "nombreDoctor", "numeroHistoria" })
public class HistorialClinico {

    protected int codigo;
    @XmlElement(name = "fk_enfermedad")
    protected int fkEnfermedad;
    @XmlElement(name = "fk_paciente")
    protected String fkPaciente;
    protected String nombreDoctor;
    protected int numeroHistoria;

    /**
     * Gets the value of the codigo property.
     *
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     *
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the fkEnfermedad property.
     *
     */
    public int getFkEnfermedad() {
        return fkEnfermedad;
    }

    /**
     * Sets the value of the fkEnfermedad property.
     *
     */
    public void setFkEnfermedad(int value) {
        this.fkEnfermedad = value;
    }

    /**
     * Gets the value of the fkPaciente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFkPaciente() {
        return fkPaciente;
    }

    /**
     * Sets the value of the fkPaciente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFkPaciente(String value) {
        this.fkPaciente = value;
    }

    /**
     * Gets the value of the nombreDoctor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreDoctor() {
        return nombreDoctor;
    }

    /**
     * Sets the value of the nombreDoctor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreDoctor(String value) {
        this.nombreDoctor = value;
    }

    /**
     * Gets the value of the numeroHistoria property.
     *
     */
    public int getNumeroHistoria() {
        return numeroHistoria;
    }

    /**
     * Sets the value of the numeroHistoria property.
     *
     */
    public void setNumeroHistoria(int value) {
        this.numeroHistoria = value;
    }

}
