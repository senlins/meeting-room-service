package com.service.meetingroom;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeetingRoomDao {
	private static Map<Integer, MeetingRoom_Figaro> meetingRooms = new HashMap<>();

	static {
		Date fromDt1 = new Calendar.Builder().setDate(2015, 9, 14).setTimeOfDay(10, 00, 0).build().getTime();
		Date toDt1 = new Calendar.Builder().setDate(2015, 9, 14).setTimeOfDay(11, 00, 0).build().getTime();
		BookingStatus_Figaro b1 = new BookingStatus_Figaro(fromDt1, toDt1);

		Date fromDt2 = new Calendar.Builder().setDate(2015, 9, 15).setTimeOfDay(16, 00, 0).build().getTime();
		Date toDt2 = new Calendar.Builder().setDate(2015, 9, 15).setTimeOfDay(17, 00, 0).build().getTime();
		BookingStatus_Figaro b2 = new BookingStatus_Figaro(fromDt2, toDt2);
		
		List<BookingStatus_Figaro> booked = new ArrayList<>();
		booked.add(b1);
		booked.add(b2);

		MeetingRoom_Figaro m1 = new MeetingRoom_Figaro(1, "Paradise");
		m1.setBooked_figaro(booked);
		
		MeetingRoom_Figaro m2 = new MeetingRoom_Figaro(2, "SH");
		meetingRooms.put(m1.getId_figaro(), m1);
		meetingRooms.put(m2.getId_figaro(), m2);
	}

	public Collection<MeetingRoom_Figaro> getMeetingRooms() {
		return meetingRooms.values();
	}
	
	public MeetingRoom_Figaro getMeetingRoomById(int id) {
		return meetingRooms.get(id);
	}

	public Collection<MeetingRoom_Figaro> getAvailableMeetingRooms(Date fromDateTime, Date toDateTime) {
		Collection<MeetingRoom_Figaro> c = new ArrayList<MeetingRoom_Figaro>();
		for (MeetingRoom_Figaro room : meetingRooms.values()) {
			if (isAvailable(room, fromDateTime, toDateTime)) {
				c.add(room);
			}
		}
		return c;
	}
	
	private boolean isAvailable(MeetingRoom_Figaro room, Date fromDateTime, Date toDateTime) {
		boolean isAvailable = true;
		
		List<BookingStatus_Figaro> booked = room.getBooked_figaro();
		if (booked != null) {
			for (BookingStatus_Figaro bs : booked) {
				Date from = bs.getFromDateTime_figaro();
				Date to = bs.getToDateTime_Figaro();
				
				if ((fromDateTime.after(from) && fromDateTime.before(to) || (toDateTime.after(from) && toDateTime.before(to)))) {
					isAvailable = false;
					break;
				}
			}
		}
		
		return isAvailable;
	}

}
