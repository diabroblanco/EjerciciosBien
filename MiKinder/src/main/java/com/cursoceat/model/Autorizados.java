package com.cursoceat.model;

public class Autorizados extends DatosGenerales{
private String relacion;

public Autorizados(int idNinio, String nombre, String apellidos, String dni, String telefono, String relacion) {
	super(idNinio, nombre, apellidos, dni, telefono);
	this.relacion = relacion;
}

public Autorizados() {
	super();
}

public String getRelacion() {
	return relacion;
}

public void setRelacion(String relacion) {
	this.relacion = relacion;
}

@Override
public String toString() {
	return "Autorizados-> relacion:" + relacion + ", nombre:" +nombre + ", dni:" + dni + ", telefono=" +telefono;
}
 
}
