package com.revature.dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.pojo.Reimbursement;
import com.revature.pojo.ReimbursementType;
import com.revature.pojo.User;

public class DAOErs implements DAO {
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");

		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	private final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final static String USERNAME = "ers_db";
	private final static String PASSWORD = "p4ssw0rd";

	@Override
	public int insertNewUser(String username, String password, String fName, String lName, String email, int ur_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertReimbursement(double amount, String description, Blob receipt, int author, int type) {
		int numRowsAffected = 0;
		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {
			String sqlInsert = "INSERT INTO ers_reimbursements(r_amount, r_description, r_receipt, "
					+ "u_id_author, rt_type, rt_status) VALUES(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sqlInsert);
			ps.setDouble(1, amount);
			ps.setString(2, description);
			ps.setBlob(3, receipt);
			ps.setInt(4, author);
			ps.setInt(5, type);
			ps.setInt(6, 1);
			numRowsAffected = ps.executeUpdate();
			System.out.println("# of rows changed: " + numRowsAffected);
			return numRowsAffected;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return numRowsAffected;
	}

	@Override
	public User getUserByUserAndPass(String username, String password) {
		User thisUser = null;

		try (Connection connect = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {
			System.out.println(username);
			System.out.println(password);
			String getUser = "SELECT * FROM ers_users WHERE u_username= ? AND u_password = ?";

			PreparedStatement ps = connect.prepareStatement(getUser);
			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				thisUser = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return thisUser;
	}

	@Override
	public int updateUser(int uid, String username, String password, String fName, String lName, String email,
			int ur_id) {
		int rowchange = 0;
		try (Connection connect = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {
			System.out.println(username);
			System.out.println(password);
			String getUser = "UPDATE ers_users SET u_username = ?, u_password = ?, u_firstname = ?, u_lastname = ?, u_email = ? where u_id = ?";

			PreparedStatement ps = connect.prepareStatement(getUser);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, fName);
			ps.setString(4, lName);
			ps.setString(5, email);
			ps.setInt(6, ur_id);

			rowchange = ps.executeUpdate();

			return rowchange;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowchange;
	}

	@Override
	public List<ReimbursementType> retrieveReimbursementTypes() {
		try (Connection connect = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {
			List<ReimbursementType> rtList = new ArrayList<>();
			String sql = "select * from ers_reimbursement_type";

			PreparedStatement ps = connect.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ReimbursementType thisFc = new ReimbursementType(rs.getInt(1), rs.getString(2));
				rtList.add(thisFc);
			}
			return rtList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public List<User> retrieveAllUsers() {
		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {
			List<User> userList = new ArrayList<>();
			String sql = "select * from ers_users";

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				User thisUser = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7));
				userList.add(thisUser);
			}
			return userList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Reimbursement> retrieveAllResolvedReimbursements() {
		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {
			List<Reimbursement> rList = new ArrayList<>();
			String sql = "select * from ers_reimbursements where rt_status in (2, 3)";

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				Reimbursement thisR = new Reimbursement(rs.getInt(1), rs.getDouble(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(10), rs.getInt(10));
				rList.add(thisR);
			}
			return rList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Reimbursement> retrieveAllPendingReimbursements() {
		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {
			List<Reimbursement> rList = new ArrayList<>();
			String sql = "select * from ers_reimbursements where rt_status = 1";

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				Reimbursement thisR = new Reimbursement(rs.getInt(1), rs.getDouble(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(10), rs.getInt(10));
				rList.add(thisR);
			}
			return rList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getTypeIdByType(String type) {
		int typeId = 0;
		try (Connection connect = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {

			String getUser = "SELECT * FROM ers_reimbursement_type WHERE rt_type = ?";

			PreparedStatement ps = connect.prepareStatement(getUser);
			ps.setString(1, type);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				typeId = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return typeId;

	}

}
