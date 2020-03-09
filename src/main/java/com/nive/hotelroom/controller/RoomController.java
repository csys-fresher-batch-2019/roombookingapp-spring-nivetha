package com.nive.hotelroom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RoomController {
	@GetMapping("/Register")
	public void Register(@RequestParam("name") String userName,@RequestParam("mob") String mobNo,@RequestParam("city") String city,@RequestParam("emailId") String emailId,@RequestParam("password") String password) {
	
}
}