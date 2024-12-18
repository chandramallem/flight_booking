package com.flight_booking.flight_booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight_booking.flight_booking.entity.User;
import com.flight_booking.flight_booking.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;

	public User insert(User user) {

		return ur.save(user);

	}

}
