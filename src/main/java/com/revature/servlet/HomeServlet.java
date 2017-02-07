package com.revature.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.pojo.UserRole;

@WebServlet("/home")
public class HomeServlet extends HttpServlet{
	
	/*
	 * handles /home url
	 * to navigate back to homepage
	 */
	
	//navigation for home button depending on type of user
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		UserRole userrole;
		
		userrole = (UserRole) session.getAttribute("urid");
		System.out.println(userrole);
		if (userrole.getUrId() == 1){
			RequestDispatcher rd = req.getRequestDispatcher("employee.jsp"); //go to employee page if urid = 1
			rd.forward(req, resp);
		}
		else if (userrole.getUrId() == 2){
			RequestDispatcher rd = req.getRequestDispatcher("manager.jsp"); // go to manager page if urid = 2
			rd.forward(req, resp);
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	
	
}
