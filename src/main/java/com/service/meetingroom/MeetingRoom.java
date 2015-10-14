package com.service.meetingroom;

import java.util.List;

public class MeetingRoom {
	private int id;
	private String name;
	private List<BookingStatus> booked;
	
	
	public MeetingRoom() {
	}
	
	public MeetingRoom(int id, String name) {
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
	public List<BookingStatus> getBooked() {
		return booked;
	}

	public void setBooked(List<BookingStatus> booked) {
		this.booked = booked;
	}
	
}
