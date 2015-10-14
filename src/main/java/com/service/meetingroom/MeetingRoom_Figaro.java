package com.service.meetingroom;

import java.util.List;

public class MeetingRoom_Figaro {
	private int id;
	private String name;
	private List<BookingStatus_Figaro> booked;
	
	
	public MeetingRoom_Figaro() {
	}
	
	public MeetingRoom_Figaro(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<BookingStatus_Figaro> getBooked() {
		return booked;
	}

	public void setBooked(List<BookingStatus_Figaro> booked) {
		this.booked = booked;
	}
	
}
