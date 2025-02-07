package com.hcl.ems;

import java.util.Date;

public class LeaveHistory {
	private int lea_id;
	private String lea_start_date;
	private String lea_end_date;
	private int lea_no_of_days;
	private String lea_reason;
	private String lea_type;
	private Date lea_applied_on;
	private String lea_mgr_comments;
	private int emp_id;
	private String status;
	public int getLea_id() {
		return lea_id;
	}
	public void setLea_id(int lea_id) {
		this.lea_id = lea_id;
	}
	public String getLea_start_date() {
		return lea_start_date;
	}
	public void setLea_start_date(String lea_start_date) {
		this.lea_start_date = lea_start_date;
	}
	public String getLea_end_date() {
		return lea_end_date;
	}
	public void setLea_end_date(String lea_end_date) {
		this.lea_end_date = lea_end_date;
	}
	public int getLea_no_of_days() {
		return lea_no_of_days;
	}
	public void setLea_no_of_days(int lea_no_of_days) {
		this.lea_no_of_days = lea_no_of_days;
	}
	public String getLea_reason() {
		return lea_reason;
	}
	public void setLea_reason(String lea_reason) {
		this.lea_reason = lea_reason;
	}
	public String getLea_type() {
		return lea_type;
	}
	public void setLea_type(String lea_type) {
		this.lea_type = lea_type;
	}
	public Date getLea_applied_on() {
		return lea_applied_on;
	}
	public void setLea_applied_on(Date lea_applied_on) {
		this.lea_applied_on = lea_applied_on;
	}
	public String getLea_mgr_comments() {
		return lea_mgr_comments;
	}
	public void setLea_mgr_comments(String lea_mgr_comments) {
		this.lea_mgr_comments = lea_mgr_comments;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
