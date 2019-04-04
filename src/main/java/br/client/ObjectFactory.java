
package br.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.client package. 
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

    private final static QName _MensagemRequisicao_QNAME = new QName("http://service.exame.socproject.orion.com.br/", "mensagemRequisicao");
    private final static QName _MensagemResposta_QNAME = new QName("http://service.exame.socproject.orion.com.br/", "mensagemResposta");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MensagemRequisicaoNode }
     * 
     */
    public MensagemRequisicaoNode createMensagemRequisicaoNode() {
        return new MensagemRequisicaoNode();
    }

    /**
     * Create an instance of {@link MensagemRespostaNode }
     * 
     */
    public MensagemRespostaNode createMensagemRespostaNode() {
        return new MensagemRespostaNode();
    }

    /**
     * Create an instance of {@link CabecalhoNode }
     * 
     */
    public CabecalhoNode createCabecalhoNode() {
        return new CabecalhoNode();
    }

    /**
     * Create an instance of {@link ExameNode }
     * 
     */
    public ExameNode createExameNode() {
        return new ExameNode();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensagemRequisicaoNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.exame.socproject.orion.com.br/", name = "mensagemRequisicao")
    public JAXBElement<MensagemRequisicaoNode> createMensagemRequisicao(MensagemRequisicaoNode value) {
        return new JAXBElement<MensagemRequisicaoNode>(_MensagemRequisicao_QNAME, MensagemRequisicaoNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensagemRespostaNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.exame.socproject.orion.com.br/", name = "mensagemResposta")
    public JAXBElement<MensagemRespostaNode> createMensagemResposta(MensagemRespostaNode value) {
        return new JAXBElement<MensagemRespostaNode>(_MensagemResposta_QNAME, MensagemRespostaNode.class, null, value);
    }

}
