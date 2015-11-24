package com.videolibrary.adminmgr.dao;



import com.videolibrary.adminmgr.model.BillingResponse;
import com.videolibrary.adminmgr.model.OperationResponse;
import com.videolibrary.adminmgr.model.Subscriber;
import com.videolibrary.adminmgr.model.UserRequest;
import com.videolibrary.adminmgr.model.UserResponse;
import com.videolibrary.adminmgr.model.Package;

public interface WorkFlowManagerDao {
	
	public OperationResponse RegisterSubcriber(UserRequest userrequest);

	public UserResponse GetAllSubscribers();
	
	public OperationResponse AuthorizeSubscriber(Subscriber subscriber);
	
	public OperationResponse DeAuthorizeSubscriber(Subscriber subscriber);
	
	public UserResponse DeleteSubscriber(String LoginID);
	
	public OperationResponse PaymentPending(Integer billingID);
	
	public BillingResponse CurrentBillInfo(Integer billingID);
	
	public BillingResponse SubscriberBillInfo(String LoginID);
	
	public BillingResponse  GetAllBillInfo();
	
	public OperationResponse ActivateSubscriberDevice(String loginID);
	
	public OperationResponse DeActivateSubscriberDevice(String loginID);
	
	public OperationResponse SetSubscriberPackage(String loginID,Package userpack);
}
