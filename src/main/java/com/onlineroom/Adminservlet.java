package com.onlineroom;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineroom.imp.AdminLogin;


@SuppressWarnings("serial")
@WebServlet("/Adminservlet")
public class Adminservlet extends HttpServlet {
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		AdminLogin c=new AdminLogin();
		String s=null;
        String Admin=request.getParameter("adminName");
		String Password=request.getParameter("password");
		try {
		s=c.login(Admin,Password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(s.equals("success"))
		response.sendRedirect("features.jsp");
		else
			response.sendRedirect("admin.jsp");		
	}
}
