package com.rab3.springbootdemo.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class RoomDto {

	@NotNull
	private Integer number;
	
	@NotNull
	@Size(min = 1)
	private String type;
	
	private String description;
	
	@NotNull
	@Min(0)
	private Double price;

	private Boolean isSmoking;
	private Boolean wifi;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getIsSmoking() {
		return isSmoking;
	}

	public void setIsSmoking(Boolean isSmoking) {
		this.isSmoking = isSmoking;
	}

	public Boolean getWifi() {
		return wifi;
	}

	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}

}
