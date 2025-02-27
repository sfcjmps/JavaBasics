package com.hcl.department;

import java.sql.JDBCType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class showDepartmentController {
	@RequestMapping("/DepartmentInsert")
	public ModelAndView insertDepartment(HttpServletRequest req , HttpServletResponse res) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		DataSource datasource = (DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate j = new JdbcTemplate(datasource);
		String cmd = "insert into department values(?,?,?,?)";
		j.update(cmd, new Object[] {
				req.getParameter("deptno"),
				req.getParameter("dname"),
				req.getParameter("loc"),
				req.getParameter("head")});
		return new ModelAndView("insertDepartment" , "result" , "record Inserted");
	}
	
	@RequestMapping("/SearchDepartment")
	public ModelAndView deptSearch(HttpServletRequest req , HttpServletResponse res) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		DataSource datasource = (DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(datasource);
		int deptno = Integer.parseInt(req.getParameter("deptno"));
		List dept = null;
		String cmd = "select * from department where deptno = ?";
		dept = jt.query(cmd, new Object[] {deptno}, new RowMapper() {

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				String res = rs.getInt("deptno") + "-----" +
							 rs.getString("dname") + "-----" +
							 rs.getString("loc") + "-----" +
							 rs.getString("head");
				return res;
			}
		}); 
		return new ModelAndView("SearchDepartment" , "dept" , dept);
	}
	
	
	@RequestMapping("/DepartmentShow")
	public ModelAndView departmentShow() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		DataSource datasource = (DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(datasource);
		String cmd = "select * from department";
		List dept = null;
		dept = jt.query(cmd, new RowMapper() {

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				String res = rs.getInt("deptno") + "-----" +
							 rs.getString("dname") + "-----" +
							 rs.getString("loc") + "-----" +
							 rs.getString("head");
				return res;
			}
		});
		return new ModelAndView("ShowDepartment" , "list" , dept);
		
	}
}
