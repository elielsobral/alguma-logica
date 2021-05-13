package br.com.proel.testelogica.algumaLogica.dto;

import java.io.Serializable;

public class AddressDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	private GeoDTO geo;

	public AddressDTO() {
	}

	public AddressDTO(AddressDTO address) {
		this.street = address.getStreet();
		this.suite = address.getSuite();
		this.city = address.getCity();
		this.zipcode = address.getZipcode();
		this.geo = new GeoDTO(address.getGeo());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public GeoDTO getGeo() {
		return geo;
	}

	public void setGeo(GeoDTO geo) {
		this.geo = geo;
	}

	
	
	
	
	

}
