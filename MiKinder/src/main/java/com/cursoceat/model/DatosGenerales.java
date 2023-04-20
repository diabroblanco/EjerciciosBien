package com.cursoceat.model;

public class DatosGenerales {

	protected  int idNinio;
	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected String telefono;
	public DatosGenerales(int idNinio, String nombre,String apellidos, String dni, String telefono) {
		this.idNinio = idNinio;
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.apellidos=apellidos;
	}
	public DatosGenerales() {
	}
	public int getIdNinio() {
		return idNinio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombreApellido(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "DatosGenerales [idNinio=" + idNinio + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
				+ ", telefono=" + telefono + "]";
	}
	
}
