package com.nive.hotelroom.service;

import com.nive.hotelroom.dao.AdminDAO;
import com.nive.hotelroom.domain.AdminLogin;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.exception.ServiceConstant;
import com.nive.hotelroom.exception.ServiceException;
import com.nive.hotelroom.factory.DAOFactory;

public class AdminLoginService {
	AdminDAO dao=DAOFactory.getAdminDAO();
	public String login(AdminLogin al)throws ServiceException, DBException {
		try {
			return dao.login(al);
		}catch (DBException e)
		{
			throw new ServiceException(ServiceConstant.INVALID_FIND);
		}
	}

}
