package com.cg.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.bean.Truck;
import com.cg.service.TruckService;
import com.cg.service.TruckServiceImpl;

public class TruckMain {
	TruckService tService;

	public TruckMain() {
		tService = new TruckServiceImpl();
	}

	private void execute() {

		while (true) {
			Scanner scan = new Scanner(System.in);
			int choice = getChoice(scan);
			switch (choice) {
			case 1:
				try {
					String custId;
					int truckId;
					String mobile;
					String date;
					Truck tr;
					System.out.println("Book Trucks");
					System.out.println("Enter customer ID : ");
					custId = scan.next();
					if (tService.isCustIdValid(custId)) {
						System.out.println("Please see the truck details below ");
						System.out.println("TruckId    TruckType         Origin     Destination     Charge    AvailableNos");
						tService.showTruck();
						System.out.println("Please Enter the Truck ID : ");
						truckId = scan.nextInt();
						if(tService.isValidTruckId(truckId)) {
							tr = tService.getTruckObj(truckId);
							System.out.println("Enter the no. of Trucks : ");
							int truckWant = scan.nextInt();
							if(tService.isTruckAvailable(truckId,truckWant)) {
								System.out.println("Enter customer mobile : ");
								mobile = scan.next();
								if(tService.isValidMobile(mobile)) {
									System.out.println("Enter Date of Transportation (YYYY-MM-DD): ");
									date = scan.next();
									if(tService.isValidDate(date)) {
										System.out.println("Thank you. Your booking Id is ."+tService.createBooking(tr,truckId,truckWant,custId,mobile,date));
									}else
										System.out.println("Date is not correct.");
								}else
									System.out.println("Mobileno. should be of 10 digit. ");
							}else
								System.out.println("Given number of trucks is/are not available.");
						}else
							System.out.println("Given Truck Id doesn't Exist.");
					} else
						System.out.println("Wrong Id Format");

				}catch(InputMismatchException e) {
					System.out.println("Wrong Input !");
				}
				break;
//			case 2:
//				System.out.println("List of Bookings :- ");
//				System.out.println("BookingId    CustId         TruckType     Mobile     DateOfBooking    TotalCost");
//				tService.showBookingDetails();
//				break;
			case 2:
				System.out.println("Exiting System, Thank You for Using ");
				System.exit(0);
				break;
			default:
				System.out.println("Enter Correct Choice");
				break;
			}
		}
	}

	private int getChoice(Scanner scan) {
		int choice = 0;
		while (choice == 0) {
			try {
				System.out.println("** WELCOME to TRUCK BOOKING SYSTEM **");
				System.out.println("Enter Your Choice : ");
				System.out.println("1. Book Trucks");
//				System.out.println("2. Show Truck Details");
//				System.out.println("2. All Booking Details");
				System.out.println("2. Exit");
				System.out.println("-------------------------------------");
				choice = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Enter Correct Choice !");
				scan.next();
			}
		}

		return choice;
	}

	public static void main(String[] args) {
		new TruckMain().execute();
	}

}
