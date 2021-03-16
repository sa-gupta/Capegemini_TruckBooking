package com.cg.bean;

public class BookingDetails {
	private String custId;
	private int truckId;
	private String mobile;
	private String dateOfBooking;

	public BookingDetails(String custId, int truckId, String mobile, String dateOfBooking) {
		this.custId = custId;
		this.truckId = truckId;
		this.mobile = mobile;
		this.dateOfBooking = dateOfBooking;
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

	@Override
	public String toString() {
		return "BookingDetails [custId=" + custId + ", truckId=" + truckId + ", mobile=" + mobile + ", dateOfBooking="
				+ dateOfBooking + "]\n";
	}

}
