package com.rocker.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ViewsCount
 */
@WebServlet(urlPatterns = "/viewsCount")
public class ViewsCount extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public ViewsCount() {
        // TODO Auto-generated constructor stub
    }
    HttpSession session = null;
    PrintWriter out = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session = request.getSession();
		Object num =  session.getAttribute("viewCount");
		int val = num==null ? val=0: (Integer) num;
		session.setAttribute("viewCount",++val );
		out = response.getWriter();
		out.println("You made "+val+" request or refreshes");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
