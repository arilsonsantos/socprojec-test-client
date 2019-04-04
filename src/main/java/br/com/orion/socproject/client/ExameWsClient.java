package br.com.orion.socproject.client;

import java.net.MalformedURLException;
import java.util.Scanner;

import javax.xml.bind.JAXBException;

import br.client.IExameService;
import br.client.MensagemRequisicaoNode;
import br.client.MensagemRespostaNode;
import br.com.orion.socproject.client.service.ExameWebService;
import br.com.orion.socproject.utils.XmlUtils;



public class ExameWsClient {

	public static void main(String[] args) throws MalformedURLException, JAXBException {
		@SuppressWarnings("resource")
		Scanner codigoTuss = new Scanner(System.in);

	    System.out.println("Digite um código TUSS");

		MensagemRequisicaoNode requisicao = new MensagemRequisicaoNode();
		requisicao.setCodigoTuss(Integer.valueOf(codigoTuss.nextLine()));

		String xmlGerado = XmlUtils.objectToXml(requisicao, MensagemRequisicaoNode.class);
		
		System.out.println("****************************** REQUISICAO ******************************");
		System.out.println("");
		System.out.println(xmlGerado);

		IExameService server = ExameWebService.getServer();
		MensagemRespostaNode retorno = server.mensagemRequisicao(requisicao);

		xmlGerado = XmlUtils.objectToXml(retorno, MensagemRespostaNode.class);

		System.out.println("******************************  RETORNO  ******************************");
		System.out.println("");
		System.out.println(xmlGerado);
	}

}
