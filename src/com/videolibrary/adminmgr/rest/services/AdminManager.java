package com.videolibrary.adminmgr.rest.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.videolibrary.adminmgr.model.BillingResponse;
import com.videolibrary.adminmgr.model.OperationResponse;
import com.videolibrary.adminmgr.model.Subscriber;
import com.videolibrary.adminmgr.model.UserRequest;
import com.videolibrary.adminmgr.model.UserResponse;
import com.videolibrary.adminmgr.model.Package;

public interface AdminManager {
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/RegisterSubscriber/")
	public OperationResponse RegisterSubcriber(UserRequest userrequest);
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/GetAllSubscribers/")
	public UserResponse GetAllSubscribers();
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/AuthorizeSubscriber/")
	public OperationResponse AuthorizeSubscriber(Subscriber admin);
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/DeAuthorizeSubscriber/")
	public OperationResponse DeAuthorizeSubscriber(Subscriber user);
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/DeleteSubscriber/{loginID}")
	public UserResponse DeleteSubscriber(@PathParam("loginID") String loginID);
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/PaymentPending/{billingID}")
	public OperationResponse PaymentPending(@PathParam("billingID") Integer billlingID);
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/CurrentBillInfo/{billingID}")
	public BillingResponse CurrentBillInfo(@PathParam("billingID") Integer billingID);
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/SubscriberBillInfo/{loginID}")
	public BillingResponse SubscriberBillInfo(@PathParam("loginID") String loginID);
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/GetAllBillInfo/")
	public BillingResponse GetAllBillInfo();
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/ActivateSubscriberDevice/{loginID}")
	public OperationResponse ActivateSubscriberDevice(@PathParam("loginID") String loginID);
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/DeActivateSubscriberDevice/{loginID}")
	public OperationResponse DeActivateSubscriberDevice(@PathParam("loginID") String loginID);

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/SetSubscriberPackage/{loginID}")
	public OperationResponse SetSubscriberPackage(@PathParam("loginID") String loginID,Package userpack);
}
