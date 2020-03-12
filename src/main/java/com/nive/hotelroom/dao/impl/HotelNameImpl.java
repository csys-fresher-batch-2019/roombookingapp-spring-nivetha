package com.nive.hotelroom.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.nive.hotelroom.controller.IndexController;
import com.nive.hotelroom.dao.HotelDAO;
import com.nive.hotelroom.domain.HotelName;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.exception.ErrorConstant;
import com.nive.hotelroom.util.ConnectionUtil;

@Repository
public class HotelNameImpl implements HotelDAO {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

	public List<HotelName> findAllHotels() throws DBException {
		List<HotelName> list = new ArrayList<HotelName>();

		String sql = "select hotel_name,location,rating,status,hotel_id,RoomType,pic from hotel";
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement pst = con.prepareStatement(sql)) {
			LOGGER.debug(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String hotelname = rs.getString("hotel_name");
				String location1 = rs.getString("location");
				float rating1 = rs.getFloat("rating");
				String Status = rs.getString("status");
				int hotelId = rs.getInt("hotel_id");
				String roomtype = rs.getString("RoomType");
				String pic = rs.getString("pic");

				HotelName n = new HotelName();
				n.setHotelName(hotelname);
				n.setLocation(location1);
				n.setRating(rating1);
				n.setStatus(Status);
				n.setHotelId(hotelId);
				n.setRoomType(roomtype);
				n.setPic(pic);
				list.add(n);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException(ErrorConstant.INVALID_SELECT);

		}

		return list;
	}

	public List<HotelName> findAllHotels1() throws DBException {
		List<HotelName> list = new ArrayList<HotelName>();

		String sql = "select hotel_name,location,rating,status,hotel_id,RoomType from hotel";
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement pst = con.prepareStatement(sql)) {
			LOGGER.debug(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String hotelname = rs.getString("hotel_name");
				String location1 = rs.getString("location");
				float rating1 = rs.getFloat("rating");
				String Status = rs.getString("status");
				int hotelId = rs.getInt("hotel_id");
				String roomtype = rs.getString("RoomType");

				HotelName n = new HotelName();
				n.setHotelName(hotelname);
				n.setLocation(location1);
				n.setRating(rating1);
				n.setStatus(Status);
				n.setHotelId(hotelId);
				n.setRoomType(roomtype);

				list.add(n);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException(ErrorConstant.INVALID_SELECT);

		}

		return list;
	}

	public List<HotelName> getHotelDetails1(String Hotelname) throws DBException {
		List<HotelName> list = new ArrayList<HotelName>();

		String sql = "select hotel_name,location,rating,status,hotel_id,RoomType,pic from hotel where lower(hotel_name)=lower(?)";
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement pst = con.prepareStatement(sql)) {
			LOGGER.debug(sql);
			pst.setString(1, Hotelname);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String hotelname = rs.getString("hotel_name");
				String location1 = rs.getString("location");
				float rating1 = rs.getFloat("rating");
				String Status = rs.getString("status");
				int hotelId = rs.getInt("hotel_id");
				String roomtype = rs.getString("RoomType");
				String pic = rs.getString("pic");

				HotelName n = new HotelName();
				n.setHotelName(hotelname);
				n.setLocation(location1);
				n.setRating(rating1);
				n.setStatus(Status);
				n.setHotelId(hotelId);
				n.setRoomType(roomtype);
				n.setPic(pic);
				list.add(n);

			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException(ErrorConstant.INVALID_SELECT);

		}

		return list;
	}

	public List<HotelName> getHotelByRating(Float Rating) throws DBException {
		List<HotelName> list = new ArrayList<HotelName>();
		String sql = "select hotel_name,location,rating,status,hotel_id,RoomType,pic from hotel where rating=?";
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement pst = con.prepareStatement(sql)) {
			LOGGER.debug(sql);
			pst.setFloat(1, Rating);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String hotelname = rs.getString("hotel_name");
				String location1 = rs.getString("location");
				float rating1 = rs.getFloat("rating");
				String Status = rs.getString("status");
				int hotelId = rs.getInt("hotel_id");
				String roomtype = rs.getString("RoomType");
				String pic = rs.getString("pic");

				HotelName n = new HotelName();
				n.setHotelName(hotelname);
				n.setLocation(location1);
				n.setRating(rating1);
				n.setStatus(Status);
				n.setHotelId(hotelId);
				n.setRoomType(roomtype);
				n.setPic(pic);
				list.add(n);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException(ErrorConstant.INVALID_SELECT);

		}
		return list;

	}

	public List<HotelName> getHotelByLocation(String Location) throws DBException {
		List<HotelName> list = new ArrayList<HotelName>();
		String sql = "select hotel_name,location,rating,status,hotel_id,RoomType,pic from hotel  where lower(location)=lower(?)";
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement pst = con.prepareStatement(sql)) {
			LOGGER.debug(sql);
			pst.setString(1, Location);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String hotelname = rs.getString("hotel_name");
				String location1 = rs.getString("location");
				float rating1 = rs.getFloat("rating");
				String Status = rs.getString("status");
				int hotelId = rs.getInt("hotel_id");
				String roomtype = rs.getString("RoomType");
				String pic = rs.getString("pic");

				HotelName n = new HotelName();
				n.setHotelName(hotelname);
				n.setLocation(location1);
				n.setRating(rating1);
				n.setStatus(Status);
				n.setHotelId(hotelId);
				n.setRoomType(roomtype);
				n.setPic(pic);
				list.add(n);

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException(ErrorConstant.INVALID_SELECT);

		}
		return list;
	}

	public List<HotelName> getBookingDetails(int hotelid) throws DBException {
		List<HotelName> list = new ArrayList<HotelName>();

		String sql = "select c.hotel_name,r.userid,r.members,r.room_type,r.bed_type,r.check_in,r.check_out,r.payment from hotel c  inner join room r on c.hotel_id=r.hotel where hotel_id=?";
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement pst = con.prepareStatement(sql)) {
			LOGGER.debug(sql);
			pst.setInt(1, hotelid);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String hotelname2 = rs.getString("hotel_name");
				int Member = rs.getInt("members");
				String Room = rs.getString("room_type");
				String BedType = rs.getString("bed_type");
				String InDate = rs.getString("check_in");
				String OutDate = rs.getString("check_out");
				String Payment = rs.getString("payment");
				HotelName n = new HotelName();
				n.setHotelName(hotelname2);
				n.setMember(Member);
				n.setRoom(Room);
				n.setBedType(BedType);
				n.setInDate(InDate);
				n.setOutDate(OutDate);
				n.setPayment(Payment);
				list.add(n);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException(ErrorConstant.INVALID_SELECT);
		}
		return list;
	}

	public void save(HotelName c) throws DBException {
		String sql = "insert into hotel(hotel_id,hotel_name,location,rating,status,RoomType,pic)values(?,?,?,?,?,?,?)";
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, c.getHotelId());
			ps.setString(2, c.getHotelName());
			ps.setString(3, c.getLocation());
			ps.setFloat(4, c.getRating());
			ps.setString(5, c.getStatus());
			ps.setString(6, c.getRoomType());
			ps.setString(7, c.getPic());

			int rows = ps.executeUpdate();
			LOGGER.debug("No of rows inserted :" + rows);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException(ErrorConstant.INVALID_ADD);
		}

	}

	public void update(HotelName al) throws DBException {
		String sql = "update hotel set status=? where hotel_id=?";
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement pst = con.prepareStatement(sql)) {
			LOGGER.debug(sql);
			pst.setString(1, al.getStatus());
			pst.setInt(2, al.getHotelId());
			int rows = pst.executeUpdate(sql);
			LOGGER.debug("No of rows updated :" + rows);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException(ErrorConstant.INVALID_UPDATE);

		}

	}
}