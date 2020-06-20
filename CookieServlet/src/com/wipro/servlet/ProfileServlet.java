package com.wipro.servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ProfileServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		req.getRequestDispatcher("link.html").
											include(req, res);
		Cookie ck[] = req.getCookies();
		
		if (ck!= null) {
			String name = ck[0].getValue();
			if(!name.equals("") || name!= null){
				pw.print("<b>Profile Details</b>");
				pw.print("<br>Welcome :"+name);
			}
		}else{
			pw.print("Please login first");
			req.getRequestDispatcher("login.html");
		}
		pw.close();
	}
}
