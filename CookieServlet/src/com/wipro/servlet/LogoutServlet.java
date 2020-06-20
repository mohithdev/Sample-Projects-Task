package com.wipro.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		req.getRequestDispatcher("link.html").include(req, res);
		
		Cookie ck = new Cookie("name", "");  //Disabling the cookie
		ck.setMaxAge(0);
		res.addCookie(ck);
		
		pw.print("You are successfully logged out");
	}
}
