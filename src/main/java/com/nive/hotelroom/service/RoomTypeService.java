package com.nive.hotelroom.service;

import java.util.List;

import com.nive.hotelroom.dao.RoomTypeDAO;
import com.nive.hotelroom.domain.RoomType;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.exception.ServiceConstant;
import com.nive.hotelroom.exception.ServiceException;
import com.nive.hotelroom.factory.DAOFactory;

public class RoomTypeService {
	RoomTypeDAO dao = DAOFactory.getRoomTypeDAO();

	public void save(RoomType c) throws ServiceException, DBException {
		try {
			dao.save(c);
		} catch (DBException e) {
			throw new ServiceException(ServiceConstant.INVALID_SAVE);
		}
	}

	public List<RoomType> getUserbookeddetails(int id) throws ServiceException, DBException {
		try {
			return dao.getUserbookeddetails(id);
		} catch (DBException e) {
			throw new ServiceException(ServiceConstant.INVALID_FIND);
		}
	}
}
