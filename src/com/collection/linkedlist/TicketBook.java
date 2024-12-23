package com.collection.linkedlist;

import java.util.LinkedList;

public class TicketBook {

	LinkedList<Integer> avaialbleSeats = new LinkedList<Integer>();
	LinkedList<Integer> reservedSeats = new LinkedList<Integer>();
	int totalSeats;

	public TicketBook() {
		// TODO Auto-generated constructor stub
		initializeSeats();
	}

	private void initializeSeats() {
		for (int i = 1; i <= 20; i++) {
			avaialbleSeats.add(i);
		}
	}

	public void displaySeats() {
		System.out.println("\n--- Train Seat Layout ---");
		System.out.print("Available Seats: ");
		if (avaialbleSeats.isEmpty()) {
			System.out.print("None");
		} else {
			for (int seat : avaialbleSeats) {
				System.out.print(seat + " ");
			}
		}
		System.out.println();

		System.out.print("Reserved Seats: ");
		if (reservedSeats.isEmpty()) {
			System.out.print("None");
		} else {
			for (int seat : reservedSeats) {
				System.out.print(seat + " ");
			}
		}
		System.out.println("\n-------------------------");
	}

	

	public static void main(String[] args) {

		TicketBook t = new TicketBook();
		t.displaySeats();
	}
}
