package com.cursoceat.controller;

import java.io.File;
import java.io.ObjectInputStream.GetField;

import org.codehaus.plexus.compiler.util.scan.AbstractSourceInclusionScanner;

import com.cursoceat.xml.schema.Club;
import com.cursoceat.xml.schema.Club.Socio;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class Controller {


	
	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		//escribirXML();
		leerXML();
	}
	public static void leerXML() throws JAXBException {
		//crear una coleccion que permita guardar los datos de los socios leidos
		File miArchivo=new File("C:\\Users\\PROGRAMACION\\Downloads\\ListaSocios.xml");
		JAXBContext miContexto=JAXBContext.newInstance(Club.class);
		Unmarshaller miLectura=miContexto.createUnmarshaller();
		Club socios=(Club) miLectura.unmarshal(miArchivo);
		//se lee con un for each
		for(Socio s:socios.getSocio()) {
			System.out.println(s.getIdSocio());
			System.out.println(s.getNombreSocio());
			System.out.println(s.getDireccion());
			System.out.println(s.getFechaAlta());
			
		}
		
	}
	public static void escribirXML() throws JAXBException {
		Club miClub=new Club();
		Socio socio1=new Socio();
		socio1.setIdSocio(1);
		socio1.setNombreSocio("Adrián Blanco");
		socio1.setDireccion("Urbanización La Paz");
		socio1.setFechaAlta("10/05/2023");
		miClub.getSocio().add(socio1);
		Socio socio2=new Socio();
		socio2.setIdSocio(2);
		socio2.setNombreSocio("Mario Blanco");
		socio2.setDireccion("Urbanización La Paz");
		socio2.setFechaAlta("14/06/2023");
		miClub.getSocio().add(socio2);
		Socio socio3=new Socio();
		socio3.setIdSocio(3);
		socio3.setNombreSocio("José Carlos");
		socio3.setDireccion("Urbanización La Paz");
		socio3.setFechaAlta("27/04/2023");
		miClub.getSocio().add(socio3);
		/**Agrupar sml marshaller es crear un xml a partir de unos datos
		*1.Crear contexto
		*2.crear a partir del contexto el xml
		*/
		JAXBContext miContexto=JAXBContext.newInstance(Club.class);
		
		Marshaller miMarshaller=miContexto.createMarshaller();
		//Indicamos el forma como se genera el agrupamiento, con JAXB.FORMATTED_OUTP nos 
		//guarda el archivo con estructura ordenada
		miMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		miMarshaller.marshal(miClub, System.out);
		/**
		 * aqui vamos a crear un archivo a partir de los objetos creados
		 */
		miMarshaller.marshal(miClub, new File("C:\\Users\\PROGRAMACION\\Downloads\\ListaSocios.xml"));
	}
}
