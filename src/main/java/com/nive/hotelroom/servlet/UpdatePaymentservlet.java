package com.nive.hotelroom.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nive.hotelroom.dao.CustomerDAO;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.factory.DAOFactory;

/**
 * Servlet implementation class UpdatePaymentservlet
 */
@SuppressWarnings("serial")
@WebServlet("/UpdatePaymentservlet")
public class UpdatePaymentservlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		int id=Integer.parseInt(request.getParameter("userId"));
		CustomerDAO p=DAOFactory.getCustomerDAO();
		try {
			p.update(id);
		} catch (DBException e) {
			e.printStackTrace();
		}
		response.sendRedirect("features.jsp");
	}

}
