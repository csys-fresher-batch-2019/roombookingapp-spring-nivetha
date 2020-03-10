package com.nive.hotelroom.service;

import java.util.List;

import com.nive.hotelroom.dao.HotelDAO;
import com.nive.hotelroom.domain.HotelName;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.exception.ServiceConstant;
import com.nive.hotelroom.exception.ServiceException;
import com.nive.hotelroom.factory.DAOFactory;

public class HotelService {
	HotelDAO dao = DAOFactory.getHotelDAO();

	public List<HotelName> findAllHotels() throws ServiceException, DBException {
		try {
			return dao.findAllHotels();
		} catch (DBException e) {
			throw new ServiceException(ServiceConstant.INVALID_FIND);
		}
	}

	public List<HotelName> findAllHotels1() throws ServiceException, DBException {
		try {
			return dao.findAllHotels1();
		} catch (DBException e) {
			throw new ServiceException(ServiceConstant.INVALID_FIND);
		}
	}

	public List<HotelName> getHotelDetails1(String Hotelname) throws ServiceException, DBException {

		try {
			return dao.getHotelDetails1(Hotelname);
		} catch (DBException e) {
			throw new ServiceException(ServiceConstant.INVALID_FIND);
		}
	}

	public List<HotelName> getHotelByRating(Float Rating) throws ServiceException, DBException {

		try {
			return dao.getHotelByRating(Rating);
		} catch (DBException e) {
			throw new ServiceException(ServiceConstant.INVALID_FIND);
		}
	}

	public List<HotelName> getHotelByLocation(String Location) throws ServiceException, DBException {
		try {
			return dao.getHotelByLocation(Location);
		} catch (DBException e) {
			throw new ServiceException(ServiceConstant.INVALID_FIND);
		}
	}

	public List<HotelName> getBookingDetails(int hotelid) throws ServiceException, DBException {
		try {
			return dao.getBookingDetails(hotelid);
		} catch (DBException e) {
			throw new ServiceException(ServiceConstant.INVALID_FIND);
		}
	}

	public void save(HotelName al) throws ServiceException, DBException {
		try {
			dao.save(al);
		} catch (DBException e) {
			throw new ServiceException(ServiceConstant.INVALID_SAVE);
		}
	}

	public void update(HotelName al) throws ServiceException, DBException {
		try {
			dao.update(al);
		} catch (DBException e) {
			throw new ServiceException(ServiceConstant.INVALID_UPDATE);
		}
	}
}