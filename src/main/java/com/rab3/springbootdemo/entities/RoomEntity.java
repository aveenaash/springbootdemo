package com.rab3.springbootdemo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
public class RoomEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "number")
	private Integer number;
	
	@Column(name= "type")
	@Enumerated(EnumType.STRING)
	private Type type;
	
	@Column(name= "type_desc")
	private String typeDescription;
	
	@Column(name= "is_smoking")
	private Boolean isSmoking;
	
	@Column(name= "wifi_available")
	private Boolean wifiAvailable;
	
	@Column(name= "base_price")
	private Double basePrice;
	
	
	public enum Type {
		SINGLE,DOUBLE
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Integer getNumber() {
		return number;
	}



	public void setNumber(Integer number) {
		this.number = number;
	}



	public Type getType() {
		return type;
	}



	public void setType(Type type) {
		this.type = type;
	}



	public String getTypeDescription() {
		return typeDescription;
	}



	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}



	public Boolean getIsSmoking() {
		return isSmoking;
	}



	public void setIsSmoking(Boolean isSmoking) {
		this.isSmoking = isSmoking;
	}



	public Boolean getWifiAvailable() {
		return wifiAvailable;
	}



	public void setWifiAvailable(Boolean wifiAvailable) {
		this.wifiAvailable = wifiAvailable;
	}



	public Double getBasePrice() {
		return basePrice;
	}



	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}
	
	
}
