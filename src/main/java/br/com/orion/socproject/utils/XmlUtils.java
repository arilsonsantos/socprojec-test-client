package br.com.orion.socproject.utils;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

public final class XmlUtils {

	public static String objectToXml(Object obj, Class<?> clazz) throws JAXBException, PropertyException {
		JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		StringWriter sw = new StringWriter();
		jaxbMarshaller.marshal(obj, sw);
		String xmlContent = sw.toString();
		
		return xmlContent;
	}
}
