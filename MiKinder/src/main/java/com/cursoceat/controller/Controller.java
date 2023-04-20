package com.cursoceat.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cursoceat.model.Autorizados;
import com.cursoceat.model.Ninio;
import com.cursoceat.model.Tutores;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//---------------Datos ni�o-------------------------
		String nombren=request.getParameter("nombren");
		String apellidosn=request.getParameter("apellidosn");
		String fNacimiento=request.getParameter("fNacimiento");
		String direccion=request.getParameter("direccion");
		String poblacion=request.getParameter("poblacion");
		String cp=request.getParameter("cp");
		String observacion=request.getParameter("observacion");
		//---------------Datos tutor------------------------
		String nombre=request.getParameter("nombre");
		String apellidos=request.getParameter("apellidos");
		String relacion=request.getParameter("relacion");
		String dni=request.getParameter("dni");
		String profesion=request.getParameter("profesion");
		String telefono=request.getParameter("telefono");
		String email=request.getParameter("email");
		String parentesco=request.getParameter("relacion");
		//-------------Datos tutor 2----------------------
		String nombre2=request.getParameter("nombre2");
		String apellidos2=request.getParameter("apellidos2");
		String relacion2=request.getParameter("relacion2");
		String dni2=request.getParameter("dni2");
		String profesion2=request.getParameter("profesion2");
		String telefono2=request.getParameter("telefono2");
		String email2=request.getParameter("email2");
		String parentesco2=request.getParameter("relacion2");
		//---------------Datos autorizadosString----------------
		int autorizados=1;
		String nombret=request.getParameter("nombret");
		String telefonot=request.getParameter("telefonot");
		String dnit=request.getParameter("dnit");
		String relaciont=request.getParameter("relaciont");
		
		

		
		
		//leer datos formulario
		//crear objetos =crear clases
		
		
		
		if(nombren.isEmpty() || apellidosn.isEmpty() || fNacimiento.isEmpty() || direccion.isEmpty() || poblacion.isEmpty() || cp.isEmpty() || 
				nombre.isEmpty() || apellidos.isEmpty() || relacion.isEmpty() || dni.isEmpty() || telefono.isEmpty() || parentesco.isEmpty() ||
				nombret.isEmpty() || telefonot.isEmpty() || dnit.isEmpty() || relaciont.isEmpty() || !validarTel(telefonot)) {
			String error="Hay alg�n campo vac�o o err�neo";
			request.setAttribute("error", error);
		
			request.getRequestDispatcher("index.jsp").forward(request, response);//No se muestra si no tengo quien lo muestre
		}else {
		
			request.getRequestDispatcher("confirmacion.jsp").forward(request, response);
			
			
			List<Ninio> miNiList=new ArrayList<Ninio>();
			List<Tutores> tutolist=new ArrayList<Tutores>();
			List<Autorizados> autlist=new ArrayList<Autorizados>();
			
			Ninio miNinio=new Ninio(0, nombren, apellidosn, direccion, poblacion, fNacimiento, cp, observacion);
			int idNinio=miNinio.getIdNinio();
			miNiList.add(miNinio);
			Tutores tutor=new Tutores(idNinio, nombre, apellidos, dni, telefono, profesion, email, parentesco);
			System.out.println(tutor.toString());
			tutolist.add(tutor);
			Autorizados aut=new Autorizados(idNinio, nombret, apellidos, dnit, telefonot, relaciont);
			System.out.println(aut.toString());
			autlist.add(aut);
			HttpSession sesion=request.getSession();
			System.out.println(sesion.getId());
			request.getSession().setAttribute("idNinio", idNinio);
			request.getSession().setAttribute("nombren", nombren);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String nombret2=request.getParameter("nombret2");
		if(!nombret2.isEmpty()) {
		String dnit2=request.getParameter("dnit2");
		String telefonot2=request.getParameter("telefonot2");
		String relaciont2=request.getParameter("relaciont2");
		Autorizados aut2=new Autorizados( autorizados, nombret2, dnit2, telefonot2, relaciont2, relaciont2);
		System.out.println(aut2.toString());
		autlist.add(aut2);
		autorizados++;
		}
		
		String nombret3=request.getParameter("nombret3");
		if(!nombret3.isEmpty()) {
		String telefonot3=request.getParameter("telefonot3");
		String dnit3=request.getParameter("dnit3");
		String relaciont3=request.getParameter("relaciont3");
		Autorizados aut3=new Autorizados( autorizados, nombret3, dnit3, telefonot3, relaciont3, relaciont3);
		System.out.println(aut3.toString());
		autlist.add(aut3);

		autorizados++;
		}
		
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	protected boolean validarTel(String tele) {
		if((!tele.startsWith("9") && !tele.startsWith("6") && !tele.startsWith("7") || tele.length()!=9)) {
			return false;
		}else {
			return true;
		}
	}
}