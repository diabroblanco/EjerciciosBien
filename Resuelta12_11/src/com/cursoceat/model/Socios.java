package com.cursoceat.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socios implements Comparable<Socios>, Serializable{
	private String nombre;
	private String dni;
	LocalDate fechaAlta;
	public Socios(String nombre, String dni, String fechaAlta) {
		this.nombre = nombre;
		this.dni = dni;
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaAlta = LocalDate.parse(fechaAlta, f);
	}
	public Socios(String dni) {
		this.dni = dni;
	}
	public int antiguedad() {
		return(int) fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
	}
	public boolean equals(Object obj) {
		return dni.equals(((Socios)obj).dni);
	}
	@Override
	public int compareTo(Socios o) {
		// TODO Auto-generated method stub
		return this.dni.compareTo(o.dni);
	}
	@Override
	public String toString() {
		return "Socios [nombre=" + nombre + ", dni=" + dni + ", fechaAlta=" + fechaAlta + ", antiguedad()="
				+ antiguedad() + "] \n";
	}
	
	
}
