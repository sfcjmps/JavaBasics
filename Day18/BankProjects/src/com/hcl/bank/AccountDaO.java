package com.hcl.bank;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class AccountDaO {
	
	java.sql.PreparedStatement pst;
	Connection con;
	
	public String withdrawAmountDao(int accountNo , int withDrawAmount) {
		con = DaoConnection.getConnection();
		Accounts objAccounts = searchAccountsDao(accountNo);
		String result = " ";
		if (objAccounts != null) {
			String status = objAccounts.getStatus();
			if (status.equals("inactive")) {
				result = "Account Already Closed...";
			} else {
				int amount = objAccounts.getAmount();
				if ((amount - withDrawAmount) > 1000) {
					String cmd = "update Accounts set amount = amount - ? where accountNo = ?";
					try {
						pst = con.prepareStatement(cmd);
						pst.setInt(1, withDrawAmount);
						pst.setInt(2, accountNo);
						pst.executeUpdate();
						cmd = "Insert into Trans (accountNo,transamount,transtype) values(?,?,?)";
						pst = con.prepareStatement(cmd);
						pst.setInt(1, accountNo);
						pst.setInt(2, withDrawAmount);
						pst.setString(3, "D");
						pst.executeUpdate();
						result = "Amount Debited Successfully...";
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						result = e.getMessage();
					}
				} else {
					result = "Insufficient Funds...";
				}
			}
			
		} else {
			result = "Account Not Found...";
		}
		return result;
	}
	
	public String depositAccountDao(int accountNo , int deptAmount) {
		con = DaoConnection.getConnection();
		String result = " ";
		Accounts objAccounts = searchAccountsDao(accountNo);
		if (objAccounts == null) {
			result = "Account Not Found...";
		} else {
			String status = objAccounts.getStatus();
			if (status.equals("inactive")) {
				result = "Account Already Closed...";
			} else {
				String cmd = "update Accounts set amount = amount + ? where accountno = ?";
				try {
					pst = con.prepareStatement(cmd);
					pst.setInt(1, deptAmount);
					pst.setInt(2, accountNo);
					pst.executeUpdate();
					cmd = "Insert into trans (accountno,transamount,transtype) values (?,?,?)";
					pst = con.prepareStatement(cmd);
					pst.setInt(1, accountNo);
					pst.setInt(2, deptAmount);
					pst.setString(3,"C");
					pst.executeUpdate();
					result = "Amount Credited Successfully....";
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					result = e.getMessage();
				}
			}
		}
		return result;		
	}
	
	public String closeAccountDao(int accountNo) {
		con = DaoConnection.getConnection();
		String result = " ";
		Accounts objAccounts = searchAccountsDao(accountNo);
		if (objAccounts == null) {
			result = "Account Not Found...";
		} else {
			String cmd = "update Accounts set status = 'inactive' where accountno = ?";
			try {
				pst = con.prepareStatement(cmd);
				pst.setInt(1, accountNo);
				pst.executeUpdate();
				result = "Account Closed..";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result = e.getMessage();
			}
		}
		
		return result;
	}
	
	public String updateAccountDao(int accountNo , String city , String state) {
		con = DaoConnection.getConnection();
		Accounts objAccounts = searchAccountsDao(accountNo);
		String cmd = "update Accounts set city = ?, state = ? where accountno=?";
		String result = " ";
		if (objAccounts == null) {
			result = "Account No Not Found...";
		} else {
			String status = objAccounts.getStatus();
			if (status.equals("inactive")) {
				result = "Account Closed Already...";
			} else {
				try {
					pst = con.prepareStatement(cmd);
					pst.setString(1, city);
					pst.setString(2, state);
					pst.setInt(3, accountNo);
					pst.executeUpdate();
					result = "Account Details Updated Successfully..";
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					result = e.getMessage();
				}
			}
		}
		return result;		
	}
	public Accounts searchAccountsDao(int accountNo) {
		con = DaoConnection.getConnection();
		String cmd = "select * from accounts where accountno = ? ";
		Accounts objAccounts = null;
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				objAccounts = new Accounts();
				objAccounts.setFirstName(rs.getString("firstname"));
				objAccounts.setLastName(rs.getString("lastname"));
				objAccounts.setCity(rs.getString("city"));
				objAccounts.setState(rs.getString("state"));
				objAccounts.setAmount(rs.getInt("amount"));
				objAccounts.setCheqFacil(rs.getString("cheqfacil"));
				objAccounts.setAccountType(rs.getString("accounttype"));
				objAccounts.setStatus(rs.getString("status"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objAccounts;
		
	}
	
	public String createAccountsDao(Accounts objAccounts) {
		con = DaoConnection.getConnection();
		String cmd = "insert into accounts(accountno,firstname,lastname,"
					+ "city,state,amount,cheqfacil,accounttype)"  
                    + "values(?,?,?,?,?,?,?,?)";
		String result = " ";
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, objAccounts.getAccountNo());
			pst.setString(2, objAccounts.getFirstName());
			pst.setString(3, objAccounts.getLastName());
			pst.setString(4, objAccounts.getCity());
			pst.setString(5, objAccounts.getState());
			pst.setInt(6, objAccounts.getAmount());
			pst.setString(7, objAccounts.getCheqFacil());
			pst.setString(8, objAccounts.getAccountType());
			pst.executeUpdate();
			result = "Account Created successfully";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
		}
		return result;
	}

	public int generateAccountNoDao() {
		int accno = 0;
		con = DaoConnection.getConnection();
		String cmd = "select case when max(accountno) is null then 1 "
				+ "else max(accountno) + 1 end 'accno' from accounts";
		
		try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			accno = rs.getInt("accno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accno;
	}

}
