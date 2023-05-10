package com.cursoceat.controller;


import com.cursoceat.xml.schema.Biblioteca;
import com.cursoceat.xml.schema.Biblioteca.Libros;
import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class Controller {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		
		escribirXML();
		leerXML();
	
	}

	public static void leerXML() throws JAXBException{
		File file=new File("C:\\Users\\PROGRAMACION\\Downloads\\ListaLibros.xml");
		JAXBContext jaxbContext=JAXBContext.newInstance(Biblioteca.class);
		Unmarshaller jaxbUnmarshaller=jaxbContext.createUnmarshaller();
		Biblioteca biblioteca=(Biblioteca) jaxbUnmarshaller.unmarshal(file);
		for(Libros libros:biblioteca.libros) {
			System.out.println(libros.getId());
			System.out.println(libros.getTitulo());
			System.out.println(libros.getAutor());
			System.out.println(libros.getGenero());
			System.out.println(libros.getPublicacion());
			System.out.println(libros.getPaginas());
		}
		
	}
	public static void escribirXML()throws JAXBException{
		Biblioteca biblioteca=new Biblioteca();
		Libros libros=new Libros();
		libros.setId(1);
		libros.setTitulo("Veneno Salino");
		libros.setAutor("Adrián Blanco Pérez");
		libros.setGenero("Novela,Ficción");
		libros.setPaginas(403);
		libros.setPublicacion("Proximamente");
		biblioteca.getLibros();
		biblioteca.libros.add(libros);
		Libros libros2=new Libros();
		libros2.setId(2);
		libros2.setTitulo("Don Quijote de la Mancha");
		libros2.setAutor("Miguel de Cervantes");
		libros2.setGenero("Novela,Parodia");
		libros2.setPaginas(1305);
		libros2.setPublicacion("16/01/1605");
		biblioteca.getLibros();
		biblioteca.libros.add(libros2);
		JAXBContext jaxbContext=JAXBContext.newInstance(Biblioteca.class);
		Marshaller jaxbMarshaller=jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(biblioteca, System.out);
		jaxbMarshaller.marshal(biblioteca, new File("C:\\Users\\PROGRAMACION\\Downloads\\ListaLibros.xml"));
	}
}
