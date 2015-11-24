package com.videolibrary.adminmgr.model;

import java.util.List;

public class UserResponse {
	List<User>     allusers;
	List<Billing>  billhistory;
	List<Device>   devices;
	Boolean        usrError;
	Boolean        billError;
	Boolean        devError;
	
	public List<User> getAllusers() {
		return allusers;
	}
	public void setAllusers(List<User> allusers) {
		this.allusers = allusers;
	}
	public List<Billing> getBillinghistory() {
		return billhistory;
	}
	public void setBillinghistory(List<Billing> billhistory) {
		this.billhistory = billhistory;
	}
	public List<Device> getDevices() {
		return devices;
	}
	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	public Boolean getUsrError() {
		return usrError;
	}
	public void setUsrError(Boolean usrError) {
		this.usrError = usrError;
	}
	public Boolean getBillError() {
		return billError;
	}
	public void setBillError(Boolean billError) {
		this.billError = billError;
	}
	public Boolean getDevError() {
		return devError;
	}
	public void setDevError(Boolean devError) {
		this.devError = devError;
	}
}
