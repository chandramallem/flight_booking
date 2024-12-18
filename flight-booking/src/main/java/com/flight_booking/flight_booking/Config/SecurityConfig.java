package com.flight_booking.flight_booking.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

//	    	http
//	        .authorizeHttpRequests(auth -> auth
//	            .requestMatchers("/api/save").permitAll()  // Allow access to /api/save endpoint
//	            .anyRequest().authenticated()  // Require authentication for all other endpoints
//	        )
//	        .csrf(csrf -> csrf.disable()); // Disable CSRF protection for testing purposes
//	          // Ensure the build method is called for the filter chain

		http.authorizeHttpRequests(auth -> auth.requestMatchers("/user/**").permitAll() // Allow access to /api/save
																						// endpoint
				.anyRequest().authenticated() // Require authentication for all other endpoints
		).csrf(csrf -> csrf.disable());
		return http.build();
	}

}
