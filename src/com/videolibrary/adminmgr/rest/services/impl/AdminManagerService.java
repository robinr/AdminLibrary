package com.videolibrary.adminmgr.rest.services.impl;

import com.videolibrary.adminmgr.dao.WorkFlowManagerDao;
import com.videolibrary.adminmgr.model.BillingResponse;
import com.videolibrary.adminmgr.model.OperationResponse;
import com.videolibrary.adminmgr.model.Subscriber;
import com.videolibrary.adminmgr.model.UserRequest;
import com.videolibrary.adminmgr.model.UserResponse;
import com.videolibrary.adminmgr.model.Package;
import com.videolibrary.adminmgr.rest.services.AdminManager;

public class AdminManagerService implements AdminManager {
	
	WorkFlowManagerDao workflow;

	public WorkFlowManagerDao getWorkflow() {
		return workflow;
	}

	public void setWorkflow(WorkFlowManagerDao workflow) {
		this.workflow = workflow;
	}

	@Override
	public OperationResponse RegisterSubcriber(UserRequest userrequest) {
		// TODO Auto-generated method stub
		return (getWorkflow().RegisterSubcriber(userrequest));
	}

	@Override
	public UserResponse GetAllSubscribers() {
		// TODO Auto-generated method stub
		return (getWorkflow().GetAllSubscribers());
	}

	@Override
	public OperationResponse AuthorizeSubscriber(Subscriber admin) {
		// TODO Auto-generated method stub
		return (getWorkflow().AuthorizeSubscriber(admin));
	}

	@Override
	public OperationResponse DeAuthorizeSubscriber(Subscriber user) {
		// TODO Auto-generated method stub
		return (getWorkflow().DeAuthorizeSubscriber(user));
	}

	@Override
	public UserResponse DeleteSubscriber(String loginID) {
		// TODO Auto-generated method stub
		return (getWorkflow().DeleteSubscriber(loginID));
	}

	@Override
	public OperationResponse PaymentPending(Integer billingID) {
		// TODO Auto-generated method stub
		return (getWorkflow().PaymentPending(billingID));
	}

	@Override
	public BillingResponse CurrentBillInfo(Integer billingID) {
		// TODO Auto-generated method stub
		return (getWorkflow().CurrentBillInfo(billingID));
	}

	@Override
	public BillingResponse SubscriberBillInfo(String loginID) {
		// TODO Auto-generated method stub
		return (getWorkflow().SubscriberBillInfo(loginID));
	}

	@Override
	public BillingResponse GetAllBillInfo() {
		// TODO Auto-generated method stub
		return  (getWorkflow().GetAllBillInfo());
	}

	@Override
	public OperationResponse ActivateSubscriberDevice(String loginID) {
		// TODO Auto-generated method stub
		return  (getWorkflow().ActivateSubscriberDevice(loginID));
	}

	@Override
	public OperationResponse DeActivateSubscriberDevice(String loginID) {
		// TODO Auto-generated method stub
		return  (getWorkflow().DeActivateSubscriberDevice(loginID));
	}

	@Override
	public OperationResponse SetSubscriberPackage(String loginID, Package userpack) {
		// TODO Auto-generated method stub
		return (getWorkflow().SetSubscriberPackage(loginID,userpack));
	}

}
