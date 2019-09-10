package com.hcl.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Cookie ckAnand = new Cookie("Anand", "52");
		ckAnand.setMaxAge(1000*60*60*24);
		response.addCookie(ckAnand);
		
		Cookie ckLaksh = new Cookie("Laksh", "53");
		ckLaksh.setMaxAge(1000*60*60*24);
		response.addCookie(ckLaksh);
		
		Cookie ckSai = new Cookie("Sai", "54");
		ckSai.setMaxAge(1000*60*60*24);
		response.addCookie(ckSai);
		
		Cookie ckYash = new Cookie("Yash", "55");
		ckYash.setMaxAge(1000*60*60*24);
		response.addCookie(ckYash);
		
		Cookie ckUttam = new Cookie("Uttam", "56");
		ckUttam.setMaxAge(1000*60*60*24);
		response.addCookie(ckUttam);
		out.println("Cookie Created successfully..<br/><br/>");
		out.println("<a href = 'ShowCookieServlet'>Show Cookie</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
