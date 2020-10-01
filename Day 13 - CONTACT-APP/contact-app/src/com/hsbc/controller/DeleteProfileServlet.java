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
import com.hsbc.model.beans.Profile;
import com.hsbc.model.service.ProfileService;
import com.hsbc.model.utility.ProfileFactory;

/**
 * Servlet implementation class DeleteProfileServlet
 */
@WebServlet("/DeleteProfileServlet")
public class DeleteProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		HttpSession session = request.getSession(false);
		int id = (int) session.getAttribute("id");
		
		
		ProfileService service = (ProfileService)ProfileFactory.getInstance("service");
		Profile profile = service.getProfileById(id);
		//session.setAttribute("DeletedContactKey", contact);
		service.deleteProfile(profile);
		
		
		

		RequestDispatcher rd = request.getRequestDispatcher("profiledeleted.jsp");
		rd.forward(request, response);
	}

}
