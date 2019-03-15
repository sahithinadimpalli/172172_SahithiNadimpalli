package com.cg.SimpleServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class XmlServlet
 */
@WebServlet("/XmlServlet")
public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XmlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String fullname=request.getParameter("fullname");
		String profession=request.getParameter("prof");
		HttpSession session=request.getSession();
		ServletContext context=request.getServletContext();
		if(username!="" && username!=null)
		{
		session.setAttribute("savedusername", username);
		context.setAttribute("savedusername", username);
		}
		out.println("req:your name is "+username+"your fullname is "+fullname+"your profession is: "+profession);
		out.println("sess:your username is "+(String) session.getAttribute("savedusername"));
		out.println("context:your username is "+(String) context.getAttribute("savedusername"));
		//System.out.println("from get");
		/*response.getWriter().append("Served at:"+username).append(request.getContextPath());*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String fullname=request.getParameter("fullname");
		String profession=request.getParameter("prof");
		out.println("your name is "+username+"your fullname is"+fullname+"your profession is:"+profession);
		System.out.println("from post");
		doGet(request, response);
	}

}
