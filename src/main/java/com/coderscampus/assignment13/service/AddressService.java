package com.coderscampus.assignment13.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment13.domain.Address;
import com.coderscampus.assignment13.domain.User;
import com.coderscampus.assignment13.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepo;

	public Address findUserAddress(Long userId) {
		return addressRepo.getOne(userId);
	}
	
	public Address saveAddressToUser (Address address, User user) {
		address.setUser(user);
		address.setUserId(user.getUserId());
		user.setAddress(address);
		return addressRepo.save(address);
	}
}
