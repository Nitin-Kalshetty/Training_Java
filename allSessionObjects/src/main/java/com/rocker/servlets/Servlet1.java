package com.rocker.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    PrintWriter out = null;
    HttpSession session = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out = response.getWriter();
		response.setContentType("text/html");
		out.println("I am in servlet1");
		session = request.getSession(true);
		session.setAttribute("checking",1);
//		out.println(session);
		out.println("<a href='servlet2'>click me to open control.do</a>");
		Enumeration<String> headers = request.getHeaderNames();
//		int i =0;
//		while(headers.hasMoreElements()) {
//			out.println(++i+" Header : ");
//			out.println(headers.nextElement());
//		}
		response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
		response.setDateHeader("Expires", 0);
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
