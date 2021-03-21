package com.cg.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.dao.TruckDao;
import com.cg.dao.TruckDaoImpl;

public class TruckAppTest {

	TruckDao tDao = new TruckDaoImpl();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testShowTruck() {
		fail("Not yet implemented");
	}

	@Test
	public void testBookTruck() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateBooking() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckMobile() {
		
	}

	@Test
	public void testCheckDateFormat() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckAvailable() {
		fail("Not yet implemented");
	}

}
