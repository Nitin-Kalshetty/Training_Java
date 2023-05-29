package com.rockers.controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	List<String> states = null;
	List<String> courses = null;
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
        states = new ArrayList<>();
    	File file = new File("C:\\Users\\nitin\\OneDrive\\Desktop\\Traning\\usertaglibrary\\src\\main\\webapp\\states.txt");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String line;
		StringBuilder content = new StringBuilder();
		 try {
			while ((line = reader.readLine()) != null) {
			        content.append(line);
			        content.append(System.lineSeparator());
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String[] allStates = new String(content).split(" ");
		 for(String s : allStates) {
			if(!s.equals(" ") && !s.equals(""))
			 states.add(s);
		 }
        courses = new ArrayList<>();
        courses.add("JAVA");
        courses.add("C#");
        courses.add("C++");
        courses.add("Python");
        courses.add("JavaScript");
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("allstates", states);
		request.setAttribute("allcourses", courses);
		request.getRequestDispatcher("register.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
