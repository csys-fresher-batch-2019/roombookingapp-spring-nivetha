package com.nive.hotelroom.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.nive.hotelroom.dao.CustomerDAO;
import com.nive.hotelroom.domain.CustomerDetails;
import com.nive.hotelroom.factory.DAOFactory;
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDetails c=new CustomerDetails();
		c.setEmailId(request.getParameter("emailId"));
		c.setPassword(request.getParameter("passWord"));
		
		PrintWriter out=response.getWriter();
		try {
			CustomerDAO d=DAOFactory.getCustomerDAO();
			int uid=d.getUserId(c);
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
					e.printStackTrace();
				} 		
	} 
}
