package com.videolibrary.adminmgr.model;

import java.util.List;

public class Package {
	     Float    amount;
	     Integer  packageId;
	     List<String> languages;
		
		public List<String> getLanguages() {
			return languages;
		}
		public void setLanguages(List<String> languages) {
			this.languages = languages;
		}
		public Float getAmount() {
			return amount;
		}
		public void setAmount(Float amount) {
			this.amount = amount;
		}
		public Integer getPackageId() {
			return packageId;
		}
		public void setPackageId(Integer packageId) {
			this.packageId = packageId;
		}
}
