package com.springg.springhotel.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlineroom.imp.Customer;

@RestController
@RequestMapping("api")
public class RoomController {
	@GetMapping("/Register")
	public void Register(@RequestParam("name") String userName,@RequestParam("mob") String mobNo,@RequestParam("city") String city,@RequestParam("emailId") String emailId,@RequestParam("password") String password) {
	Customer c = new Customer();
	c.setUserName(userName);
    c.setMobNo(mobNo);
	c.setCity(city);
	c.setEmailId(emailId);
	c.setPassword(password);
	c.insertcustomerdetalis(c);

}
}