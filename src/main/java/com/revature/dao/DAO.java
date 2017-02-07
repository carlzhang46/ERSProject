package com.revature.dao;
import java.sql.Blob;
import java.util.List;

import com.revature.pojo.Reimbursement;
import com.revature.pojo.ReimbursementType;
import com.revature.pojo.User;
public interface DAO {

	//create user
	public int insertNewUser(String username, String password, String fName, String lName, String email, int ur_id);
	
	//create reimbursement
	public int insertReimbursement(double amount, String description, Blob receipt,
			int author, int type);
	
	//read user object
	public Object getUserByUserAndPass(String username, String password);
	
	//update a user
	public int updateUser(int uid, String username, String password, String fName, String lName, String email, int ur_id);
	
	//get all reimbursement types to populate dropdown menu in submitrequest.jsp
	public List<ReimbursementType> retrieveReimbursementTypes();
	
	public List<User> retrieveAllUsers();
	
	public List<Reimbursement> retrieveAllResolvedReimbursements();
	
	public List<Reimbursement> retrieveAllPendingReimbursements();
	
	public int getTypeIdByType(String type);
}
