package com.cg.bean;

public class BookingDetails {
	private String custId;
	private int truckId;
	private String mobile;
	private String dateOfBooking;
	private String truckType;
	private Double totalCost;

	public BookingDetails(String custId, int truckId,String truckType, String mobile, String dateOfBooking, Double totalCost) {
		this.custId = custId;
		this.truckId = truckId;
		this.truckType = truckType;
		this.mobile = mobile;
		this.dateOfBooking = dateOfBooking;
		this.totalCost = totalCost;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	
	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	
	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-18s%-12s%-12s%f",custId,truckType,mobile,dateOfBooking,totalCost);
//		return "BookingDetails [custId=" + custId + ", truckId=" + truckId + ", mobile=" + mobile + ", dateOfBooking="
//				+ dateOfBooking + "]\n";
	}

}
