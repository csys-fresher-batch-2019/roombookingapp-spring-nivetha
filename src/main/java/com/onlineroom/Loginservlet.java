package com.onlineroom;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.onlineroom.imp.Customer;
import com.onlineroom.imp.Logger;

@SuppressWarnings("serial")
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static Logger LOGGER = Logger.getInstance();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer c=new Customer();
		c.setEmailId(request.getParameter("emailId"));
		c.setPassword(request.getParameter("passWord"));
		
		PrintWriter out=response.getWriter();
		try {
			int uid=c.getUserId(c.getEmailId(),c.getPassword());
			out.print(c);
			if(uid !=0)
			{
			      HttpSession sess=request.getSession();
			      sess.setAttribute("userid", uid);
			      response.sendRedirect("sample.jsp");
		}
			else {
				response.sendRedirect("login.jsp");

				}
				} catch (Exception e) {
					LOGGER.error(e);
				} 		
	} 
}
