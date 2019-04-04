
package br.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de mensagemRespostaNode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="mensagemRespostaNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://service.exame.socproject.orion.com.br/}cabecalhoNode" minOccurs="0"/>
 *         &lt;element name="exameNode" type="{http://service.exame.socproject.orion.com.br/}exameNode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="mensagemResposta")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mensagemRespostaNode", propOrder = {
    "header",
    "exameNode"
})
public class MensagemRespostaNode {

    protected CabecalhoNode header;
    protected ExameNode exameNode;

    /**
     * Obtém o valor da propriedade header.
     * 
     * @return
     *     possible object is
     *     {@link CabecalhoNode }
     *     
     */
    public CabecalhoNode getHeader() {
        return header;
    }

    /**
     * Define o valor da propriedade header.
     * 
     * @param value
     *     allowed object is
     *     {@link CabecalhoNode }
     *     
     */
    public void setHeader(CabecalhoNode value) {
        this.header = value;
    }

    /**
     * Obtém o valor da propriedade exameNode.
     * 
     * @return
     *     possible object is
     *     {@link ExameNode }
     *     
     */
    public ExameNode getExameNode() {
        return exameNode;
    }

    /**
     * Define o valor da propriedade exameNode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExameNode }
     *     
     */
    public void setExameNode(ExameNode value) {
        this.exameNode = value;
    }

}
