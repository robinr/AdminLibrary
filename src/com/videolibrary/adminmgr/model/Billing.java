package com.videolibrary.adminmgr.model;

import java.util.Date;

public class Billing {
		Integer id;
		Date	StartDate;
		Date	EndDate;
		Integer Userid;
		String  Status;
		
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
		public Date getEndDate() {
			return EndDate;
		}
		public void setEndDate(Date endDate) {
			EndDate = endDate;
		}
		public Integer getUserid() {
			return Userid;
		}
		public void setUserid(Integer userid) {
			Userid = userid;
		}
		public String getStatus() {
			return Status;
		}
		public void setStatus(String status) {
			Status = status;
		}
		
}
