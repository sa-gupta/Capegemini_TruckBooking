package com.cg.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

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
				String idRegex = "^([A-Z]\\d{6})$";
				String custId;
				System.out.println("Book Trucks");
				System.out.println("Enter customer ID : ");
				custId = scan.next();
				if (custId.matches(idRegex)) {
					tService.showTruck();
					tService.bookTruck(custId);
				} else
					System.out.println("Wrong Id Format");
				break;
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
				System.out.println("2. Exit");
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
