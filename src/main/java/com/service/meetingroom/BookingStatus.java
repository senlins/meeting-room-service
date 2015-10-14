package com.service.meetingroom;

import java.util.Date;

public class BookingStatus {
	
	private Date fromDateTime;
	private Date toDateTime;
	
	public BookingStatus() {
		// TODO Auto-generated constructor stub
	}
	
	public BookingStatus(Date fromDateTime, Date toDateTime) {
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
