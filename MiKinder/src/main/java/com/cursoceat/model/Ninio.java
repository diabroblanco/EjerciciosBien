package com.cursoceat.model;


public class Ninio {
	static int id;
	private int idNinio;
	private String nombreNinio;
	private String apellidoNinio;
	private String direccion;
	private String poblacion;
	private String fechaNacimiento;
    private String codigoPostal;
	private String observaciones;
	
	public Ninio(int idNinio, String nombreNinio, String apellidoNinio, String direccion, String poblacion,
			String fechaNacimiento, String codigoPostal, String observaciones) {
		
		this.idNinio =++id;
		this.nombreNinio = nombreNinio;
		this.apellidoNinio = apellidoNinio;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.fechaNacimiento = fechaNacimiento;
		this.codigoPostal = codigoPostal;
		this.observaciones = observaciones;
	}
	
	
	public Ninio() {
		this.idNinio=++id;
	}
	
	public String getNombreNinio() {
		return nombreNinio;
	}
	public void setNombreNinio(String nombreNinio) {
		this.nombreNinio = nombreNinio;
	}
	public String getApellidoNinio() {
		return apellidoNinio;
	}
	public void setApellidoNinio(String apellidoNinio) {
		this.apellidoNinio = apellidoNinio;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public static int getId() {
		return id;
	}
	public int getIdNinio() {
		return idNinio;
	}


	@Override
	public String toString() {
		return "Ninio [idNinio=" + idNinio + ", nombreNinio=" + nombreNinio + ", apellidoNinio=" + apellidoNinio
				+ ", direccion=" + direccion + ", poblacion=" + poblacion + ", fechaNacimiento=" + fechaNacimiento
				+ ", codigoPostal=" + codigoPostal + ", observaciones=" + observaciones + "]";
	}
	

	
	
	
	
	
}
