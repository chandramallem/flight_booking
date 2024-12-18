package com.flight_booking.flight_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_booking.flight_booking.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
