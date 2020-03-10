package com.nive.hotelroom.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.nive.hotelroom.dao.CustomerDAO;
import com.nive.hotelroom.dao.HotelDAO;
import com.nive.hotelroom.domain.CustomerDetails;
import com.nive.hotelroom.domain.HotelName;
import com.nive.hotelroom.dto.MessageDTO;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.factory.DAOFactory;
@RestController
@RequestMapping("api")
public class RoomController {
	@GetMapping("/Register")
	public MessageDTO Register(@RequestParam("name") String userName,@RequestParam("mob") String mobNo,@RequestParam("city") String city,@RequestParam("emailId") String emailId,@RequestParam("password") String password) throws DBException {
	MessageDTO msg=new MessageDTO();
	CustomerDetails c=new CustomerDetails();
	c.setUserName(userName);
	c.setMobNo(mobNo);
	c.setCity(city);
	c.setEmailId(emailId);
	c.setPassword(password);
	CustomerDAO p=DAOFactory.getCustomerDAO();
	int a=p.save(c);
			if(a==1)
			{
				msg.setInfoMessage("Successfully Registered");
			}
			else
			{
				msg.setErrorMessage("Failed");
			}
			return msg;
			}
	@GetMapping("/search")
	public List<HotelName> getHotelByLocation(@RequestParam("location") String Location) throws DBException{
		HotelDAO us=DAOFactory.getHotelDAO();
	List<HotelName> list = new ArrayList<HotelName>();
	 list=us.getHotelByLocation(Location);
	 return list;
	}
	/*@GetMapping("/search")
	public MessageDTO Login(@RequestParam("emailId") String EmailId,@RequestParam("passWord") String Password)throws DBException{
	MessageDTO msg=new MessageDTO();
	CustomerDetails c=new CustomerDetails();
	c.setEmailId(EmailId);
	c.setPassword(Password);
	CustomerDAO p=DAOFactory.getCustomerDAO();
	int b=p.save(c);
			if(b==1)
			{
				msg.setInfoMessage("Successfully Logined");
			}
			else
			{
				msg.setErrorMessage("Failed");
			}
			return msg;
			}*/
	}