package com.nive.hotelroom.domain;

import java.sql.Date;
import java.time.LocalDate;

public class RoomType {
	private int user;
	private int hotel;
	private int members;
	private String roomType;
	private String bedType;
	private LocalDate checkIn;
	private LocalDate checkOut;
	private String payment;
	private String activeStatus;

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	public int getHotel() {
		return hotel;
	}

	public void setHotel(int hotel) {
		this.hotel = hotel;
	}

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getBedType() {
		return bedType;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	@Override
	public String toString() {
		return "RoomType [user=" + user + ", hotel=" + hotel + ", members=" + members + ", roomType=" + roomType
				+ ", bedType=" + bedType + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", payment=" + payment
				+ ", activeStatus=" + activeStatus + "]";
	}


}
