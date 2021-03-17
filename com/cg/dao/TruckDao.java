package com.cg.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.bean.Truck;

public interface TruckDao {

	public Map<Integer, Truck> truckMap = new HashMap<>();
	
	void showTruck();

	int createBooking(Truck tr, int truckId, int truckWant, String custId, String mobile, String dateStr);

	void showBookingDetails();

}
