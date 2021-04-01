package com.webturing.view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;

import org.apache.catalina.tribes.util.Arrays;

import com.webturing.models.Persona;

/**
 * Servlet implementation class PaginaPrincipale
 */
@WebServlet("/PaginaPrincipale")
public class PaginaPrincipale extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PaginaPrincipale() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		Persona mario = new Persona("Mario", "Rossi", "via Roma 33", "333/3333331", 30);
		Persona giovanni = new Persona("Giovanni", "La Russo", "via Milano 33", "333/3333332", 40);
		Persona alvaro = new Persona("Alvaro", "Bianchi", "via Viterbo 33", "333/3333333", 50);
		 Persona[] listaPersone = new Persona[3];
		 listaPersone[0] = mario;
		 listaPersone[1] = giovanni;
		 listaPersone[2] = alvaro;
		request.setAttribute("testAttr", "Ciao, vengo dalla servlet");
		request.setAttribute("listaPersone", listaPersone);
//		System.out.println("listaPersone:");
//		for(Persona ab:listaPersone) {
//			System.out.println(ab.getNome());
//		}
		getServletContext().getRequestDispatcher("/PaginaPrincipale.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
