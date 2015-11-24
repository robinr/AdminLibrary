package com.videolibrary.adminmgr.model;

public class UserRequest {
	   User     userInfo;
	   Billing  billInfo;
	   Device   deviceInfo;
	   Integer  userId;
	   Integer  subscriberId;
	   Integer  billingId;
       Integer  deviceId;
       
	public User getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}
	public Billing getBillInfo() {
		return billInfo;
	}
	public void setBillInfo(Billing billInfo) {
		this.billInfo = billInfo;
	}
	public Device getDeviceInfo() {
		return deviceInfo;
	}
	public void setDeviceInfo(Device deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(Integer subscriberId) {
		this.subscriberId = subscriberId;
	}
	public Integer getBillingId() {
		return billingId;
	}
	public void setBillingId(Integer billingId) {
		this.billingId = billingId;
	}
	public Integer getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}
       
}
