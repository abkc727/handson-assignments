package com.hsbc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.model.beans.User;
import com.hsbc.model.service.UserService;
import com.hsbc.model.util.UserFactory;

/**
 * Servlet implementation class UpdatePhoneServlet
 */
@WebServlet("/UpdatePhoneServlet")
public class UpdatePhoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("id");
		int id = Integer.parseInt(userId);
		String phone = request.getParameter("phone");
		long phoneNo = Long.parseLong(phone);
		User user = new User();
		UserService service = (UserService)UserFactory.getInstance("service");
		user = service.updatePhone(id, phoneNo);
		//HttpSession session = request.getSession();
		//session.setAttribute("userKey", user);
		RequestDispatcher rd = request.getRequestDispatcher("updatesuccess.html");
		rd.forward(request, response);
		

		
	}

}
