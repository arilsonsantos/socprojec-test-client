package br.com.orion.socproject.client.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;

import br.client.IExameService;

public final class ExameWebService {

	public static IExameService getServer() throws MalformedURLException {
		URL url = new URL("http://localhost:8080/socproject/services/ExameService?wsdl");
		String namespace = "http://service.exame.socproject.orion.com.br/";
		QName qName = new QName(namespace, "ExameService");

		Service service = Service.create(url, qName);
		IExameService server = service.getPort(IExameService.class);

		Map<String, Object> req_ctx = ((BindingProvider) server).getRequestContext();
		req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url.toString());

		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		headers.put("user", Collections.singletonList("arilson"));
		headers.put("password", Collections.singletonList("123"));
		req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

		return server;
	}
}
