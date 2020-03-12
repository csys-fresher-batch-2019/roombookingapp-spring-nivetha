package com.nive.hotelroom.servlet;

import java.util.List;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import com.nive.hotelroom.dao.RoomTypeDAO;
import com.nive.hotelroom.domain.RoomType;
import com.nive.hotelroom.exception.DBException;

@WebServlet("/mybookingservlet")
@SuppressWarnings("serial")
public class mybookingservlet extends HttpServlet {

	@Autowired
	RoomTypeDAO dao;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			HttpSession sess = request.getSession(false);
			int id = (Integer) (sess.getAttribute("userid"));
			List<RoomType> list = dao.getUserbookeddetails(id);
			request.setAttribute("output", list);
			RequestDispatcher dispatcher = request.getRequestDispatcher("mybooking.jsp");
			dispatcher.forward(request, response);
		} catch (DBException e) {
			e.printStackTrace();
		}
	}

}
