package com.hsbc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.model.beans.User;
import com.hsbc.model.service.UserService;
import com.hsbc.model.util.UserFactory;

/**
 * Servlet implementation class UpdatePassword
 */
@WebServlet("/UpdatePassword")
public class UpdatePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("id");
		int id = Integer.parseInt(userId);
		String password = request.getParameter("pw");
		
		User user = new User();
		UserService service = (UserService)UserFactory.getInstance("service");
		user = service.updatePassword(id, password);
		
		RequestDispatcher rd = request.getRequestDispatcher("updatesuccess.jsp");
		rd.forward(request, response);
	}

}
