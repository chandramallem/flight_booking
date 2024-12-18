package com.flight_booking.flight_booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight_booking.flight_booking.customresponce.CustomResponce;
import com.flight_booking.flight_booking.entity.User;
import com.flight_booking.flight_booking.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService us;

	private CustomResponce cur = new CustomResponce();

	
	@RequestMapping("/save")
	public CustomResponce save(@RequestBody User user) {
	
	 User in = us.insert(user);
	 
	if(in==null)
	{
		cur.setMessage("It's unable to create user account" + " please provide vaidate data");
		cur.setStatus("Failed");
	}else
	{
		cur.setMessage("User account created succefully");
		cur.setStatus("success");
	}return cur;

	
}

}
