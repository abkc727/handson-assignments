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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name = request.getParameter("name");
		String password = request.getParameter("pw");
		String phone = request.getParameter("phone");
		Long phoneNo = Long.parseLong(phone);
		
		User newUser = new User();
		UserService service = (UserService)UserFactory.getInstance("service");
		newUser.setName(name);
		newUser.setPassword(password);
		newUser.setPhone(phoneNo);
		
		User user = service.createUser(newUser);
		//HttpSession session = request.getSession();
		//session.setAttribute("userKey", user);
		
		RequestDispatcher rd = request.getRequestDispatcher("registrationsuccess.jsp");
		rd.forward(request, response);
		
			
	
		
		
		
	}

}
