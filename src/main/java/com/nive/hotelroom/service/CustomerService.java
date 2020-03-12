package com.nive.hotelroom.service;

import com.nive.hotelroom.dao.CustomerDAO;
import com.nive.hotelroom.domain.CustomerDetails;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.exception.ServiceConstant;
import com.nive.hotelroom.exception.ServiceException;
import com.nive.hotelroom.factory.DAOFactory;

public class CustomerService {
	CustomerDAO dao = DAOFactory.getCustomerDAO();

	public int save(CustomerDetails c) throws ServiceException, DBException {
		try {
			return dao.save(c);
		} catch (DBException e) {
			throw new ServiceException(ServiceConstant.INVALID_SAVE);
		}
	}

	public void update(int userid) throws ServiceException, DBException {
		try {
			dao.update(userid);
		} catch (DBException e) {
			throw new ServiceException(ServiceConstant.INVALID_UPDATE);
		}
	}

	public void changePassword(CustomerDetails c) throws ServiceException, DBException {
		try {
			dao.changePassword(c);
		} catch (DBException e) {
			throw new ServiceException(ServiceConstant.INVALID_UPDATE);
		}

	}

	public int getUserId(CustomerDetails c) throws ServiceException, DBException {
		try {
			return dao.getUserId(c);
		} catch (DBException e) {
			throw new ServiceException(ServiceConstant.INVALID_FIND);
		}

	}

}
