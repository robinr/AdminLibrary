package com.videolibrary.adminmgr.model;

import java.util.List;

public class BillingResponse {
    private List<Billing> bills;
    private Integer count;
    private Boolean status; // true if record else false
       
	public List<Billing> getBills() {
		return bills;
	}
	public void setBills(List<Billing> bills) {
		this.bills = bills;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
       
       
}
