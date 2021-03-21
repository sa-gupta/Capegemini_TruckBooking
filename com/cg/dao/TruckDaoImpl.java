package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.bean.BookingDetails;

import com.cg.bean.Truck;
import com.cg.util.DBUtil;
import com.cg.util.TruckException;

public class TruckDaoImpl implements TruckDao {
	private int bookingId = 1100;
	private Map<Integer, BookingDetails> bookingDetailMap = new HashMap<>();
	private Connection conn;

	public TruckDaoImpl() {}

	@Override
	public List<Truck> showTruck() {
		List<Truck> truckList = new ArrayList<>();
		String query = "select * from truck";
		try {
			conn = DBUtil.createConnection();
			PreparedStatement stmt = conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				truckList.add(new Truck(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getInt(6)));
			}
		} catch (SQLException e) {
		} catch (TruckException e) {
			e.printStackTrace();
		}
		return truckList;

	}

	public int createBooking(Truck tr, int truckId, int truckWant, String custId, String mobile, String dateStr) {
		bookingDetailMap.put(bookingId, new BookingDetails(custId, truckId, tr.getTruckType(), mobile, dateStr,
				tr.getCharge() * (double) truckWant));
		tr.setAvailable(tr.getAvailable() - truckWant);
		return bookingId++;
	}

	@Override
	public void showBookingDetails() {
		for (Integer bookInteger : bookingDetailMap.keySet()) {
			System.out.println(bookInteger + "         " + bookingDetailMap.get(bookInteger));
		}

	}

	@Override
	public void closeConnection() throws TruckException {
		DBUtil.closeConnection();

	}
}
