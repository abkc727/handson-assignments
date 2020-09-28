package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String itemName = request.getParameter("itemName");
		List<String> list = null;
		
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("list") == null)
		{
			list = new ArrayList<String>();
			list.add(itemName);
		} 
		else {
			list = (List<String>) session.getAttribute("list");
			list.add(itemName);
		}
		
		
		session.setAttribute("list", list);
		
		pw.print("<html><body>");
		
		pw.print("Item Count ="+list.size());
		pw.print("</body></html>");
		
		RequestDispatcher rd = request.getRequestDispatcher("item.html");
		rd.include(request, response);
	
	}

}
