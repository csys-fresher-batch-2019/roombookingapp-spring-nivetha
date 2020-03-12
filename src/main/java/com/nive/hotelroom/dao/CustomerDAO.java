package com.nive.hotelroom.dao;

import com.nive.hotelroom.domain.CustomerDetails;
import com.nive.hotelroom.exception.DBException;

public interface CustomerDAO {
	public int save(CustomerDetails c) throws DBException;

	public void update(int userid) throws DBException;

	public void changePassword(CustomerDetails c) throws DBException;

	public int getUserId(CustomerDetails c) throws DBException;

}
