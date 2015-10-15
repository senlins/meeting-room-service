package com.service.meetingroom;

import java.util.Date;

public class BookingStatus_Figaro {
	
	private Date fromDateTime_figaro;
	private Date toDateTime_Figaro;
	
	public BookingStatus_Figaro() {
		// TODO Auto-generated constructor stub
	}
	
	public BookingStatus_Figaro(Date fromDateTime_figaro, Date toDateTime_Figaro) {
		super();
		this.fromDateTime_figaro = fromDateTime_figaro;
		this.toDateTime_Figaro = toDateTime_Figaro;
	}

	public Date getFromDateTime_figaro() {
		return fromDateTime_figaro;
	}
	public void setFromDateTime_figaro(Date fromDateTime_figaro) {
		this.fromDateTime_figaro = fromDateTime_figaro;
	}
	public Date getToDateTime_Figaro() {
		return toDateTime_Figaro;
	}
	public void setToDateTime_Figaro(Date toDateTime_Figaro) {
		this.toDateTime_Figaro = toDateTime_Figaro;
	}
	
	
	
}
