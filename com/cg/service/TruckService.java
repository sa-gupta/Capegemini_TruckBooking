package com.cg.service;

import com.cg.bean.Truck;

public interface TruckService {

	void showTruck();

	boolean isCustIdValid(String custId);

	boolean isValidTruckId(int truckId);

	boolean isTruckAvailable(int truckId,int truckWant);

	boolean isValidMobile(String mobile);

	boolean isValidDate(String date);

	int createBooking(Truck tr, int truckId, int truckWant, String custId, String mobile, String dateStr);

	Truck getTruckObj(int truckId);

	void showBookingDetails();

}
