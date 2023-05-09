package com.cursoceat.services;
//isbn usa un random
public interface Validaciones {
	public default boolean validarEntero(String texto) {
	    int entero;
	    try {
	      entero=Integer.parseInt(texto);
	      return true;
	    } catch (NumberFormatException excepcion) {
	       return false;
	    }
	}


	public  default String Mayus(String texto) {
		texto=texto.toLowerCase();
		String[]arrayTexto=texto.split(" ");
		String temp="";
		for (int i=0;i<arrayTexto.length;i++) {
			arrayTexto[i]=arrayTexto[i].substring(0,1).toUpperCase()+arrayTexto[i].substring(1).toLowerCase();
			temp+=arrayTexto[i]+" ";
		}
		
		return temp.trim();//enviamos temp ya formateada y quita los espacios del principio y final
	}
	public default int ponerISBN(long isbn) {
		 return (int) (isbn =  ((long) Math.floor(Math.random() * 9000000000L) + 1000000000L));
	
	}
	public default int inicioISBN(int inicio) {
		inicio=(int) ((int) Math.floor(Math.random()*2)+1);
		System.out.println(inicio);
		if(inicio==1) {
			return inicio=978;
		}else if(inicio>1){
			return inicio=979;
		}
		return inicio;
	}
}
