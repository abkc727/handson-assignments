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
 * Servlet implementation class EditContactServlet
 */
@WebServlet("/EditContactServlet")
public class EditContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String contactId = request.getParameter("id");
		int cid = Integer.parseInt(contactId);
		String name = request.getParameter("name");
		
		String phone = request.getParameter("phone");
		long phoneNo = Long.parseLong(phone);
		
		HttpSession session = request.getSession(false);
		int id = (int) session.getAttribute("id");
		
		
		
		
		ProfileService service = (ProfileService)ProfileFactory.getInstance("service");
		List<Contact> contactsList = service.viewAllContacts(id);
		Contact findContact = null;
		for(Contact c: contactsList) 
			if(c.getContactId()==cid) 
				findContact = c;
		findContact.setContactName(name);
		findContact.setContactNo(phoneNo);
			
	
			Contact contact = service.editContacts(findContact);
			
			session.setAttribute("contactKey", contact);
			
			
			
			
			RequestDispatcher rd = request.getRequestDispatcher("updatesuccess.jsp");
			rd.forward(request, response);
			
		
		
	}

}
