package com.nive.hotelroom.dao;

import java.util.List;
import com.nive.hotelroom.domain.HotelName;
import com.nive.hotelroom.exception.DBException;

public interface HotelDAO {
	public List<HotelName> findAllHotels() throws DBException;

	public List<HotelName> findAllHotels1() throws DBException;

	public List<HotelName> getHotelDetails1(String Hotelname) throws DBException;

	public List<HotelName> getHotelByRating(Float Rating) throws DBException;

	public List<HotelName> getHotelByLocation(String Location) throws DBException;

	public List<HotelName> getBookingDetails(int hotelid) throws DBException;

	public void save(HotelName al) throws DBException;

	public void update(HotelName al) throws DBException;
}
