
package br.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de mensagemRequisicaoNode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="mensagemRequisicaoNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTuss" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="mensagemRequisicao")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mensagemRequisicaoNode", propOrder = {
    "codigoTuss"
})
public class MensagemRequisicaoNode {

    protected Integer codigoTuss;

    /**
     * Obtém o valor da propriedade codigoTuss.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoTuss() {
        return codigoTuss;
    }

    /**
     * Define o valor da propriedade codigoTuss.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoTuss(Integer value) {
        this.codigoTuss = value;
    }

}
