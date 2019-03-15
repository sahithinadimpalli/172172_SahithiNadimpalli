package com.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StarServlet
 */
@WebServlet("/StarServlet")
public class StarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name=request.getParameter("name");
		   String star=request.getParameter("star");
		   boolean status=false;
		   StarDao s=new StarDao();
		   try {
			status= s.register(name,star);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   if(status==true)
			 {
				 response.sendRedirect("Movie1.html");
			 }
		   }

}
