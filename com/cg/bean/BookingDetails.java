package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="booking_details")
public class BookingDetails {
	@Id
	@SequenceGenerator(allocationSize = 1,name = "book_seq", sequenceName="book_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq")
	private long bookingId;
	private String custId;
	private int truckId;
	private String mobile;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date dateOfBooking;
	private String truckType;
	private int totalCost;

	public BookingDetails(String custId, int truckId,String truckType, String mobile, java.util.Date dateOfBooking, int totalCost) {
		this.custId = custId;
		this.truckId = truckId;
		this.truckType = truckType;
		this.mobile = mobile;
		this.dateOfBooking = dateOfBooking;
		this.totalCost = totalCost;
	}
	
	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
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

	public java.util.Date getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(java.util.Date dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	
	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
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
