package com.revature.servlet;

import java.io.IOException;
import java.sql.Blob;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.dao.DAOErs;
import com.revature.pojo.User;

@WebServlet("/submitreimbursement")
public class ReimbursementSubmissionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("LoginServlet - POST");
		HttpSession session = req.getSession();
		DAOErs dao = new DAOErs();
		int amount = Integer.parseInt(req.getParameter("r_amount"));
		String description = req.getParameter("r_description");
		//blob
		User user = (User) session.getAttribute("user");
		int uid = user.getU_id();
		Blob blob = null;
		String r_type = req.getParameter("r_type");
		int r_typeId = dao.getTypeIdByType(r_type);
		int success = dao.insertReimbursement(amount, description, blob, uid, r_typeId);
	}
	
	
	
}
