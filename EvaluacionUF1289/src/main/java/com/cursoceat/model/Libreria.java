package com.cursoceat.model;

public class Libreria {
	private static int id;
	private int idTemp;
	private String titulo;
	private String autor;
	private String cantidad;
	private String genero;
	private int isbn;
	private int inicio;
	public Libreria(String titulo, String autor, String cantidad, String genero, int isbn, int inicio) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.cantidad = cantidad;
		this.genero = genero;
		this.idTemp=++id;
		this.isbn=isbn;
		this.inicio=inicio;
	}
	public Libreria() {
		this.idTemp=++id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdTemp() {
		return idTemp;
	}
	public long getIsbn() {
		return isbn;
	}
	public int getInicio() {
		return inicio;
	}
	
	
	
}
