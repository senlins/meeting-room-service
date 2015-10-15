package com.service.meetingroom;

import java.util.List;

public class MeetingRoom_Figaro {
	private int id_figaro;
	private String name_figaro;
	private List<BookingStatus_Figaro> booked_figaro;
	
	
	public MeetingRoom_Figaro() {
	}
	
	public MeetingRoom_Figaro(int id_figaro, String name_figaro) {
		super();
		this.id_figaro = id_figaro;
		this.name_figaro = name_figaro;
	}

	public int getId_figaro() {
		return id_figaro;
	}
	public void setId_figaro(int id_figaro) {
		this.id_figaro = id_figaro;
	}
	public String getName_figaro() {
		return name_figaro;
	}
	public void setName_figaro(String name_figaro) {
		this.name_figaro = name_figaro;
	}
	public List<BookingStatus_Figaro> getBooked_figaro() {
		return booked_figaro;
	}

	public void setBooked_figaro(List<BookingStatus_Figaro> booked_figaro) {
		this.booked_figaro = booked_figaro;
	}
	
}
