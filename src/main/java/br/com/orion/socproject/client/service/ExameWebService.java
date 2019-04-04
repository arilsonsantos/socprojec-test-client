package br.com.orion.socproject.client.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import br.client.IExameService;

public final class ExameWebService {

	public static IExameService getServer() throws MalformedURLException {
		URL url = new URL("http://localhost:8080/socproject/services/ExameService?wsdl");
		String namespace = "http://service.exame.socproject.orion.com.br/";
		QName qName = new QName(namespace, "ExameService");

		Service service = Service.create(url, qName);
		IExameService server = service.getPort(IExameService.class);
		return server;
	}
}
