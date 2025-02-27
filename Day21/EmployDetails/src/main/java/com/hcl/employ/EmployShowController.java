package com.hcl.employ;

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
public class EmployShowController {
	@RequestMapping("/EmployInsert")
	public ModelAndView insertEmploy(HttpServletRequest req , HttpServletResponse res) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		DataSource datasource = (DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate j = new JdbcTemplate(datasource);
		String cmd = "insert into employ values(?,?,?,?,?)";
		j.update(cmd, new Object[] {
				req.getParameter("empno"),
				req.getParameter("name"),
				req.getParameter("dept"),
				req.getParameter("desig"),
				req.getParameter("basic")});
		return new ModelAndView("InsertEmploy" , "result" , "Recors Inserted");
	}
	
	
	@RequestMapping("/SearchEmploy")
	public ModelAndView searchEmploy(HttpServletRequest req , HttpServletResponse res) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		DataSource datasource = (DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(datasource);
		List emp = null;
		int empno = Integer.parseInt(req.getParameter("empno"));
		String cmd = "select * from employ where empno = ?";
		emp = jt.query(cmd, new Object[]{empno}, new RowMapper() {

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				String res = rs.getInt("empno") + "-----" +
							 rs.getString("name") + "-----" +
							 rs.getString("dept") + "-----" +
							 rs.getString("desig") + "-----" +
							 rs.getInt("basic");
				return res;
			}
		});
		return new ModelAndView("SearchEmploy" , "emp" , emp);
	}
	
	@RequestMapping("/employshow")
	
	public ModelAndView showEmp() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		DataSource dataSource = (DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		String sql = "select * from employ";
		List emps = null;
		emps = jt.query(sql, new RowMapper() {

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				String empInfo = rs.getInt("empno") + "-----" +
								 rs.getString("name") + "-----" +
								 rs.getString("dept") + "-----" +
								 rs.getString("desig") + "-----" +
								 rs.getInt("basic");
				return empInfo;
			}
		});
		return new ModelAndView("ShowPage" , "emps" , emps);
	}
}
