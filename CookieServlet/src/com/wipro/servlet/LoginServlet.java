package com.wipro.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		req.getRequestDispatcher("link.html").include(req, res);
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		if(password.equals("MohithDev")){      //password here
			pw.print("You are successfully logged in!!");
			pw.print("<br>Welcome, "+ name);
			
			Cookie ck = new Cookie("name", name);
			res.addCookie(ck);
		}else{
			pw.print("Oops! Login Denied. Try Again...");
		}
	}
}
