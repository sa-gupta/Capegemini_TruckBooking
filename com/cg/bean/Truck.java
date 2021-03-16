package com.cg.bean;

public class Truck {

	private String truckType;
	private String origin;
	private String destination;
	private int charge;
	private int available;

	public Truck(String truckType, String origin, String destination, int charge, int available) {
		this.truckType = truckType;
		this.origin = origin;
		this.destination = destination;
		this.charge = charge;
		this.available = available;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return " truckType=" + truckType + ", origin=" + origin + ", destination=" + destination + ", charge=" + charge
				+ ", available=" + available + "]\n";
	}
}
