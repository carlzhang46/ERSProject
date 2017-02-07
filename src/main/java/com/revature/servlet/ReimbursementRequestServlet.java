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
import com.revature.pojo.ReimbursementType;

@WebServlet("/submitrequest")
public class ReimbursementRequestServlet extends HttpServlet{

	/*
	 * handles /submitrequest
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		DAOErs dao = new DAOErs();
		List<ReimbursementType> rtList = dao.retrieveReimbursementTypes();
		session.setAttribute("rtList", rtList);
		
		req.getRequestDispatcher("submitrequest.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		DAOErs dao = new DAOErs();
		List<ReimbursementType> rtList = dao.retrieveReimbursementTypes();
		session.setAttribute("rtList", rtList);
		
		req.getRequestDispatcher("submitrequest.jsp").forward(req, resp);
		
	}
	


	
}
