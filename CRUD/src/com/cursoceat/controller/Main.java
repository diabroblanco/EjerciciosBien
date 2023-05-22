package com.cursoceat.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.cursoceat.model.Alumno;

public class Main {
static Scanner sc=new Scanner(System.in);
static ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		
	}
	static void menu() {
		System.out.println("Qué operación desea realizar");
		System.out.println("1. Alta");
		System.out.println("2. Eliminar");
		System.out.println("3. Modificar");
		System.out.println("4. Consultar");
		int opcion=sc.nextInt();
		switch(opcion) {
		case 1->alta();
		case 2->eliminar();
		case 3->modificar();
		case 4->consultar();
		case 5->System.out.println("Programa cerrado correctamente");
		default->{System.out.println("ERROR");
		menu();}
		}
	}
		
		
	
	static void alta() {
		System.out.println("Introduce nombre: ");
		String nombre=sc.next();
		System.out.println("Introduce edad:");
		String edad=sc.next();
		
		Alumno a=new Alumno(nombre,edad);
		alumnos.add(a);
		menu();
	}
	static void consultar() {
		for(Alumno s: alumnos) {
			System.out.println("Nombre "+ s.getNombre()+ " Edad "+ s.getEdad());
			menu();
		}
	}
	static void eliminar() {
		for(Alumno s: alumnos) {
			System.out.println("Nombre "+ s.getNombre()+ " Edad "+ s.getEdad());}
		System.out.println("Escribe el nombre del que quieres eliminar");
		String nombre=sc.next();
		Iterator<Alumno> it=alumnos.iterator();
		while(it.hasNext()) {
			Alumno a=it.next();
			if(a.getNombre().equals(nombre)) {
				it.remove();
				menu();
			}
		}
		
	}
	static void modificar() {
		for(Alumno s: alumnos) {
			System.out.println("Nombre "+ s.getNombre()+ " Edad "+ s.getEdad());}
		System.out.println("Escribe el nombre del que quieres modificar");
		String nombre=sc.next();
		System.out.println("Introduce el nombre nuevo ");
		String nombreM=sc.next();
		System.out.println("Introduce la edad nueva ");
		String edadM=sc.next();
		
		Iterator<Alumno> it=alumnos.iterator();
		while(it.hasNext()) {
			Alumno a=it.next();
			if(a.getNombre().equals(nombre)) {
				a.setNombre(nombreM);
				a.setEdad(edadM);
				menu();
		
	}
		}
	}
}
