package com.service.meetingroom;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeetingRoomDao {
	private static Map<Integer, MeetingRoom> meetingRooms = new HashMap<>();

	static {
		Date fromDt1 = new Calendar.Builder().setDate(2015, 9, 14).setTimeOfDay(10, 00, 0).build().getTime();
		Date toDt1 = new Calendar.Builder().setDate(2015, 9, 14).setTimeOfDay(11, 00, 0).build().getTime();
		BookingStatus b1 = new BookingStatus(fromDt1, toDt1);

		Date fromDt2 = new Calendar.Builder().setDate(2015, 9, 15).setTimeOfDay(16, 00, 0).build().getTime();
		Date toDt2 = new Calendar.Builder().setDate(2015, 9, 15).setTimeOfDay(17, 00, 0).build().getTime();
		BookingStatus b2 = new BookingStatus(fromDt2, toDt2);
		
		List<BookingStatus> booked = new ArrayList<>();
		booked.add(b1);
		booked.add(b2);

		MeetingRoom m1 = new MeetingRoom(1, "Paradise");
		m1.setBooked(booked);
		
		MeetingRoom m2 = new MeetingRoom(2, "SH");
		meetingRooms.put(m1.getId(), m1);
		meetingRooms.put(m2.getId(), m2);
	}

	public Collection<MeetingRoom> getMeetingRooms() {
		return meetingRooms.values();
	}
	
	public MeetingRoom getMeetingRoomById(int id) {
		return meetingRooms.get(id);
	}

	public Collection<MeetingRoom> getAvailableMeetingRooms(Date fromDateTime, Date toDateTime) {
		Collection<MeetingRoom> c = new ArrayList<MeetingRoom>();
		for (MeetingRoom room : meetingRooms.values()) {
			if (isAvailable(room, fromDateTime, toDateTime)) {
				c.add(room);
			}
		}
		return c;
	}
	
	private boolean isAvailable(MeetingRoom room, Date fromDateTime, Date toDateTime) {
		boolean isAvailable = true;
		
		List<BookingStatus> booked = room.getBooked();
		if (booked != null) {
			for (BookingStatus bs : booked) {
				Date from = bs.getFromDateTime();
				Date to = bs.getToDateTime();
				
				if ((fromDateTime.after(from) && fromDateTime.before(to) || (toDateTime.after(from) && toDateTime.before(to)))) {
					isAvailable = false;
					break;
				}
			}
		}
		
		return isAvailable;
	}

}
