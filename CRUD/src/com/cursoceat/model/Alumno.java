package com.cursoceat.model;

public class Alumno {
private String nombre;
private String edad;
public Alumno(String nombre, String edad) {
	this.nombre = nombre;
	this.edad = edad;
}
public Alumno() {
	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getEdad() {
	return edad;
}
public void setEdad(String edad) {
	this.edad = edad;
}


}
