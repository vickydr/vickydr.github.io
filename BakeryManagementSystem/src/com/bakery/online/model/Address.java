package com.bakery.online.model;

import javax.persistence.*;
@Embeddable
public class Address {
	
	@Column(name = "house_no", nullable = false, length = 100)
	private String houseNo;
	@Column(name = "street_name", nullable = false, length = 100)
	private String streetName;
	@Column(name = "location", nullable = false, length = 100)
	private String location;
	@Column(name = "city", nullable = false, length = 100)
	private String city;
	@Column(name = "pincode", nullable = false)
	private Integer pincode;

	
	public String getHouseNo() {
		return houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public String getLocation() {
		return location;
	}

	public String getCity() {
		return city;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

}
