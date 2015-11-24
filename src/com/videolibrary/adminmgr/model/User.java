package com.videolibrary.adminmgr.model;



public class User {
	   Integer 	  		id;
       String 	  		Firstname;
       String 	 		Lastname;
       String 	  		Address1;
       String 	  		Address2;
       String           City;
       String           Pin;
       String  	  		Mobile;
       String 	 		Email;
       String 	  		CreditCardNumber;
       Integer 	  		CVV;
       Integer      	packageId;    
       String 			loginId;
       Boolean    		authorized;
       Integer          billingId;
       Integer          deviceId;
       Package          userpack;
       
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getFirstname() {
			return Firstname;
		}
		public void setFirstname(String firstname) {
			Firstname = firstname;
		}
		public String getLastname() {
			return Lastname;
		}
		public void setLastname(String lastname) {
			Lastname = lastname;
		}
		public String getAddress1() {
			return Address1;
		}
		public void setAddress1(String address1) {
			Address1 = address1;
		}
		public String getAddress2() {
			return Address2;
		}
		public void setAddress2(String address2) {
			Address2 = address2;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public String getPin() {
			return Pin;
		}
		public void setPin(String pin) {
			Pin = pin;
		}
		public String getMobile() {
			return Mobile;
		}
		public void setMobile(String mobile) {
			Mobile = mobile;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getCreditCardNumber() {
			return CreditCardNumber;
		}
		public void setCreditCardNumber(String creditCardNumber) {
			CreditCardNumber = creditCardNumber;
		}
		public Integer getCVV() {
			return CVV;
		}
		public void setCVV(Integer cVV) {
			CVV = cVV;
		}
		public Integer getPackageId() {
			return packageId;
		}
		public void setPackageId(Integer packageId) {
			this.packageId = packageId;
		}
		public Boolean getAuthorized() {
			return authorized;
		}
		public void setAuthorized(Boolean authorized) {
			this.authorized = authorized;
		}
		public String getLoginId() {
				return loginId;
		}
		public void setLoginId(String loginId) {
				this.loginId = loginId;
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
		public Package getUserpack() {
			return userpack;
		}
		public void setUserpack(Package userpack) {
			this.userpack = userpack;
		}
		
}
