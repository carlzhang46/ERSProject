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

@WebServlet("/empupdate")
public class EmpUpdateServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//on update button click, call the dao to update the corresponding record
		System.out.println("LoginServlet - POST");
		HttpSession session = req.getSession();
		DAOErs dao = new DAOErs();
		String username = req.getParameter("emp_username");
		String password = req.getParameter("emp_password");
		String firstname = req.getParameter("emp_firstname");
		String lastname = req.getParameter("emp_lastname");
		String email = req.getParameter("emp_email");
		User user = (User) session.getAttribute("user");
		int urid = user.getUrId();
		int uid = user.getU_id();
		
		int rows = dao.updateUser(uid, username, password, firstname, lastname, email, urid);
		if (rows ==1){
			System.out.println("Update successful");
			
		}
		else{
			System.out.println("Update failed");
		}
		User userUpdated = dao.getUserByUserAndPass(username, password);
		session.setAttribute("user", userUpdated);
		resp.sendRedirect("viewAndUpdateEmpInfo.jsp");
	}
}
