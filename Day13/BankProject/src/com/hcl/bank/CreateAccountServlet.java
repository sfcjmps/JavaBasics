package com.hcl.bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateAccountServlet
 */
public class CreateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		RequestDispatcher disp = request.getRequestDispatcher("MenuServlet");
		disp.include(request, response);
		Accounts obj = new Accounts();
		int accno = new AccountDaO().generateAccountNoDao();
		obj.setAccountNo(accno);
		obj.setFirstName(request.getParameter("firstName"));
		obj.setLastName(request.getParameter("lastName"));
		obj.setCity(request.getParameter("city"));
		obj.setState(request.getParameter("state"));
		int amount = Integer.parseInt(request.getParameter("amount"));
		obj.setAmount(amount);
		obj.setCheqFacil(request.getParameter("cheqFacil"));
		obj.setAccountType(request.getParameter("accountType"));
		String result = AccountBaL.createAccountsBal(obj);
		
		
		out.println(result);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
