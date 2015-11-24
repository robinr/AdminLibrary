package com.videolibrary.adminmgr.model;

import java.util.Date;

public class Device {
	Integer id;
	Date	StartDate;
	String	DeviceName;
	String  MacAddress;
	Integer Userid;
	Boolean activation;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public String getDeviceName() {
		return DeviceName;
	}
	public void setDeviceName(String deviceName) {
		DeviceName = deviceName;
	}
	public String getMacAddress() {
		return MacAddress;
	}
	public void setMacAddress(String macAddress) {
		MacAddress = macAddress;
	}
	public Integer getUserid() {
		return Userid;
	}
	public void setUserid(Integer userid) {
		Userid = userid;
	}
	public Boolean getActivation() {
		return activation;
	}
	public void setActivation(Boolean activation) {
		this.activation = activation;
	}
	

}
