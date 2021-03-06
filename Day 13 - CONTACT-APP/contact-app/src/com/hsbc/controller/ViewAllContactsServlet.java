package com.hsbc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.model.beans.Contact;
import com.hsbc.model.service.ProfileService;
import com.hsbc.model.utility.ProfileFactory;

/**
 * Servlet implementation class ViewAllContactsServlet
 */
@WebServlet("/ViewAllContactsServlet")
public class ViewAllContactsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		int id = (int) session.getAttribute("id");
		ProfileService service = (ProfileService) ProfileFactory.getInstance("service");
		List<Contact> contactsList = service.viewAllContacts(id);
		// you can set this list inside request object only
		request.setAttribute("listKey", contactsList);
		RequestDispatcher rd = request.getRequestDispatcher("displayall.jsp");
		rd.forward(request, response);
	}

	

}
