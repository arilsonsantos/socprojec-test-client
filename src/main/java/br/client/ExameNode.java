
package br.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de exameNode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="exameNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTuss" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informacaoComplementar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exameNode", propOrder = {
    "codigoTuss",
    "nome",
    "informacaoComplementar"
})
public class ExameNode {

    protected Integer codigoTuss;
    protected String nome;
    protected String informacaoComplementar;

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

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade informacaoComplementar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformacaoComplementar() {
        return informacaoComplementar;
    }

    /**
     * Define o valor da propriedade informacaoComplementar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformacaoComplementar(String value) {
        this.informacaoComplementar = value;
    }

}
