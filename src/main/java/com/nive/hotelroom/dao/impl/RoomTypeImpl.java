package com.nive.hotelroom.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.LoggerFactory;
import com.nive.hotelroom.controller.IndexController;
import com.nive.hotelroom.dao.RoomTypeDAO;
import com.nive.hotelroom.domain.RoomType;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.exception.ErrorConstant;
import com.nive.hotelroom.util.ConnectionUtil;

public class RoomTypeImpl implements RoomTypeDAO {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

	public void save(RoomType c) throws DBException {
		String sql = "insert into room(hotel,userid,members,room_type,bed_type,check_in,check_out)values(?,?,?,?,?,?,?)";
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, c.getHotel());
			ps.setInt(2, c.getUser());
			ps.setInt(3, c.getMembers());
			ps.setString(4, c.getRoomType());
			ps.setString(5, c.getBedType());
			ps.setDate(6, (java.sql.Date) c.getCheckIn());
			ps.setDate(7, (java.sql.Date) c.getCheckOut());
			int rows = ps.executeUpdate();
			LOGGER.debug("No of rows inserted :" + rows);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException(ErrorConstant.INVALID_ADD);
		}

	}

	public List<RoomType> getUserbookeddetails(int id) throws DBException {
		List<RoomType> list = new ArrayList<RoomType>();

		String sql = "select * from room where userid=?";
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement ps = con.prepareStatement(sql)) {
			LOGGER.debug(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int user = rs.getInt("userid");
				int hotelid = rs.getInt("hotel");
				int member = rs.getInt("members");
				String roomType = rs.getString("room_type");
				String bedType = rs.getString("bed_type");
				Date checkIn = rs.getDate("check_in");
				Date checkOut = rs.getDate("check_out");
				String payment = rs.getString("payment");
				String activeStatus = rs.getString("active_status");
				RoomType n = new RoomType();
				n.setUser(user);
				n.setHotel(hotelid);
				n.setMembers(member);
				n.setRoomType(roomType);
				n.setBedType(bedType);
				n.setCheckIn(checkIn);
				n.setCheckOut(checkOut);
				n.setPayment(payment);
				n.setActiveStatus(activeStatus);
				list.add(n);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException(ErrorConstant.INVALID_SELECT);

		}
		return list;
	}

}
