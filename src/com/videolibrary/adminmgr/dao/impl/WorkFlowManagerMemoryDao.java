package com.videolibrary.adminmgr.dao.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.videolibrary.adminmgr.dao.WorkFlowManagerDao;
import com.videolibrary.adminmgr.model.Billing;
import com.videolibrary.adminmgr.model.BillingResponse;
import com.videolibrary.adminmgr.model.Device;
import com.videolibrary.adminmgr.model.OperationResponse;
import com.videolibrary.adminmgr.model.Subscriber;
import com.videolibrary.adminmgr.model.User;
import com.videolibrary.adminmgr.model.UserRequest;
import com.videolibrary.adminmgr.model.UserResponse;
import com.videolibrary.adminmgr.model.Package;

public class WorkFlowManagerMemoryDao implements WorkFlowManagerDao {
	
	List<User>     allusers   = new ArrayList<User>();
	List<Billing>  allbilling = new ArrayList<Billing>();
	List<Device>   alldevices = new ArrayList<Device>();
	
	
	UserResponse response = new UserResponse();
	BillingResponse billresponse = new BillingResponse();
	
	public WorkFlowManagerMemoryDao()
	{
		User user1, user2, user3, user4, user5;
		Billing bill1, bill2, bill3, bill4, bill5;
		Device device1, device2,device3,device4,device5;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String begindateInString = "01/08/2015";
		String enddateInString = "31/08/2015";
		Date startDate = new Date();
		Date endDate = new Date();
		try {
			startDate = sdf.parse(begindateInString);
			endDate   = sdf.parse(enddateInString);
		}catch (Exception e)
		{
			System.out.println("Date Parse Error");
		}
		
		user1 = new User();
		user1.setAddress1("No 1 Teachers Colony");
		user1.setAddress2("1st Main, Teachers HSBC Layout");
		user1.setCity("Bangalore");
		user1.setPin("560079");
		user1.setFirstname("Sales");
		user1.setLastname("Manager");
		user1.setEmail("sales@infowareconsultants.com");
		user1.setId(1);
		user1.setPackageId(2);
		user1.setBillingId(10);
		user1.setCreditCardNumber("510129829502500");
		user1.setCVV(122);
		user1.setAuthorized(true);
		user1.setLoginId("sales@infowareconsultants.com");
		user1.setMobile("9986031273");
		user1.setDeviceId(0xfffc);
		
		allusers.add(user1);
		
		user2 = new User();
		user2.setAddress1("1912, 15th Cross, 16th Main");
		user2.setAddress2("A Block, AECS Layout, Singhasandra");
		user2.setCity("Bangalore");
		user2.setPin("560068");
		user2.setFirstname("Raghavendra");
		user2.setLastname("R");
		user2.setEmail("raghu@infowareconsultants.com");
		user2.setId(2);
		user2.setPackageId(5);
		user2.setBillingId(15);
		user2.setCreditCardNumber("5201298029802400");
		user2.setCVV(134);
		user2.setAuthorized(true);
		user2.setLoginId("raghu@infowareconsultants.com");
		user2.setMobile("7788903456");
		user2.setDeviceId(0xccca);
		
		allusers.add(user2);
		
		user3 = new User();
		user3.setAddress1("112 6th Main Road");
		user3.setAddress2("Lingarajapuram");
		user3.setCity("Bangalore");
		user3.setPin("560076");
		user3.setFirstname("Vivek");
		user3.setLastname("V. N.");
		user3.setEmail("vivek@infowareconsultants.com");
		user3.setId(3);
		user3.setPackageId(5);
		user3.setBillingId(20);
		user3.setCreditCardNumber("7201298029802411");
		user3.setCVV(122);
		user3.setAuthorized(true);
		user3.setLoginId("vivek@infowareconsultants.com");
		user3.setMobile("9788903456");
		user3.setDeviceId(0xcbca);
		
		allusers.add(user3);
		
		user4 = new User();
		user4.setAddress1("96, 6th Main, Begur Road");
		user4.setAddress2("Bommanhalli");
		user4.setCity("Bangalore");
		user4.setPin("560068");
		user4.setFirstname("Nagendrappa");
		user4.setLastname("K.");
		user4.setEmail("nagendrappa@infowareconsultants.com");
		user4.setId(4);
		user4.setPackageId(5);
		user4.setBillingId(25);
		user4.setCreditCardNumber("9201298029802411");
		user4.setCVV(356);
		user4.setAuthorized(true);
		user4.setLoginId("nagendrappa@infowareconsultants.com");
		user4.setMobile("9788934456");
		user4.setDeviceId(0xdbca);
		
		allusers.add(user4);
		
		user5 = new User();
		user5.setAddress1("122, 12th Main, Old Madras Road");
		user5.setAddress2("Pai Layout");
		user5.setCity("Bangalore");
		user5.setPin("560050");
		user5.setFirstname("Santhosh");
		user5.setLastname("R.");
		user5.setEmail("santhosh@infowareconsultants.com");
		user5.setId(5);
		user5.setPackageId(5);
		user5.setBillingId(30);
		user5.setCreditCardNumber("920155669802411");
		user5.setCVV(786);
		user5.setAuthorized(true);
		user5.setLoginId("santhosh@infowareconsultants.com");
		user5.setMobile("9788934456");
		user5.setDeviceId(0xffca);
		
		allusers.add(user5);
		
		bill1 = new Billing();
		bill1.setId(10);
		bill1.setStartDate(startDate);
		bill1.setEndDate(endDate);
		bill1.setUserid(1);
		bill1.setStatus("paid");
		
		allbilling.add(bill1);
		
		bill2 = new Billing();
		bill2.setId(15);
		bill2.setStartDate(startDate);
		bill2.setEndDate(endDate);
		bill2.setUserid(2);
		bill2.setStatus("paid");
		
		allbilling.add(bill2);
		
		bill3 = new Billing();
		bill3.setId(20);
		bill3.setStartDate(startDate);
		bill3.setEndDate(endDate);
		bill3.setUserid(3);
		bill3.setStatus("paid");
		
		allbilling.add(bill3);
		
		bill4 = new Billing();
		bill4.setId(25);
		bill4.setStartDate(startDate);
		bill4.setEndDate(endDate);
		bill4.setUserid(4);
		bill4.setStatus("not-paid");
		
		allbilling.add(bill4);
		
		bill5 = new Billing();
		bill5.setId(30);
		bill5.setStartDate(startDate);
		bill5.setEndDate(endDate);
		bill5.setUserid(5);
		bill5.setStatus("not-paid");
		
		allbilling.add(bill5);
		
		device1 = new Device();
		device1.setId(0xfffc);
		device1.setDeviceName("Android-Stick");
		device1.setMacAddress("00:0a:95:9d:68:16");
		device1.setStartDate(startDate);
		device1.setUserid(1);
		device1.setActivation(true);
		
		alldevices.add(device1);
		
		device2 = new Device();
		device2.setId(0xccca);
		device2.setDeviceName("Android-Stick");
		device2.setMacAddress("00:0a:59:9d:76:16");
		device2.setStartDate(startDate);
		device2.setUserid(2);
		device2.setActivation(true);
		
		alldevices.add(device2);
		
		device3 = new Device();
		device3.setId(0xcbca);
		device3.setDeviceName("Apple-TV");
		device3.setMacAddress("00:0d:33:9d:88:16");
		device3.setStartDate(startDate);
		device3.setUserid(3);
		device3.setActivation(true);
		
		alldevices.add(device3);
		
		device4 = new Device();
		device4.setId(0xdbca);
		device4.setDeviceName("Android-Stick");
		device4.setMacAddress("00:0c:33:9f:99:16");
		device4.setStartDate(startDate);
		device4.setUserid(4);
		device4.setActivation(false);
		
		alldevices.add(device4);
		
		device5 = new Device();
		device5.setId(0xffca);
		device5.setDeviceName("Apple-TV");
		device5.setMacAddress("00:0c:33:9f:99:16");
		device5.setStartDate(startDate);
		device5.setUserid(5);
		device5.setActivation(false);
		
		alldevices.add(device5);
		
				
	}

	@Override
	public OperationResponse RegisterSubcriber(UserRequest userrequest) {
		 OperationResponse response = new OperationResponse();
		 
		 for(User first : allusers)
		 {
			 if(first.getLoginId().equals(userrequest.getUserInfo().getLoginId()))
			 {
				 response.setId(0);
				 response.setOperation("RegisterSubscriber");
				 response.setResult(false);
				 return response;
			 }
		 }
		 allusers.add(userrequest.getUserInfo());
		 response.setId(0);
		 response.setOperation("RegisterSubscriber");
		 response.setResult(true);
		 return response;
	}

	@Override
	public UserResponse GetAllSubscribers() {
		
		response.setAllusers(allusers);
		response.setDevices(alldevices);
		response.setBillinghistory(allbilling);
		response.setUsrError(false);
		response.setDevError(true);
		response.setBillError(true);
	
		return response;
	}

	@Override
	public OperationResponse AuthorizeSubscriber(Subscriber subscriber) {
		
		OperationResponse response = new OperationResponse();
		
		for(User first : allusers)
		 {
			 if(first.getLoginId().equals(subscriber.getLoginID()))
			 {
				 if(first.getAuthorized() == false)
				 {
					 first.setAuthorized(true);
					 response.setId(0);
					 response.setOperation("AuthorizeSubscriber");
					 response.setResult(true);
					 return response;
				 }
			
			 }
		 }
		 response.setId(0);
		 response.setOperation("AuthorizeSubscriber");
		 response.setResult(false);		 
		 return response;
	}

	@Override
	public OperationResponse DeAuthorizeSubscriber(Subscriber subscriber) {
		OperationResponse response = new OperationResponse();
		
		for(User first : allusers)
		 {
			 if(first.getLoginId().equals(subscriber.getLoginID()))
			 {
				 if(first.getAuthorized() == true)
				 {
					 first.setAuthorized(false);
					 response.setId(0);
					 response.setOperation("DeAuthorizeSubscriber");
					 response.setResult(true);
					 return response;
				 }
			
			 }
		 }
		 response.setId(0);
		 response.setOperation("DeAuthorizeSubscriber");
		 response.setResult(false);		 
		 return response;
	}

	@Override
	public UserResponse DeleteSubscriber(String LoginID) {
		
		for(User first : allusers)
		 {
			 if(first.getLoginId().equals(LoginID))
			 {	
				 allusers.remove(first);
			 }
             
		 }
		response.setAllusers(allusers);
		response.setDevices(alldevices);
		response.setBillinghistory(allbilling);
		response.setUsrError(false);
		response.setDevError(true);
		response.setBillError(true);
		return response;
	}

	@Override
	public OperationResponse PaymentPending(Integer billingID) {
		OperationResponse response = new OperationResponse();
		String token = "not-paid";
		
		for(Billing bill : allbilling)
		{
			if(billingID.equals(bill.getId()))
			{
				if(bill.getStatus().equals(token))
				{
					response.setId(billingID);
					response.setOperation("PaymentPending");
					response.setResult(true);
					return response;
				}
			}
		}
		response.setId(billingID);
		response.setOperation("PaymentPending");
		response.setResult(false);
		return response;
	}

	@Override
	public BillingResponse CurrentBillInfo(Integer billingID) {
		
		List<Billing>  billlist = new ArrayList<Billing>();
		Integer count = 0;
		for(Billing bill : allbilling)
		{
			if(billingID.equals(bill.getId()))
			{
				billlist.add(bill);
				billresponse.setBills(billlist);
				count = count + 1;
				billresponse.setCount(count);
				billresponse.setStatus(true);
			}
		}
		return billresponse;
	}

	@Override
	public BillingResponse SubscriberBillInfo(String LoginID) {	
		Integer billingID = 0;
		
		for(User first : allusers)
		{
			if(first.getLoginId().equals(LoginID))
			{
				billingID = first.getBillingId();
			}
		}
		return (CurrentBillInfo(billingID));
	}

	@Override
	public BillingResponse GetAllBillInfo() {
		
		billresponse.setBills(allbilling);
		billresponse.setCount(allbilling.size());
		billresponse.setStatus(true);
		return billresponse;
	}

	@Override
	public OperationResponse ActivateSubscriberDevice(String loginID) {
		OperationResponse opresponse = new OperationResponse();
		Integer deviceID = 0;
		for(User first : allusers)
		{
			if(first.getLoginId().equals(loginID))
			{
				deviceID = first.getDeviceId();
			}
		}
		
		for(Device dev : alldevices)
		{
			if(dev.getId().intValue() == deviceID.intValue())
			{
				dev.setActivation(true);
				opresponse.setId(0);
				opresponse.setOperation("ActivateSubscriberDevice");
				opresponse.setResult(true);
				return opresponse;
			}
		}
		// TODO Auto-generated method stub
		opresponse.setId(0);
		opresponse.setOperation("ActivateSubscriberDevice");
		opresponse.setResult(false);
		return opresponse;
	}

	@Override
	public OperationResponse DeActivateSubscriberDevice(String loginID) {
		OperationResponse opresponse = new OperationResponse();
		Integer deviceID = 0;
		for(User first : allusers)
		{
			if(first.getLoginId().equals(loginID))
			{
				deviceID = first.getDeviceId();
			}
		}
		
		for(Device dev : alldevices)
		{
			if(dev.getId().intValue() == deviceID.intValue())
			{
				dev.setActivation(false);
				opresponse.setId(0);
				opresponse.setOperation("DeActivateSubscriberDevice");
				opresponse.setResult(true);
				return opresponse;
			}
		}
		opresponse.setId(0);
		opresponse.setOperation("DeActivateSubscriberDevice");
		opresponse.setResult(false);
		return opresponse;
	}


	@Override
	public OperationResponse SetSubscriberPackage(String loginID, Package userpack) {
		// TODO Auto-generated method stub
		OperationResponse opresponse = new OperationResponse();
	
		for(User first : allusers)
		{
			if(first.getLoginId().equals(loginID))
			{
				first.setUserpack(userpack);
				opresponse.setId(0);
				opresponse.setOperation("SetSubscriberPackage");
				opresponse.setResult(true);
				return opresponse;
			}
		}
		opresponse.setId(0);
		opresponse.setOperation("SetSubscriberPackage");
		opresponse.setResult(false);
		return opresponse;
	}
}
