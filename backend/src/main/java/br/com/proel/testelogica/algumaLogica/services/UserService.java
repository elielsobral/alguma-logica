package br.com.proel.testelogica.algumaLogica.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.proel.testelogica.algumaLogica.dto.AddressDTO;
import br.com.proel.testelogica.algumaLogica.dto.GeoDTO;
import br.com.proel.testelogica.algumaLogica.dto.UserDTO;
import br.com.proel.testelogica.algumaLogica.entities.Address;
import br.com.proel.testelogica.algumaLogica.entities.Geo;
import br.com.proel.testelogica.algumaLogica.entities.User;
import br.com.proel.testelogica.algumaLogica.repositories.AddressRepository;
import br.com.proel.testelogica.algumaLogica.repositories.GeoRepository;
import br.com.proel.testelogica.algumaLogica.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private GeoRepository geoRepository;
	
	@Transactional
	public UserDTO save(UserDTO dto) {
		User user = userRepository.save(entityUserFromDTO(dto));
		dto.setId(user.getId());
		return dto;
	}
	
	private User entityUserFromDTO(UserDTO dto) {
		User user = new User(
			null,
			dto.getName(),
			dto.getUsername(),
			dto.getEmail(),
			dto.getPhone(),
			dto.getWebsite()
		);
		List<Address> listAddress = new ArrayList<>();
		listAddress.add(entityAddressFromDTO(dto.getAddress()));
		user.setAddresses(listAddress);
		return user;	
	}
	
	
	private Address entityAddressFromDTO(AddressDTO dto) {
		Address address = new Address(
			null,
			dto.getStreet(),
			dto.getSuite(),
			dto.getCity(),
			dto.getZipcode(),
			entityGeoFromDTO(dto.getGeo())
		);
		address = addressRepository.save(address);
		return address;
	}
	
	private Geo entityGeoFromDTO(GeoDTO dto) {
		Geo geo = new Geo(
			null,
			dto.getLat(),
			dto.getLng()
		);
		geo = geoRepository.save(geo);
		return geo;
	}

}
