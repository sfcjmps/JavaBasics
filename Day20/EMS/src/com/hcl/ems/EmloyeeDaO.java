package com.hcl.ems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmloyeeDaO {
	
	public Employee showEmployee(int emp_id) {
		Connection con = DaoConnection.getConnection();
		Employee obj = null;
		String cmd = "select * from employee where emp_id = ?";
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, emp_id);
			ResultSet rs = pst.executeQuery();
			rs.next();
			obj = new Employee();
			obj.setEmp_id(rs.getInt("emp_id"));
			obj.setEmp_name(rs.getString("emp_name"));
			obj.setEmp_email(rs.getString("emp_email"));
			obj.setEmp_mob_no(rs.getLong("emp_mob_no"));
			obj.setEmp_dpt_name(rs.getString("emp_dpt_name"));
			obj.setEmp_date_joined(rs.getDate("emp_date_joined"));
			obj.setEmp_mgr_id(rs.getInt("emp_mgr_id"));
			obj.setEmp_leave_balance(rs.getInt("emp_leave_balance"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	
	public List<LeaveHistory> leaveHistoryDao(List<LeaveHistory> obj) {
		Connection con = DaoConnection.getConnection();
		PreparedStatement pst;
		String cmd = "insert into leave_history(lea_start_date, lea_end_date, lea_no_of_days, lea_reason, lea_type, lea_applied_on, emp_id, lea_status) values(?,?,?,?,?,?,?,?)";
		
	}
	

}
