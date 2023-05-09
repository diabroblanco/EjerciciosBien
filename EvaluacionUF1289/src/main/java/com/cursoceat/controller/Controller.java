package com.cursoceat.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cursoceat.model.Libreria;

import com.cursoceat.services.Validaciones;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet  implements Validaciones{
	private static final long serialVersionUID = 1L;
       List<Libreria> listadoLibros=new ArrayList<Libreria>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int idTemp=Integer.parseInt(request.getParameter("idTemp"));
		String opcion=request.getParameter("opcion");
		
		Libreria productoTemporal;
		Iterator<Libreria> iterator=listadoLibros.iterator();
		while(iterator.hasNext()) {
			productoTemporal=(Libreria) iterator.next();
			if(productoTemporal.getIdTemp()== idTemp && opcion.equals("borrar")) {
				listadoLibros.remove(productoTemporal);
				request.getRequestDispatcher("index.jsp").forward(request, response);
				}
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String titulo=request.getParameter("titulo");
		String autor=request.getParameter("autor");
		String genero=request.getParameter("genero");
		String cantidad=request.getParameter("cantidad");
		long isbn = 0;
		int inicio=0;
		String mensaje=null;
		
		if(!validarEntero(cantidad)) {
			mensaje="La cantidad introducida es erronea";
			request.setAttribute("mensaje", mensaje);
			
			request.getRequestDispatcher("index.jsp").forward(request, response);
	}else {
		Libreria miLibreria=new Libreria(titulo.toUpperCase(),Mayus(autor),Mayus(genero),cantidad,inicioISBN(inicio),ponerISBN (isbn));
		listadoLibros.add(miLibreria);
		mensaje="Se ha creado correctamente";
		request.setAttribute("mensaje", mensaje);
		request.getSession().setAttribute("listado", listadoLibros);
		response.sendRedirect("index.jsp");
	}
	}
}
