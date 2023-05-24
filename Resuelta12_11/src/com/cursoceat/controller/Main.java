package com.cursoceat.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;


import com.cursoceat.model.Socios;

public class Main { 
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Socios> socios=new TreeSet<>();
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream
("C:\\Users\\PROGRAMACION\\Documents\\JAVA\\Resuelta12_11\\src\\archivos\\datos.dat"))){
			//Insertar el contenido del archivo en el conjunto socios,
			// si no es de tipo dará un error de tipo ClassNotFound
			socios=(TreeSet<Socios>)in.readObject();
			
		}catch (IOException e) {
			System.out.println("Error->" + e.getMessage());
		}catch (ClassNotFoundException e) {
			System.out.println("Error II ->" + e.getMessage());
		}
		int opcion=0;
		do {
			System.out.println("Socio del Club");
			System.out.println("1.Alta");
			System.out.println("2.Baja");
			System.out.println("3.Modificación");
			System.out.println("4.Listado por DNI");
			System.out.println("5.Listado por antigüedad");
			System.out.println("6.Salir");
			try {
				opcion=sc.nextInt();

			}catch (Exception e) {
				System.out.println("Opcion inválida");
			}
			switch(opcion){
			case 1->{
				alta(entradaDNI(), socios);
			}
			case 2->{System.out.println("dni socio: ");
			socios.remove(new Socios(entradaDNI()));}
			
			case 3->{System.out.println("dni: ");
			String dni=sc.next().toUpperCase();
			socios.remove(new Socios(dni));
			alta(dni, socios);
			      }
			
			case 4->{
				System.out.println(socios);
			}
			
			case 5->{
				Comparator<Socios> c=new Comparator<>() {
					public int compare(Socios o1, Socios o2) {
						return o1.antiguedad()-o2.antiguedad();
					}
				};
				Set<Socios> e=new TreeSet<>(c);
				e.addAll(socios);
				System.out.println(e);
			}
			}
			
		}while(opcion!=6);
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream
		("C:\\Users\\PROGRAMACION\\Documents\\JAVA\\Resuelta12_11\\src\\archivos\\datos.dat"))){
		out.writeObject(socios);
							
						}catch (IOException e) {
							System.out.println("Error III->" + e.getMessage());
						}
	}
	static boolean alta(String dni, Set<Socios> sociosN) {
		System.out.println("Nombre: ");
		String nombre=new Scanner(System.in).nextLine().toUpperCase();
		System.out.println("Fecha de Alta(dd/mm/yyyy)");
		String fechaAlta=sc.nextLine();
		Socios nuevo=new Socios(nombre, dni, fechaAlta);
		return sociosN.add(nuevo);
		}
	static String entradaDNI() {
		System.out.println("DNI: ");
		return sc.nextLine().toUpperCase();
		
	}
}
