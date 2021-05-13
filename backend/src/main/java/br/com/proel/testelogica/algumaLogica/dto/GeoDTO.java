package br.com.proel.testelogica.algumaLogica.dto;

import java.io.Serializable;

public class GeoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Double lat;
	private Double lng;

	public GeoDTO() {
	}

	public GeoDTO(GeoDTO geo) {
		this.lat = geo.getLat();
		this.lng = geo.getLng();
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

}
