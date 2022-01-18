package com.coderscampus.assignment13.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment13.domain.Address;
import com.coderscampus.assignment13.domain.User;
import com.coderscampus.assignment13.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepo;

	public Optional<Address> findUserAddress(User user) {
		return addressRepo.findById(user.getUserId());
	}
}
