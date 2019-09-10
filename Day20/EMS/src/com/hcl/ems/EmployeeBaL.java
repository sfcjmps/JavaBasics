package com.hcl.ems;

import java.util.List;

public class EmployeeBaL {
	public static Employee showEmployeeBal(int emp_id) {
		return new EmloyeeDaO().showEmployee(emp_id);
	}
	
	public static List<LeaveHistory> leaveHistoryBal(List<LeaveHistory> obj) {
		return new EmloyeeDaO().leaveHistoryDao(obj);
	}
}
