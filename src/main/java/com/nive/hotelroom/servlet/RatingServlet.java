package com.nive.hotelroom.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.nive.hotelroom.dao.HotelDAO;
import com.nive.hotelroom.domain.HotelName;
import com.nive.hotelroom.exception.DBException;

@WebServlet("/RatingServlet")
@SuppressWarnings("serial")
public class RatingServlet extends HttpServlet {
	@Autowired
	HotelDAO dao;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			List<HotelName> list = dao.getHotelByRating(Float.parseFloat(request.getParameter("rating")));
			request.setAttribute("output", list);
			RequestDispatcher dispatcher = request.getRequestDispatcher("searchrating.jsp");
			dispatcher.forward(request, response);

		} catch (DBException e) {
			e.printStackTrace();
		}

	}
}
