package com.revature.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.dao.DAOErs;
import com.revature.pojo.User;

@WebServlet("/viewemployees")
public class ViewEmployeeServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		DAOErs dao = new DAOErs();
		System.out.println("VES - POST");
		//retrieve the list of users and store in session scope
		List<User> userList = dao.retrieveAllUsers();
		session.setAttribute("userList", userList);
		
		// got to viewemployees.jsp page
		req.getRequestDispatcher("viewemployees.jsp").forward(req, resp); 
		
	}

	
	
}
