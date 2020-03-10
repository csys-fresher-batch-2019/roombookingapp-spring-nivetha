package com.nive.hotelroom.dao;

import java.util.List;
import com.nive.hotelroom.domain.RoomType;
import com.nive.hotelroom.exception.DBException;

public interface RoomTypeDAO {

	public void save(RoomType c) throws DBException;

	public List<RoomType> getUserbookeddetails(int id) throws DBException;

}
//