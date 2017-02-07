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
import com.revature.pojo.Reimbursement;

@WebServlet("/resolvedreimbursements")
public class ResolvedReimbursementServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		DAOErs dao = new DAOErs();
		
		// retrieve the list of resolved reimbursements
		List<Reimbursement> rrList = dao.retrieveAllResolvedReimbursements();
		session.setAttribute("rrList", rrList);

		// got to resolvedreimbursements.jsp page
		req.getRequestDispatcher("resolvedreimbursements.jsp").forward(req, resp);
	}

	
}
