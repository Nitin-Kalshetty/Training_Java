package com.rocker.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AutoRefreshServlet
 */
@WebServlet("/autoRefreshServlet")
public class AutoRefreshServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Timer timer;
	
    public AutoRefreshServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    PrintWriter out = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out = response.getWriter();
		response.setContentType("text/html");
		  out.println("<!DOCTYPE html><html><head></head><body>");
          out.println("<h1>This page refresh every 5 seconds</h1>");
          response.setHeader("Refresh","5;url=autoRefreshServlet");
          out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
