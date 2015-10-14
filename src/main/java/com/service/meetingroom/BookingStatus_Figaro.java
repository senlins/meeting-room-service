package com.service.meetingroom;

import java.util.Date;

public class BookingStatus_Figaro {
	
	private Date fromDateTime;
	private Date toDateTime;
	
	public BookingStatus_Figaro() {
		// TODO Auto-generated constructor stub
	}
	
	public BookingStatus_Figaro(Date fromDateTime, Date toDateTime) {
		super();
		this.fromDateTime = fromDateTime;
		this.toDateTime = toDateTime;
	}

	public Date getFromDateTime() {
		return fromDateTime;
	}
	public void setFromDateTime(Date fromDateTime) {
		this.fromDateTime = fromDateTime;
	}
	public Date getToDateTime() {
		return toDateTime;
	}
	public void setToDateTime(Date toDateTime) {
		this.toDateTime = toDateTime;
	}
	
	
	
}
