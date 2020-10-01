package com.hsbc.controller;

import java.io.IOException;
import javax.servlet.http.HttpSession;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.hsbc.model.beans.Contact;
import com.hsbc.model.beans.Profile;
import com.hsbc.model.service.ProfileService;
import com.hsbc.model.utility.ProfileFactory;

/**
 * Servlet implementation class AddContactsServlet
 */
@WebServlet("/AddContactsServlet")
public class AddContactsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		
		String phone = request.getParameter("phone");
		
		Long phoneNo = Long.parseLong(phone);
		
		
		
		HttpSession session = request.getSession(false);
		int id = (int) session.getAttribute("id");
		
		Contact newContact = new Contact();
		ProfileService service = (ProfileService)ProfileFactory.getInstance("service");
		newContact.setContactName(name);
		
		newContact.setContactNo(phoneNo);
		
		
		Contact contact = service.addContact(id, newContact);
		//HttpSession session = request.getSession();
		//session.setAttribute("userKey", user);
		
		RequestDispatcher rd = request.getRequestDispatcher("loginsuccess.jsp");
		rd.forward(request, response);
		
	}

}
