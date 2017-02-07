package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.dao.DAOErs;
import com.revature.pojo.User;
import com.revature.pojo.UserRole;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	/**
	 * handle /login
	 */
	private static final long serialVersionUID = 817105812389880890L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("LoginServlet - GET");
		req.getRequestDispatcher("login.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("LoginServlet - POST");
		HttpSession session = req.getSession();
		DAOErs dao = new DAOErs();
		String username = req.getParameter("userName");
		String password = req.getParameter("userPassword");

		User user = dao.getUserByUserAndPass(username, password);
		

		// check the type of user
		// invalid user if user is null object
		if (user == null) {
			session.setAttribute("authState", null);
			System.out.println("Invalid User, redirecting to login.jsp");
			
			resp.sendRedirect("login.jsp");
		} else {
			UserRole userrole = new UserRole();
			userrole.setUrId(user.getUrId());
			if (user.getUrId() == 1) { // employee
				session.setAttribute("authState", new Object());
				session.setAttribute("user", user);
				session.setAttribute("urid", userrole);
				resp.sendRedirect("employee.jsp");
			} else if (user.getUrId() == 2) { // manager
				session.setAttribute("authState", new Object());
				session.setAttribute("user", user);
				session.setAttribute("urid", userrole);
				resp.sendRedirect("manager.jsp");
			}
		}

	}

}
