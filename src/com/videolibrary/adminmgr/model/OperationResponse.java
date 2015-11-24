package com.videolibrary.adminmgr.model;

public class OperationResponse {
		String  Operation;
		Integer Id;
		Boolean result;
		
		public String getOperation() {
			return Operation;
		}
		public void setOperation(String operation) {
			Operation = operation;
		}
		public Integer getId() {
			return Id;
		}
		public void setId(Integer id) {
			Id = id;
		}
		public Boolean getResult() {
			return result;
		}
		public void setResult(Boolean result) {
			this.result = result;
		}
}
